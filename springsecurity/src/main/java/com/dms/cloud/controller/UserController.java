package com.dms.cloud.controller;

import com.dms.cloud.entity.User;
import com.dms.cloud.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUser")
    public User getUser() {
        return new User("郭逊", "xun.guo", "123456");
    }

    @GetMapping(value = "/addUser")
    public Boolean addUser(@RequestParam(value = "userName") String userName,
                           @RequestParam(value = "nickName") String nickName,
                           @RequestParam(value = "password") String password) {
        return userService.addUser(userName, nickName, password);
    }


}
