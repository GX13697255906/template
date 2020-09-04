package com.dms.cloud.config;

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

    if(colunmName.equals("area_code")){
      if(areaCode.equals("gd")){
        return "1";
      }
      if(areaCode.equals("hn")){
        return "2";
      }
    }
    return null;

  }
}
