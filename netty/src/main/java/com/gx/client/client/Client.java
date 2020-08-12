package com.gx.client.client;

import cn.hutool.core.date.DateUtil;
import com.gx.client.constants.Constants;
import com.gx.client.common.Message;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * netty 客户端
 *
 * @author guoxun
 */
@Slf4j
@Service
public class Client {

    public Client() {
        init();
    }

    private Channel channel;
    private NioEventLoopGroup group;
    private Bootstrap b;

    public void connent() {
        if (channel != null && channel.isActive()) {
            return;
        }
        ChannelFuture future = b.connect(Constants.host, Constants.port);
//            添加监听器
        future.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if (channelFuture.isSuccess()) {
                    log.info("客户端连接服务端成功！");
                    channel = channelFuture.channel();
                } else {
                    log.info("客户端连接服务端失败！5秒后进行重试");
                    channelFuture.channel().eventLoop().schedule(new Runnable() {
                        @Override
                        public void run() {
                            connent();
                        }
                    }, 5, TimeUnit.SECONDS);
                }
            }
        });
    }

    @PostConstruct
    public void init() {
        group = new NioEventLoopGroup();
        b = new Bootstrap();
        b.group(group)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new ClientInitChannelHandler());
        log.info("创建连接 Time:{}", DateUtil.format(new Date(), Constants.DATE_FORMAT));
        connent();
    }

    public void pushData(Message message) {
        message.setType(3);
        if(!channel.isActive()){
            ChannelFuture future = b.connect(Constants.host, Constants.port);
            channel = future.channel();
        }
        channel.writeAndFlush(message);
    }

}
