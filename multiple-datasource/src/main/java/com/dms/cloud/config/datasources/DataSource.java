package com.dms.cloud.config.datasources;

import com.dms.cloud.constants.SystemConstants;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    String value() default SystemConstants.DATA_SOURCE_GUANGDONG_DMS_EL;
}
