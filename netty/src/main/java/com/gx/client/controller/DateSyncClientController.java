package com.gx.client.controller;

import com.gx.client.client.Client;
import com.gx.client.common.Message;
import com.gx.client.common.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class DateSyncClientController {

    @Autowired
    private Client client;

    @GetMapping(value = "/push")
    public void push(){
        User user = new User();
        user.setId("USR-00001");
        user.setUsername("GX");
        user.setPassword("1233445");
        user.setAge(27);
        List<User> list = new ArrayList<>();
        list.add(user);
        Message message = new Message();
        message.setType(3);
        message.setData(list);
        client.pushData(message);
    }

}
