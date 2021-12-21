package com.gx.websocket.common.rabbitmq.rtest;

import com.gx.websocket.common.constants.RabbitDetailsEnum;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author Administrator
 */
public class RabbitProducer {


    public static void main(String[] args) {
        RabbitProducer producer = new RabbitProducer();
//        producer.directProducer();
//        producer.fanoutProducer();
        producer.topicProducer();
    }


    /**
     * rabbitmq 直连型交换机 生产者
     * Direct Exchange 直连的方式 把消息路由到那些 BindingKey RoutingKey 完全匹配的队列中
     */
    public void directProducer() {
        RabbitMqConfiguration configuration = new RabbitMqConfiguration();
        Channel channel = configuration.channel;
        String msg = "Direct Exchange Message";
        try {
            System.out.println("生产者投放信息： " + msg);
//            // 发送消息之前 先获取该消息得标识
            long nextSeqNo = channel.getNextPublishSeqNo();
            boolean mandatory = true;
            channel.basicPublish(RabbitDetailsEnum.DIRECT_LOG.getExchange(), RabbitDetailsEnum.DIRECT_LOG.getRoutingKey(), mandatory, MessageProperties.PERSISTENT_TEXT_PLAIN, msg.getBytes());
            RabbitMqConfiguration.confirmSet.add(nextSeqNo);
            if (channel.waitForConfirms()) {
                System.out.println("confirm ： 消息投递成功");
            } else {
                System.out.println("confirm ： 消息投递失败，需要重新发送或确认");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * rabbitmq 扇型交换机 生产者
     * Fanout Exchange : 不处理任何的路由键，它会把所有发送到该交换器的消息路由到所有与该交换器绑定的队列中
     */
    public void fanoutProducer() {
        RabbitMqConfiguration configuration = new RabbitMqConfiguration();
        Channel channel = configuration.channel;
        String msg = "Fanout Exchange Message";
        try {
            System.out.println("生产者投放信息： " + msg);
//            // 发送消息之前 先获取该消息得标识
            long nextSeqNo = channel.getNextPublishSeqNo();
            boolean mandatory = true;
            String routingKey = RabbitDetailsEnum.FANOUT_API_0.getRoutingKey();
            String exchange = RabbitDetailsEnum.FANOUT_API_0.getExchange();
            for (int i = 0; i < 50; i++) {
                channel.basicPublish(exchange, routingKey, mandatory, null, msg.getBytes());
                RabbitMqConfiguration.confirmSet.add(nextSeqNo);
                if (channel.waitForConfirms()) {
                    System.out.println("confirm ： 消息投递成功");
                } else {
                    System.out.println("confirm ： 消息投递失败，需要重新发送或确认");
                }
            }
            channel.close();
        } catch (IOException | InterruptedException | TimeoutException e) {
            e.printStackTrace();
        }
    }

    /**
     * rabbitmq 主题型交换机 生产者
     * Topic Exchange : 不处理任何的路由键，它会把所有发送到该交换器的消息路由到所有与该交换器绑定的队列中
     */
    public void topicProducer() {
        RabbitMqConfiguration configuration = new RabbitMqConfiguration();
        Channel channel = configuration.channel;
        String msg = "Topic Exchange Message";
        try {
            System.out.println("生产者投放信息： " + msg);
//            // 发送消息之前 先获取该消息得标识
            long nextSeqNo = channel.getNextPublishSeqNo();
            boolean mandatory = true;
            String routingKey = RabbitDetailsEnum.TOPIC_LOG_0.getRoutingKey();
            String exchange = RabbitDetailsEnum.TOPIC_LOG_0.getExchange();
            for (int i = 0; i < 50; i++) {
                channel.basicPublish(exchange, routingKey, mandatory, null, msg.getBytes());
                RabbitMqConfiguration.confirmSet.add(nextSeqNo);
                if (channel.waitForConfirms()) {
                    System.out.println("confirm ： 消息投递成功");
                } else {
                    System.out.println("confirm ： 消息投递失败，需要重新发送或确认");
                }
            }
            channel.close();
        } catch (IOException | InterruptedException | TimeoutException e) {
            e.printStackTrace();
        }
    }

}
