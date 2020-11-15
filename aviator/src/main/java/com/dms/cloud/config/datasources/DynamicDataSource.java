package com.dms.cloud.config.datasources;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

@Slf4j
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        String dataSource = DataSourceContextHolder.getDbType();
        log.info("使用数据源 {}", dataSource);
        return dataSource;
    }
}
