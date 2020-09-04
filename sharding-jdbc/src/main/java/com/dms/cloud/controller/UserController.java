package com.dms.cloud.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dms.cloud.entity.UserQuoteInfo;
import com.dms.cloud.service.UserQuoteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guoxun
 */

@RestController
public class UserController {

    @Autowired
    private UserQuoteInfoService quoteInfoService;

    @GetMapping(value = "/get/{areaCode}/{scopeDate}")
    public List<UserQuoteInfo> get(@PathVariable(value = "areaCode") String areaCode, @PathVariable(value = "scopeDate") String scopeDate) {
        QueryWrapper<UserQuoteInfo> queryWrapper = new QueryWrapper();
        queryWrapper.lambda().
                eq(UserQuoteInfo::getAreaCode, areaCode)
        .likeRight(UserQuoteInfo::getScopeDate, scopeDate);
        return quoteInfoService.list(queryWrapper);
    }

}
