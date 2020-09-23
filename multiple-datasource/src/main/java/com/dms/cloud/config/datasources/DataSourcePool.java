package com.dms.cloud.config.datasources;

import cn.hutool.core.date.DateUtil;
import com.dms.cloud.constants.Constants;
import com.dms.cloud.constants.SystemConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.util.Date;

@Slf4j
public class DataSourcePool {

    public static void setDataSource(String areaCode, Long marketId) throws Exception {
        String dataSourceName = null;
//        广东
        if (areaCode.equals(SystemConstants.AREA_CODE_GUANGDONG) && marketId.longValue() == SystemConstants.MARKET_EL_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUANGDONG_DMS_EL);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_GUANGDONG) && marketId.longValue() == SystemConstants.MARKET_FM_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUANGDONG_DMS_FM);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_GUANGDONG) && marketId.longValue() == SystemConstants.MARKET_PR_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUANGDONG_DMS_PR);
        }
        //        广西
        if (areaCode.equals(SystemConstants.AREA_CODE_GUANGXI) && marketId.longValue() == SystemConstants.MARKET_EL_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUANGXI_DMS_EL);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_GUANGXI) && marketId.longValue() == SystemConstants.MARKET_FM_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUANGXI_DMS_FM);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_GUANGXI) && marketId.longValue() == SystemConstants.MARKET_PR_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUANGXI_DMS_PR);
        }
        //        云南
        if (areaCode.equals(SystemConstants.AREA_CODE_YUNNAN) && marketId.longValue() == SystemConstants.MARKET_EL_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_YUNNAN_DMS_EL);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_YUNNAN) && marketId.longValue() == SystemConstants.MARKET_FM_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_YUNNAN_DMS_FM);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_YUNNAN) && marketId.longValue() == SystemConstants.MARKET_PR_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_YUNNAN_DMS_PR);
        }
        //        贵州
        if (areaCode.equals(SystemConstants.AREA_CODE_GUIZHOU) && marketId.longValue() == SystemConstants.MARKET_EL_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUIZHOU_DMS_EL);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_GUIZHOU) && marketId.longValue() == SystemConstants.MARKET_FM_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUIZHOU_DMS_FM);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_GUIZHOU) && marketId.longValue() == SystemConstants.MARKET_PR_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUIZHOU_DMS_PR);
        }
        //        海南
        if (areaCode.equals(SystemConstants.AREA_CODE_HAINAN) && marketId.longValue() == SystemConstants.MARKET_EL_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_HAINAN_DMS_EL);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_HAINAN) && marketId.longValue() == SystemConstants.MARKET_FM_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_HAINAN_DMS_FM);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_HAINAN) && marketId.longValue() == SystemConstants.MARKET_PR_ID) {
            dataSourceName = DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_HAINAN_DMS_PR);
        }
        log.info(String.format("当前数据源为 ：%s 时间：%s", dataSourceName, DateUtil.format(new Date(), Constants.yyyyMMddhhmmss)));
        if (StringUtils.isEmpty(dataSourceName)) {
            throw new Exception("数据源不能正确获取到，区域编码或市场ID未能正确获取到");
        }
    }

}
