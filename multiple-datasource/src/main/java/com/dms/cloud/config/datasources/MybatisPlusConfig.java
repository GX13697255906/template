package com.dms.cloud.config.datasources;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@MapperScan("com.dms.cloud.mapper")
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }

    /**
     * 创建电能量市场数据源
     *
     * @return
     */
    @Bean(name = "gdel")
    @ConfigurationProperties(prefix = "spring.datasource.gdel")
    public DataSource gdEl() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 创建调频市场数据源
     *
     * @return
     */
    @Bean(name = "gdfm")
    @ConfigurationProperties(prefix = "spring.datasource.gdfm")
    public DataSource gdFm() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 创建调峰市场数据源
     *
     * @return
     */
    @Bean(name = "gdpr")
    @ConfigurationProperties(prefix = "spring.datasource.gdpr")
    public DataSource gdPr() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 动态切换数据源
     */
    @Bean
    @Primary
    public DataSource multipleDataSource(@Qualifier(value = "gdel") DataSource gdel,
                                         @Qualifier(value = "gdfm") DataSource gdfm,
                                         @Qualifier(value = "gdpr") DataSource gdpr) {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put("gdel", gdel);
        targetDataSources.put("gdfm", gdfm);
        targetDataSources.put("gdpr", gdpr);
        dynamicDataSource.setTargetDataSources(targetDataSources);
        dynamicDataSource.setDefaultTargetDataSource(gdel);
        return dynamicDataSource;

    }


    @Bean("sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        //***导入MybatisSqlSession配置***
        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
        //指明数据源
        sqlSessionFactory.setDataSource(multipleDataSource(gdEl(), gdFm(), gdPr()));
        //指明mapper.xml位置(配置文件中指明的xml位置会失效用此方式代替，具体原因未知)
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/mapper/**Mapper.xml"));
        //***导入Mybatis配置***
        MybatisConfiguration configuration = new MybatisConfiguration();
        configuration.setJdbcTypeForNull(JdbcType.NULL);
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setCacheEnabled(false);
        sqlSessionFactory.setConfiguration(configuration);
        sqlSessionFactory.setPlugins(new Interceptor[]{paginationInterceptor()});
        return sqlSessionFactory.getObject();
    }
}
