package com.example.demo.websocket;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * 初始化链接时候的组件
 */
public class DataSyncWebSocketChannelInitializer extends ChannelInitializer<SocketChannel>{

    public DataSyncWebSocket startWebSocket;
    public DataSyncWebSocketChannelInitializer(DataSyncWebSocket startWebSocket){
        this.startWebSocket = startWebSocket;
    }

    @Override
    protected void initChannel(SocketChannel e) throws Exception {
        e.pipeline().addLast("http-codec",new HttpServerCodec());
        e.pipeline().addLast("aggregator",new HttpObjectAggregator(65536));
        e.pipeline().addLast("http-chunked",new ChunkedWriteHandler());
        e.pipeline().addLast("handler",new DataSyncWebSockeHandler(startWebSocket));
    }
}
