package com.gx.client.common;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

@Slf4j
public class TimeClient {

    public static void main(String[] args) {

        int port = 8080;
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            socket = new Socket("127.0.0.1", port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println("client Time Request \n  换行");
            String body = in.readLine();
            log.info("客户端接收来自服务端的响应 = "+body);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
