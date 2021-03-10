package com.gx.websocket.server.mapper;

public interface EnumConvertInterceptor {

    boolean convert(EntityMap map, String key, Object v);
 
}
