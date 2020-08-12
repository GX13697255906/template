package com.gx.client.server;

import com.gx.client.common.Message;
import com.gx.client.constants.Constants;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
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
                log.info("server 20秒内没有接收到 client 发送的数据 发送心跳 ping -> client");
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

}
