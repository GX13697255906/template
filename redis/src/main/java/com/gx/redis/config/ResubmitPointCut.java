package com.gx.redis.config;

import com.gx.redis.annoation.Resubmit;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

/**
 * @author guoxun
 */
@Aspect
@Component
public class ResubmitPointCut {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private HttpServletRequest request;

    @Pointcut("@annotation(resubmit)")
    public void reSbmitPointCut(Resubmit resubmit) {
    }

    @Before("reSbmitPointCut(resubmit)")
    public void beforeReSubmitPointCut(Resubmit resubmit) {
        String requestId = request.getServletPath();
        String key = "user:1";
        System.out.println(redisTemplate.opsForValue().get(key));

        Boolean absent = redisTemplate.opsForValue()
                .setIfAbsent(requestId, "1", 60, TimeUnit.SECONDS);
        Assert.notNull(absent, "");
        if (!absent) {
            throw new RuntimeException("重复提交-上一个请求还未处理完");
        }
        request.setAttribute("__request_resubmit_need_release", "need");
    }

    @After("reSbmitPointCut(resubmit)")
    public void afterReSubmitPointCut(Resubmit resubmit) {
        if ("need".equals(String.valueOf(request.getAttribute("__request_resubmit_need_release")))) {
            String requestId = request.getServletPath() + request.getHeader("token");
            redisTemplate.delete(requestId);
        }
    }

}
