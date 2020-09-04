package com.dms.cloud.mapper;

import com.dms.cloud.common.mybatis.EntityMap;

public interface EnumConvertInterceptor {

    boolean convert(EntityMap map, String key, Object v);
 
}
