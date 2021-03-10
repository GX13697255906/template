package com.gx.websocket.server.common;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 传统IO  同步阻塞IO
 */
@Slf4j
public class TimeServer {

    public static void main(String[] args) throws IOException{
        int port = 8080;
        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            Socket socket = null;
            int count  = 0;
            while (true){
                log.info("监听socket 进入阻塞 count = "+(count+1));
                socket = server.accept();
                new TimeServerHandler(socket).start();
                log.info("---------------------------结束一次通信---------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != server){
                log.info("The time server close");
                server.close();
                server = null;
            }


        }

    }

}
