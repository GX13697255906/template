package com.gx.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author guoxun
 * @des 使用redis和aop是想分布式锁，以此实现防止请求的重复提交
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

}
