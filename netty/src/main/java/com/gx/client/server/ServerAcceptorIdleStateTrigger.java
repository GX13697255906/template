package com.gx.client.server;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.gx.client.Constants;
import com.gx.client.common.Message;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import lombok.extern.slf4j.Slf4j;

/**
 * 服务端添加心跳
 *
 * @author guoxun
 */
@Slf4j
@ChannelHandler.Sharable
public class ServerAcceptorIdleStateTrigger extends ChannelInboundHandlerAdapter {

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleState state = ((IdleStateEvent) evt).state();
            if (state == IdleState.READER_IDLE) {
                log.info("server 10秒内没有接收到 client 发送的数据 发送心跳 ping -> client");
                Message message = new Message();
                message.setMsg("server 测试 client 是否连接");
                message.setType(1);
                message.setPing(Constants.ping);
                ctx.writeAndFlush(message);
            }
            if (state == IdleState.WRITER_IDLE) {
                log.error("----------------------- server 与 client 的连接断开 client 需要重新尝试连接-----------------------");
            }
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        Message message = (Message) msg;
        if (ObjectUtils.isNotEmpty(message)) {
            if (message.getType() == 1) {
                log.info("server 接收到 client 发送的 ping 信息 回复心跳 pong ->client");
                message.setPing(null);
                message.setType(2);
                message.setPong(Constants.pong);
                ctx.writeAndFlush(message);
            }
            if (message.getType() == 2) {
                log.info("server 接收到 client 回复的 pong 信息");
            }
        }
    }
}
