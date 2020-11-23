package com.dms.cloud.common;

public interface EnumConvertInterceptor {

    boolean convert(EntityMap map, String key, Object v);
 
}
