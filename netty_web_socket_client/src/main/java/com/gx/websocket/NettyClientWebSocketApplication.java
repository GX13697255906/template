package com.gx.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class NettyClientWebSocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(NettyClientWebSocketApplication.class, args);
    }

}
