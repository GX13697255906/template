package com.fx.socket.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BioServerSocket {

    private ServerSocket serverSocket;
    private Socket socket = null;

    public BioServerSocket() throws IOException {
        this.serverSocket = new ServerSocket(8080);
    }

    public void init() throws IOException {
        for (int i = 0; i < 5; i++) {
            socket = serverSocket.accept();
            new Thread(new BioServerSocketHandler(socket)).start();
        }
    }

    class BioServerSocketHandler implements Runnable {

        private Socket socket;

        BioServerSocketHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            System.out.println("ThreadName = " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws IOException {
        BioServerSocket serverSocket = new BioServerSocket();
        serverSocket.init();
    }

}
