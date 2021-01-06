package com.gx.common.rebbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Map;

@Component
public class RabbitLister {

    /**
     * 直连型交换机监听器
     * @param map
     */
    @RabbitListener(queues = DirectRabbitConfig.DIRECT_RABBIT_NAME_QUEUE)
    public void directReceiver(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("--------------------" + entry.getKey() + " : " + entry.getValue() + "--------------------");
        }
    }

    @RabbitListener(queues = FanoutRabbitConfig.FANOUT_RABBIT_NAME_ONE_QUEUE)
    public void fanoutOneReceiver(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("--------------------"+FanoutRabbitConfig.FANOUT_RABBIT_NAME_ONE_QUEUE+" " + entry.getKey() + " : " + entry.getValue() + "--------------------");
        }
    }

    @RabbitListener(queues = FanoutRabbitConfig.FANOUT_RABBIT_NAME_TWO_QUEUE)
    public void fanoutTwoReceiver(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("--------------------"+FanoutRabbitConfig.FANOUT_RABBIT_NAME_TWO_QUEUE+" " + entry.getKey() + " : " + entry.getValue() + "--------------------");
        }
    }

    @RabbitListener(queues = FanoutRabbitConfig.FANOUT_RABBIT_NAME_THREE_QUEUE)
    public void fanoutThreeReceiver(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("--------------------"+FanoutRabbitConfig.FANOUT_RABBIT_NAME_THREE_QUEUE+" " + entry.getKey() + " : " + entry.getValue() + "--------------------");
        }
    }

}
