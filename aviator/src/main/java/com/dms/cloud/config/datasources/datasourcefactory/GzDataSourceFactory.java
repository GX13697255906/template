package com.dms.cloud.config.datasources.datasourcefactory;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

//@Component
public class GzDataSourceFactory {

    /**
     * 贵州-电能量市场数据源
     *
     * @return
     */
    @Bean(name = "gzel")
    @ConfigurationProperties(prefix = "spring.datasource.gzel")
    public DataSource gzEl() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 贵州-调频市场数据源
     *
     * @return
     */
    @Bean(name = "gzfm")
    @ConfigurationProperties(prefix = "spring.datasource.gzfm")
    public DataSource gzFm() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 贵州-调峰市场数据源
     *
     * @return
     */
    @Bean(name = "gzpr")
    @ConfigurationProperties(prefix = "spring.datasource.gzpr")
    public DataSource gzPr() {
        return DruidDataSourceBuilder.create().build();
    }

}
