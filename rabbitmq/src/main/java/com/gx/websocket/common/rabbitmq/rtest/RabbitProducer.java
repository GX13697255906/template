package com.gx.websocket.common.rabbitmq.rtest;

import com.gx.websocket.common.constants.RabbitDetailsEnum;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;
import sun.reflect.generics.tree.Tree;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Administrator
 */
public class RabbitProducer {


    public static void main(String[] args) {
        RabbitProducer producer = new RabbitProducer();
        producer.directProducer();
    }

    /**
     * rabbitmq 直连型交换机 生产者
     */
    public void directProducer() {
        RabbitMQConfiguration configuration = new RabbitMQConfiguration();
        Channel channel = configuration.channel;
        String msg = "Direct Exchange Message";
        try {
            System.out.println("生产者投放信息： " + msg);
//            // 发送消息之前 先获取该消息得标识
            long nextSeqNo = channel.getNextPublishSeqNo();
            boolean mandatory = true;
            channel.basicPublish(RabbitDetailsEnum.DIRECT_LOG.getExchange(), RabbitDetailsEnum.DIRECT_LOG.getRoutingKey(), mandatory, MessageProperties.PERSISTENT_TEXT_PLAIN, msg.getBytes());
            RabbitMQConfiguration.confirmSet.add(nextSeqNo);
            if (channel.waitForConfirms()) {
                System.out.println("confirm ： 消息投递成功");
            } else {
                System.out.println("confirm ： 消息投递失败，需要重新发送或确认");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

}
