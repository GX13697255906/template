package com.gx.websocket.server;

import com.gx.websocket.common.Constants;
import com.gx.websocket.common.Message;
import com.gx.websocket.common.MessageDecoder;
import com.gx.websocket.common.MessageEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.FixedLengthFrameDecoder;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * @author guoxun
 */
public class ChatServerWebSocketChannelHandler extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {

        channel.pipeline()
                //设置log监听器，并且日志级别为debug，方便观察运行流程
                .addLast("logging", new LoggingHandler("DEBUG"))
                //设置解码器
                .addLast("http-codec", new HttpServerCodec())
                //聚合器，使用websocket会用到
                .addLast("aggregator", new HttpObjectAggregator(65536))
                //用于大数据的分区传输
                .addLast("http-chunked", new ChunkedWriteHandler())
//                .addLast(new WebSocketServerProtocolHandler("/ws", null, true, 65536))

//                .addLast("ChatServerMessageDecoder", new MessageDecoder(Message.class))
//                .addLast("ChatServerMessageEncoder", new MessageEncoder(Message.class))
//                .addLast("ChatServerFixedLengthFrameDecoder", new FixedLengthFrameDecoder(Constants.maxObjectSize))
                .addLast("ChatServerHandler", new ChatServerWebSocketHandler());
//                .addLast("ChatServerIdleStateHandler", new IdleStateHandler(10, 20, 0, TimeUnit.SECONDS))
//                .addLast("ChatServerHeartBeatServerHandler", new ChatServerWebSocketHeartBeatServerHandler());


    }
}
