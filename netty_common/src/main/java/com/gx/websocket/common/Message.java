package com.gx.websocket.common;

import cn.hutool.core.date.DateUtil;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author guoxun
 * 客户端和服务端通信的实体类
 */
@Data
@ToString
public class Message implements Serializable {

    public Message() {
        this.time = DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss");
    }

    private String time;

    private Integer type;

    private String code;

    private Object datas;

    private String ping;

    private String pong;

    private String address;

    private String userName;
}
