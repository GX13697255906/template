package com.gx.websocket.server.common;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

@Slf4j
public class TimeServerHandler {

    private Socket socket;

    public TimeServerHandler(Socket socket){
        this.socket = socket;
    }

    public void start(){
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            String body = null;
            while (true){
                body = in.readLine();
                if (null == body){
                    log.info("服务端结束响应");
                    break;
                }else {
                    log.info("服务端接收来自客户端的请求 = "+body);
                    out.println(DateUtil.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
                }
            }
        } catch (IOException e) {

            try {
                if(in != null){
                    in.close();
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            if(out != null){
                out.close();
            }


        }
    }


}
