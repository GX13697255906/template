package com.dms.cloud.config.datasources;

import com.dms.cloud.constants.SystemConstants;

public class DataSourcePool {

    public static void setDataSource(String areaCode, String marketCode) {
//        广东
        if (areaCode.equals(SystemConstants.AREA_CODE_GUANGDONG) && marketCode.equals(SystemConstants.MARKET_EL_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUANGDONG_DMS_EL);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_GUANGDONG) && marketCode.equals(SystemConstants.MARKET_FM_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUANGDONG_DMS_FM);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_GUANGDONG) && marketCode.equals(SystemConstants.MARKET_PR_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUANGDONG_DMS_PR);
        }
        //        广西
        if (areaCode.equals(SystemConstants.AREA_CODE_GUANGXI) && marketCode.equals(SystemConstants.MARKET_EL_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUANGXI_DMS_EL);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_GUANGXI) && marketCode.equals(SystemConstants.MARKET_FM_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUANGXI_DMS_FM);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_GUANGXI) && marketCode.equals(SystemConstants.MARKET_PR_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUANGXI_DMS_PR);
        }
        //        云南
        if (areaCode.equals(SystemConstants.AREA_CODE_YUNNAN) && marketCode.equals(SystemConstants.MARKET_EL_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_YUNNAN_DMS_EL);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_YUNNAN) && marketCode.equals(SystemConstants.MARKET_FM_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_YUNNAN_DMS_FM);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_YUNNAN) && marketCode.equals(SystemConstants.MARKET_PR_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_YUNNAN_DMS_PR);
        }
        //        贵州
        if (areaCode.equals(SystemConstants.AREA_CODE_GUIZHOU) && marketCode.equals(SystemConstants.MARKET_EL_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUIZHOU_DMS_EL);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_GUIZHOU) && marketCode.equals(SystemConstants.MARKET_FM_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUIZHOU_DMS_FM);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_GUIZHOU) && marketCode.equals(SystemConstants.MARKET_PR_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_GUIZHOU_DMS_PR);
        }
        //        海南
        if (areaCode.equals(SystemConstants.AREA_CODE_HAINAN) && marketCode.equals(SystemConstants.MARKET_EL_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_HAINAN_DMS_EL);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_HAINAN) && marketCode.equals(SystemConstants.MARKET_FM_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_HAINAN_DMS_FM);
        }
        if (areaCode.equals(SystemConstants.AREA_CODE_HAINAN) && marketCode.equals(SystemConstants.MARKET_PR_CODE)) {
            DataSourceContextHolder.setDbType(SystemConstants.DATA_SOURCE_HAINAN_DMS_PR);
        }
    }

}
