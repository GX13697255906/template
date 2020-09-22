package com.dms.cloud.config.interceptor;

import com.dms.cloud.config.datasources.DataSourcePool;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.util.Map;

@Slf4j
@Component
public class RequestInterceptor implements WebMvcConfigurer, HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String areaCode = request.getParameter("areaCode");
        String marketCode = request.getParameter("marketCode");
//      拦截器获取数据源
        if (!StringUtils.isEmpty(areaCode) && !StringUtils.isEmpty(marketCode)) {
            log.info("当前区域为 areaCode = {}", areaCode);
            log.info("当前市场为 marketCode = {}", marketCode);
            DataSourcePool.setDataSource(areaCode, marketCode);
            return true;
        }else {
            throw new Exception("区域编码或市场编码不能为空");
        }

    }
}
