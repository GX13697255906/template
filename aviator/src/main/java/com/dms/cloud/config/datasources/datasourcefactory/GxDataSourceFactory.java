package com.dms.cloud.config.datasources.datasourcefactory;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

//@Component
public class GxDataSourceFactory {

    /**
     * 广西-电能量市场数据源
     *
     * @return
     */
    @Bean(name = "gxel")
    @ConfigurationProperties(prefix = "spring.datasource.gxel")
    public DataSource gxEl() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 广西-调频市场数据源
     *
     * @return
     */
    @Bean(name = "gxfm")
    @ConfigurationProperties(prefix = "spring.datasource.gxfm")
    public DataSource gxFm() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 广西-调峰市场数据源
     *
     * @return
     */
    @Bean(name = "gxpr")
    @ConfigurationProperties(prefix = "spring.datasource.gxpr")
    public DataSource gxPr() {
        return DruidDataSourceBuilder.create().build();
    }

}
