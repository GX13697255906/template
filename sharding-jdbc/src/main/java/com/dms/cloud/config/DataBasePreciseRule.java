package com.dms.cloud.config;

import com.dms.cloud.constants.SystemConstants;
import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;
import java.util.Random;

/**
 * 数据库分片规则
 *
 * @author Mos
 */
public class DataBasePreciseRule implements PreciseShardingAlgorithm<String> {

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {
        String colunmName = shardingValue.getColumnName();
        String areaCode = shardingValue.getValue();
        if (colunmName.equals("area_code")) {
            if (areaCode.equals(SystemConstants.AREA_CODE_GUANGDONG)) {
                return SystemConstants.DATA_SOURCE_GUANGDONG;
            }
            if (areaCode.equals(SystemConstants.AREA_CODE_GUANGXI)) {
                return SystemConstants.DATA_SOURCE_GUANGXI;
            }
            if (areaCode.equals(SystemConstants.AREA_CODE_GUIZHOU)) {
                return SystemConstants.DATA_SOURCE_GUIZHOU;
            }
            if (areaCode.equals(SystemConstants.AREA_CODE_HAINAN)) {
                return SystemConstants.DATA_SOURCE_HAINAN;
            }
            if (areaCode.equals(SystemConstants.AREA_CODE_YUNNAN)) {
                return SystemConstants.DATA_SOURCE_YUNNAN;
            }
        }
        return null;

    }
}
