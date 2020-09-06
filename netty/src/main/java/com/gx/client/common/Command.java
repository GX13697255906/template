package com.gx.client.common;

public class Command {

    /**认证*/
    public static final byte AUTH_MSG = 1;

    /**PING*/
    public static final byte PING_MSG = 2;

    /**PONG*/
    public static final byte PONG_MSG = 3;

    /**上传信息*/
    public static final byte UPLOAD_DATA = 4;

    /**推送信息*/
    public static final byte PUSH_DATA = 5;

    /**认证返回信息*/
    public static final byte AUTH_MSG_BACK = 11;

    /**上传返回信息*/
    public static final byte UPLOAD_DATA_BACK = 14;

    /**推送返回信息*/
    public static final byte PUSH_DATA_BACK = 15;
}
