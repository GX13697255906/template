package com.gx.client.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        channel.pipeline().addLast(new ServerHandler());
        channel.pipeline().addLast(new IdleStateHandler(5, 0, 0));
        channel.pipeline().addLast(new AcceptorIdleStateTrigger());

    }
}
