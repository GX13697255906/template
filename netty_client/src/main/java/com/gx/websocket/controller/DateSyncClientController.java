package com.gx.websocket.controller;

import com.google.common.collect.Lists;
import com.gx.websocket.Demo.common.User;
import com.gx.websocket.client.ChatClient;
import com.gx.websocket.common.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoxun
 */
@RestController
public class DateSyncClientController {

    @Autowired
    private ChatClient client;

    @GetMapping(value = "/push")
    public void push() {
        User user = new User();
        user.setId("USR-00001");
        user.setUsername("GX");
        user.setPassword("1233445");
        user.setAge(27);
        List<User> list = new ArrayList<>();
        list.add(user);
        Message message = new Message();
        List<String> datas = Lists.newArrayList();
        datas.add(user.toString());
        message.setDatas(datas);
        client.pushData(message);
    }

}
