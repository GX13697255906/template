package com.gx.websocket.common.rabbitmq.rtest;

import com.gx.websocket.common.constants.RabbitDetailsEnum;
import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * @author Administrator
 */
public class RabbitConsumer {

    public static void main(String[] args) {
        RabbitConsumer consumer = new RabbitConsumer();
        consumer.directConsumer();
    }

    public void directConsumer() {
        RabbitMQConfiguration configuration = new RabbitMQConfiguration();
        Channel channel = configuration.channel;
        try {
//            声明交换机
//            参数说明：
//            exchange：交换机名称
//            type：交换机类型，常见的如fanout、direct、topic
//            durable：设置是否持久化。durable设置true表示持久化，反之是持久化。持久化可以将将换机存盘，在服务器重启时不会丢失相关信息
//            autoDelete：设置是否自动删除。autoDelete设置为true则表示自动删除。自动删除的前提是至少有一个队列或者交换机与这个交换器绑定的队列或者交换器都与之解绑
//            internal：设置是否内置的。如果设置为true，则表示是内置的交换器，客户端程序无法直接发送消息到这个交换器中，只能通过交换器路由到交换器这种方式
//            argument：其他一些结构化参数，比如alternate-exchange
            channel.exchangeDeclare(RabbitDetailsEnum.DIRECT_LOG.getExchange(), RabbitDetailsEnum.DIRECT_LOG.getExchangeType(), true, false, false, null);
//            声明队列
//            方法的参数详细说明如下:
//            queue: 队列的名称
//            durable: 设置是否持久化, true表示队列为持久化, 持久化的队列会存盘, 在服务器重启的时候会保证不丢失相关信息
//            exclusive: 设置是否排他, true表示队列为排他的, 如果一个队列被设置为排他队列, 该队列仅对首次声明它的连接可见, 并在连接断开时自动删除, (这里需要注意三点:1.排他队列是基于连接Connection可见的, 同一个连接的不同信道Channel是可以同时访问同一连接创建的排他队列;"首次"是指如果一个连接己经声明了一个排他队列，其他连接是不允许建立同名的排他队列的，这个与普通队列不同;即使该队列是持久化的，一旦连接关闭或者客户端退出，该排他队列都会被自动删除，这种队列适用于一个客户端同时发送和读取消息的应用场景)
//            autoDelete: 设置是否自动删除。为true 则设置队列为自动删除。自动删除的前提是, 至少有一个消费者连接到这个队列，之后所有与这个队列连接的消费者都断开时，才会自动删除。不能把这个参数错误地理解为: "当连接到此队列的所有客户端断开时，这个队列自动删除"，因为生产者客户端创建这个队列，或者没有消费者客户端与这个队列连接时，都不会自动删除这个队列。
//            arguments: 设置队列的其他一些参数, 如 x-message-ttl等
            channel.queueDeclare(RabbitDetailsEnum.DIRECT_LOG.getQueue(), true, false, false, null);
//            绑定交换机
            channel.queueBind(RabbitDetailsEnum.DIRECT_LOG.getQueue(), RabbitDetailsEnum.DIRECT_LOG.getExchange(), RabbitDetailsEnum.DIRECT_LOG.getRoutingKey());
//            创建消费者
            Consumer consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String msg = new String(body, "UTF-8");
                    System.out.println("消费端：" + msg);
//                    58行  basicConcume  autoAck为false时,进行手动确认  保证队列到消费端的成功消费
                    channel.basicAck(envelope.getDeliveryTag(), false);
                }
            };
            /**
             * 启动一个消费者，并返回服务端生成的消费者标识
             * queue:队列名
             * autoAck：true 接收到传递过来的消息后acknowledged（应答服务器），false 接收到消息后不应答服务器
             * callback: 消费者对象的回调接口
             * @return 服务端生成的消费者标识
             */
//            channel.basicConsume(RabbitDetailsEnum.DIRECT_LOG.getQueue(), true, consumer);
            channel.basicConsume(RabbitDetailsEnum.DIRECT_LOG.getQueue(), false, consumer);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
