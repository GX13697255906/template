package com.dms.cloud.mapper;

public interface EnumConvertInterceptor {

    boolean convert(EntityMap map, String key, Object v);
 
}
