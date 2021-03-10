package com.gx.websocket.client;

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
public class ChatClientChannelHandler extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        channel.pipeline()
                .addLast("ChatClientMessageDecoder", new MessageDecoder(Message.class))
                .addLast("ChatClientMessageEncoder", new MessageEncoder(Message.class))
                .addLast("ChatClientFixedLengthFrameDecoder", new FixedLengthFrameDecoder(Constants.maxObjectSize))
                .addLast("ChatClientHandler", new ChatClientHandler())
//        添加心跳时钟
                .addLast("ChatClientIdleStateHandler", new IdleStateHandler(10, 20, 0, TimeUnit.SECONDS))
                .addLast("ChatClientHeartBeatServerHandler", new ChatClientHeartBeatServerHandler());


    }
}
