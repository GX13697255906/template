package com.gx.websocket.common.rabbitmq.rtest;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeoutException;

/**
 * @author Administrator
 */
public class RabbitMqConfiguration {

    public static SortedSet<Long> confirmSet = Collections.synchronizedSortedSet(new TreeSet<Long>());

    private ConnectionFactory factory = new ConnectionFactory();
    private Connection connection;
    public Channel channel;

    public RabbitMqConfiguration() {
        factory.setHost("172.16.0.118");
        factory.setPort(5672);
        factory.setVirtualHost("fx");
        factory.setUsername("fx");
        factory.setPassword("123456");
        try {
            connection = factory.newConnection();
            channel = connection.createChannel();
//          开启confirm确认模式，
//          通过实现 ConfirmCallback 接口，消息发送到 Broker 后触发回调，确认消息是否到达 Broker 服务器，也就是只确认是否正确到达 Exchange 中
            channel.confirmSelect();
//            添加监听
            channel.addConfirmListener(new ConfirmListener() {
                @Override
                public void handleAck(long deliveryTag, boolean multiple) throws IOException {
                    // multiple 是true 表示成功了插入了多个消息返回最后一个消息的id
                    if (multiple) {
                        // clear 清除 最后一个消息之前的队列
                        confirmSet.headSet(deliveryTag + 1).clear();
                    } else {
                        confirmSet.remove(deliveryTag);
                    }
                }

                @Override
                public void handleNack(long deliveryTag, boolean multiple) throws IOException {
                    System.out.println("Nack, SeqNo: " + deliveryTag + ", multiple: " + multiple);
                    // multiple 是true 表示失败了多个消息返回最后一个消息的id
                    if (multiple) {
                        // clear 清除 最后一个消息之前的队列
                        confirmSet.headSet(deliveryTag + 1).clear();
                    } else {
                        confirmSet.remove(deliveryTag);
                    }
                }
            });

//    Return Listener用于处理一些不可路由的消息。
//　　我们的消息生产者，通过指定一个Exchange和Routingkey，把消息送到某一个队列中，
//　　然后我们的消费者监听队列，进行消息处理操作。
//　　但是在某些情况下，如果我们在发送消息的时候，当前的exchange不存在或者指定的路由key路由不到，
//　　这个时候我们需要监听这种不可达的消息，就要使用return listener。
//　　在基础API中有一个关键的配置项：
//            channel.basicPublish  时设置 Mandatory
//　　　　Mandatory：如果为true，则监听会接收到路由不可达的消息，然后进行后续处理，
//　　　　　　　　　　如果为false，那么broker端自动删除该消息。（默认false）
            channel.addReturnListener(new ReturnListener() {
                @Override
                public void handleReturn(int replyCode, String replyText, String exchange,
                                         String routingKey, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    System.err.println("---------handle  return----------");
                    System.err.println("replyCode: " + replyCode);
                    System.err.println("replyText: " + replyText);
                    System.err.println("exchange: " + exchange);
                    System.err.println("routingKey: " + routingKey);
                    System.err.println("properties: " + properties);
                    System.err.println("body: " + new String(body));
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

}
