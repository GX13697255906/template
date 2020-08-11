package com.gx.client.common;

import java.io.Serializable;

/**
 * @author Blue
 * @date Created in 2020/3/9
 * @description netty数据交互模型
 */
public class Message implements Serializable {

    public Message() {

    }

    private static final long serialVersionUID = 1L;
//  信息类型  1-ping  2-pong
    private Integer type;

    private String msg;

    private byte command;

    private String code;

    private Object data;

    private String ping;

    private String pong;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPing() {
        return ping;
    }

    public void setPing(String ping) {
        this.ping = ping;
    }

    public String getPong() {
        return pong;
    }

    public void setPong(String pong) {
        this.pong = pong;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public byte getCommand() {
        return command;
    }

    public void setCommand(byte command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "Message{" +
                "type=" + type +
                ", msg='" + msg + '\'' +
                ", command=" + command +
                ", code='" + code + '\'' +
                ", data=" + data +
                ", ping='" + ping + '\'' +
                ", pong='" + pong + '\'' +
                '}';
    }
}
