package com.gx.websocket.common.controller;

import com.gx.websocket.common.rebbit.DirectRabbitConfig;
import com.gx.websocket.common.rebbit.FanoutRabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RabbitController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping(value = "/sendDirectMessage")
    public void sendDirectMessage() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "guoxun");
        map.put("agx", "24");
        map.put("password", "123456");
        map.put("nickname", "GX");
        rabbitTemplate.convertAndSend(DirectRabbitConfig.DIRECT_RABBIT_NAME_EXCHANGE, DirectRabbitConfig.DIRECT_ROUTING, map);
    }

    @GetMapping(value = "/sendFanoutMessage")
    public void sendDirectFanoutMessage() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "guoxun");
        map.put("agx", "24");
        map.put("password", "123456");
        map.put("nickname", "GX");
        rabbitTemplate.convertAndSend(FanoutRabbitConfig.FANOUT_RABBIT_NAME_EXCHANGE, null, map);
    }

}
