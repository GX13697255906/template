package com.gx.websocket.server;

import com.gx.websocket.common.Constants;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 服务端
 *
 * @author guoxun
 */
@Slf4j
@Service
public class ChatServer {

    private EventLoopGroup bossGroup = null;

    private EventLoopGroup workGroup = null;

    private ServerBootstrap bootstrap = null;

    private ChannelFuture channelFuture = null;

    public ChatServer() {
        bossGroup = new NioEventLoopGroup();
        workGroup = new NioEventLoopGroup();
        bootstrap = new ServerBootstrap();
    }

    @PostConstruct
    public void bind() {
        bootstrap = new ServerBootstrap();
        bootstrap.group(bossGroup, workGroup)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG, 1024)
                .childHandler(new ChatServerChannelHandler());

        try {
            //        绑定端口，同步等待连接
            channelFuture = bootstrap.bind(Constants.port).sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void destory() {
        try {
            //            closeFuture().syncUninterruptibly()就是让当前线程(即主线程)同步等待Netty server的close事件，Netty server的channel close后，主线程才会继续往下执行
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {

        ChatServer chatServer = new ChatServer();
        chatServer.bind();

    }

}
