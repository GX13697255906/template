package com.gx.server.entity;

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

    private byte command;

    private String code;

    private Object data;

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
                "command=" + command +
                ", Code=" + code +
                ", data=" + data +
                '}';
    }
}
