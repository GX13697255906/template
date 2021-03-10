package com.gx.websocket.common.rebbit;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 主体型交换机
 */
@Configuration
public class TopicRabbitConfig {

    public static final String TOPIC_QUEUE = "topic_queue";

    public static final String TOPIC_EXCHANGE = "topic_exchange";

    public static final String DIRECT_ROUTING = "test_direct_routing";

    @Bean
    public Queue topicQueueRabbit() {
        return new Queue(TOPIC_QUEUE);
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(TOPIC_EXCHANGE);
    }

}
