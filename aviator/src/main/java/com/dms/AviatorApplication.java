package com.dms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(basePackages = {"com.dms.cloud.mapper"})
public class AviatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AviatorApplication.class, args);
    }

}
