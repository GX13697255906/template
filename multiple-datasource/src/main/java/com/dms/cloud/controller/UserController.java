package com.dms.cloud.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dms.cloud.entity.UserQuoteInfo;
import com.dms.cloud.service.UserQuoteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guoxun
 */

@RestController
public class UserController {

    @Autowired
    private UserQuoteInfoService quoteInfoService;

    @GetMapping(value = "/get")
    public List<UserQuoteInfo> get(@RequestParam(value = "areaCode") String areaCode) {
        QueryWrapper<UserQuoteInfo> queryWrapper = new QueryWrapper();
        queryWrapper.lambda().
                eq(UserQuoteInfo::getAreaCode, areaCode);
        return quoteInfoService.list(queryWrapper);
    }

}
