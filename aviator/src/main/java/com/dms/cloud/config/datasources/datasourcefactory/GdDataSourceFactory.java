package com.dms.cloud.config.datasources.datasourcefactory;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class GdDataSourceFactory {

    /**
     * 广东-电能量市场数据源
     *
     * @return
     */
    @Bean(name = "gdel")
    @ConfigurationProperties(prefix = "spring.datasource.gdel")
    public DataSource gdEl() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 广东-调频市场数据源
     *
     * @return
     */
    @Bean(name = "gdfm")
    @ConfigurationProperties(prefix = "spring.datasource.gdfm")
    public DataSource gdFm() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 广东-调峰市场数据源
     *
     * @return
     */
    @Bean(name = "gdpr")
    @ConfigurationProperties(prefix = "spring.datasource.gdpr")
    public DataSource gdPr() {
        return DruidDataSourceBuilder.create().build();
    }

}
