package com.gx.websocket.common.rebbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 直连型交换机
 */
@Configuration
public class DirectRabbitConfig {

    public static final String DIRECT_RABBIT_NAME_QUEUE = "test_direct_rabbit_name_queue";

    public static final String DIRECT_RABBIT_NAME_EXCHANGE = "test_direct_rabbit_name_exchange";

    public static final String DIRECT_ROUTING = "test_direct_routing";

    @Bean
    public Queue testQueueRabbit() {
        return new Queue(DIRECT_RABBIT_NAME_QUEUE);
    }

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(DIRECT_RABBIT_NAME_EXCHANGE);
    }

    @Bean
    Binding directBinding() {
        return BindingBuilder.bind(testQueueRabbit()).to(directExchange()).with(DIRECT_ROUTING);
    }

}
