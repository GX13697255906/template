package com.dms.cloud.config.datasources.datasourcefactory;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

//@Component
public class HnDataSourceFactory {

    /**
     * 海南-电能量市场数据源
     *
     * @return
     */
    @Bean(name = "hnel")
    @ConfigurationProperties(prefix = "spring.datasource.hnel")
    public DataSource hnEl() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 海南-调频市场数据源
     *
     * @return
     */
    @Bean(name = "hnfm")
    @ConfigurationProperties(prefix = "spring.datasource.hnfm")
    public DataSource hnFm() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 海南-调峰市场数据源
     *
     * @return
     */
    @Bean(name = "hnpr")
    @ConfigurationProperties(prefix = "spring.datasource.hnpr")
    public DataSource hnPr() {
        return DruidDataSourceBuilder.create().build();
    }

}
