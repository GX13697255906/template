package com.dms.cloud.config.interceptor;

import com.dms.cloud.config.datasources.DataSourcePool;
import com.dms.cloud.constants.SystemConstants;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.util.Map;
import java.util.Set;

@Slf4j
@Component
public class RequestInterceptor implements WebMvcConfigurer, HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Map<String, String[]> parameterMap = request.getParameterMap();
        if (!CollectionUtils.isEmpty(parameterMap)) {
            Set<String> keySet = parameterMap.keySet();
            if (!keySet.contains(SystemConstants.AREA_CODE_NAME) || !keySet.contains(SystemConstants.MARKET_ID_NAME)) {
                throw new Exception("区域编码或市场编码不能为空");
            } else {
                String areaCode = request.getParameter("areaCode");
                Long marketId = Long.parseLong(request.getParameter("marketId"));
//      拦截器获取数据源
                if (!StringUtils.isEmpty(areaCode) && !ObjectUtils.isEmpty(marketId)) {
                    log.info("当前区域为 areaCode = {}", areaCode);
                    log.info("当前市场为 marketId = {}", marketId);
                    DataSourcePool.setDataSource(areaCode, marketId);
                    return true;
                } else {
                    throw new Exception("区域编码或市场编码不能为空");
                }
            }
        } else {
            throw new Exception("区域编码或市场编码不能为空");
        }
    }
}
