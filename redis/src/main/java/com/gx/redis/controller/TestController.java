package com.gx.redis.controller;

import com.gx.redis.annoation.Resubmit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoxun
 */
@RestController
@RequestMapping(value = "/resubmit")
public class TestController {

    @Resubmit("防重复提交")
    @GetMapping(value = "/test")
    public void test() {

    }

}
