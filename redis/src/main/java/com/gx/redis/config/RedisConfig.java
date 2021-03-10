package com.gx.redis.config;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.io.Serializable;
import java.time.Duration;

/**
 * @author guoxun
 * <p>
 * redis配置类
 */
@Configuration
public class RedisConfig {


    @Bean
    public RedisTemplate<String, Serializable> redisTemplate() {
        RedisTemplate<String, Serializable> redisTemplate = new RedisTemplate<>();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setConnectionFactory(getConnectionFactory());
        return redisTemplate;
    }

    /**
     * 获取连接
     *
     * @return
     */
    @Bean
    public RedisConnectionFactory getConnectionFactory() {
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
        configuration.setHostName("127.0.0.1");
        configuration.setPort(6379);
        configuration.setDatabase(0);
        LettuceConnectionFactory factory = new LettuceConnectionFactory(configuration);

//        factory = new LettuceConnectionFactory(configuration, getPoolConfig());
        return factory;
    }

//    /**
//     * 获取缓存连接池
//     *
//     * @return
//     */
//    @Bean
//    public LettucePoolingClientConfiguration getPoolConfig() {
//        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
//        config.setMaxTotal(maxTotal);
//        config.setMaxWaitMillis(maxWait);
//        config.setMaxIdle(maxIdle);
//        config.setMinIdle(minIdle);
//        LettucePoolingClientConfiguration pool = LettucePoolingClientConfiguration.builder()
//                .poolConfig(config)
//                .commandTimeout(Duration.ofMillis(timeout))
//                .shutdownTimeout(Duration.ofMillis(shutdown))
//                .build();
//        return pool;
//    }


}
