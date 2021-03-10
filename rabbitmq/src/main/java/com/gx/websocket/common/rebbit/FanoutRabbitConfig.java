package com.gx.websocket.common.rebbit;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 扇型交换机
 */
@Configuration
public class FanoutRabbitConfig {

    public static final String FANOUT_RABBIT_NAME_ONE_QUEUE = "fanout_rabbit_name_one_queue";

    public static final String FANOUT_RABBIT_NAME_TWO_QUEUE = "fanout_rabbit_name_two_queue";

    public static final String FANOUT_RABBIT_NAME_THREE_QUEUE = "fanout_rabbit_name_three_queue";

    public static final String FANOUT_RABBIT_NAME_EXCHANGE = "fanout_rabbit_name_exchange";

    public static final String FANOUT_ROUTING = "fanout_routing";

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(FANOUT_RABBIT_NAME_EXCHANGE);
    }

    @Bean
    public Queue fanoutOneQueue() {
        return new Queue(FANOUT_RABBIT_NAME_ONE_QUEUE);
    }

    @Bean
    public Queue fanoutTwoQueue() {
        return new Queue(FANOUT_RABBIT_NAME_TWO_QUEUE);
    }
    @Bean
    public Queue fanoutThreeQueue() {
        return new Queue(FANOUT_RABBIT_NAME_THREE_QUEUE);
    }


    @Bean
    Binding fanoutOneBinding() {
        return BindingBuilder.bind(fanoutOneQueue()).to(fanoutExchange());
    }

    @Bean
    Binding fanoutTwoBinding() {
        return BindingBuilder.bind(fanoutTwoQueue()).to(fanoutExchange());
    }

    @Bean
    Binding fanoutThreeBinding() {
        return BindingBuilder.bind(fanoutThreeQueue()).to(fanoutExchange());
    }

}
