package com.dms.cloud.config.datasources;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataSourceContextHolder {

    private static final ThreadLocal contextHold = new ThreadLocal();

    public static String setDbType(String dbType) {
        log.info("设置数据源：{}", dbType);
        contextHold.set(dbType);
        return dbType;
    }

    /**
     * 获取当前数据源
     */
    public static String getDbType() {
        String dbType = (String) contextHold.get();
        log.info("获取数据源：{}", dbType);
        return (String) contextHold.get();
    }

    /**
     * 清楚上下文数据
     */
    public static void clearDbType() {
        log.info("清除数据源信息");
        contextHold.remove();
    }

}
