package com.gx.client.server;

import com.gx.client.constants.Constants;
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
public class ServerInitChannelHandler extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {

        channel.pipeline().addLast("objectDecoder", new ObjectDecoder(ClassResolvers.weakCachingResolver(this.getClass().getClassLoader())));
        channel.pipeline().addLast("objectEncoder", new ObjectEncoder());
        channel.pipeline().addLast("idleStateHandler", new IdleStateHandler(20, 30, 0, TimeUnit.SECONDS));
        channel.pipeline().addLast(Constants.ServerIdle, new ServerAcceptorIdleStateTrigger());
        channel.pipeline().addLast("serverHandler",new ServerHandler());

    }
}
