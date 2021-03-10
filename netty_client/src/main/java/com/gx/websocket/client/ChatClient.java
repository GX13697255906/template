package com.gx.websocket.client;

import com.gx.websocket.common.Constants;
import com.gx.websocket.common.Message;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.TimeUnit;

/**
 * @author guoxun
 * 客户端
 */
@Slf4j
@Service
public class ChatClient {

    private EventLoopGroup loopGroup = null;
    private Bootstrap bootstrap = null;
    private Channel channel;
    private String channelName = "T1";

    public ChatClient() {
        loopGroup = new NioEventLoopGroup();
        bootstrap = new Bootstrap();
        init();
    }

    public void init() {
        bootstrap.group(loopGroup)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new ChatClientChannelHandler());
        connect();
    }

    @PostConstruct
    public void connect() {
        if (channel != null && channel.isActive()) {
            log.info("---------------------------连接成功--------------------------");
            return;
        }
        ChannelFuture channelFuture = bootstrap.connect(Constants.host, Constants.port);

        channelFuture.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if (channelFuture.isSuccess()) {
                    channel = channelFuture.channel();
                } else {
                    channelFuture.channel().eventLoop().schedule(new Runnable() {
                        @Override
                        public void run() {
                            log.info("---------------------------连接失败，5秒后重新尝试连接 。。。。。--------------------------");
                            connect();
                        }
                    }, 5, TimeUnit.SECONDS);
                }
            }
        });
    }

    @PreDestroy
    public void destory() {
        log.info("-------------- client : 关闭客户端---------------");
        loopGroup.shutdownGracefully();
    }

    /**
     * 推送数据接口
     *
     * @param message
     */
    public void pushData(Message message) {
        channel.writeAndFlush(message);
    }

    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient();
        chatClient.connect();
    }

}
