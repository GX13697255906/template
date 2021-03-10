package com.gx.websocket.client;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * @author guoxun
 */
public class ChatClientWebSocketChannelHandler extends ChannelInitializer<SocketChannel> {

    public ChatClientWebSocketChannelHandler(WebSocketClientHandshaker clientHandshaker) {
        this.clientHandshaker = clientHandshaker;
    }

    private WebSocketClientHandshaker clientHandshaker;

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {

        channel.pipeline()
                //设置log监听器，并且日志级别为debug，方便观察运行流程
                .addLast("logging", new LoggingHandler(LogLevel.INFO))
                //设置解码器
                .addLast("http-codec", new HttpClientCodec())
                //聚合器，使用websocket会用到
                .addLast("aggregator", new HttpObjectAggregator(65536))
                .addLast("decode", new StringDecoder())
                .addLast("encode", new StringEncoder())

                //用于大数据的分区传输
//                .addLast("http-chunked", new ChunkedWriteHandler())
//                .addLast(new WebSocketServerProtocolHandler("/ws", null, true, 65536))

//                .addLast("ChatServerMessageDecoder", new MessageDecoder(Message.class))
//                .addLast("ChatServerMessageEncoder", new MessageEncoder(Message.class))
//                .addLast("ChatServerFixedLengthFrameDecoder", new FixedLengthFrameDecoder(Constants.maxObjectSize))
                .addLast("ChatServerHandler", new ChatClientWebSocketHandler(clientHandshaker));
//                .addLast("ChatServerIdleStateHandler", new IdleStateHandler(10, 20, 0, TimeUnit.SECONDS))
//                .addLast("ChatServerHeartBeatServerHandler", new ChatServerWebSocketHeartBeatServerHandler());


    }
}
