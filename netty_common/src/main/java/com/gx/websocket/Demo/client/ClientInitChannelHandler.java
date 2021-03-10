package com.gx.websocket.Demo.client;

import com.gx.websocket.Demo.constants.Constants;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * @author guoxun
 */
public class ClientInitChannelHandler extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {

        channel.pipeline().addLast("objectDecoder", new ObjectDecoder(ClassResolvers.weakCachingResolver(this.getClass().getClassLoader())));
        channel.pipeline().addLast("objectEncoder", new ObjectEncoder());
        channel.pipeline().addLast("idleStateHandler", new IdleStateHandler(30, 20, 0, TimeUnit.SECONDS));
        channel.pipeline().addLast(Constants.ClientIdle, new ClientSenderIdleStateTrigger());
        channel.pipeline().addLast("clientHandler", new ClientHandler());
    }
}
