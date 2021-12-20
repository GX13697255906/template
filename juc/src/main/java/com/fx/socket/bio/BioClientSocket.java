package com.fx.socket.bio;

import java.io.IOException;
import java.net.Socket;

public class BioClientSocket {


    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
    }

}
