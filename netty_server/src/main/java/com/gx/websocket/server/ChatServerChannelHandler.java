package com.gx.websocket.server;

import com.gx.websocket.common.Constants;
import com.gx.websocket.common.Message;
import com.gx.websocket.common.MessageDecoder;
import com.gx.websocket.common.MessageEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.FixedLengthFrameDecoder;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * @author guoxun
 */
public class ChatServerChannelHandler extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {

        channel.pipeline()
                .addLast("ChatServerMessageDecoder", new MessageDecoder(Message.class))
                .addLast("ChatServerMessageEncoder", new MessageEncoder(Message.class))
                .addLast("ChatServerFixedLengthFrameDecoder", new FixedLengthFrameDecoder(Constants.maxObjectSize))
                .addLast("ChatServerHandler", new ChatServerHandler())
                .addLast("ChatServerIdleStateHandler", new IdleStateHandler(10, 20, 0, TimeUnit.SECONDS))
                .addLast("ChatServerHeartBeatServerHandler", new ChatServerHeartBeatServerHandler());


    }
}
