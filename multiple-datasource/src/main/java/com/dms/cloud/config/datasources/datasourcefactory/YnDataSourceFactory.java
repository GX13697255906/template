package com.dms.cloud.config.datasources.datasourcefactory;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

//@Component
public class YnDataSourceFactory {

    /**
     * 云南-电能量市场数据源
     *
     * @return
     */
    @Bean(name = "ynel")
    @ConfigurationProperties(prefix = "spring.datasource.ynel")
    public DataSource ynEl() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 海南-调频市场数据源
     *
     * @return
     */
    @Bean(name = "ynfm")
    @ConfigurationProperties(prefix = "spring.datasource.ynfm")
    public DataSource ynFm() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 海南-调峰市场数据源
     *
     * @return
     */
    @Bean(name = "ynpr")
    @ConfigurationProperties(prefix = "spring.datasource.ynpr")
    public DataSource ynPr() {
        return DruidDataSourceBuilder.create().build();
    }

}
