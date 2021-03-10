package com.gx.websocket.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import lombok.extern.slf4j.Slf4j;

/**
 * @author guoxun
 */
@Slf4j
public class ChatClientHeartBeatServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent event = (IdleStateEvent) evt;
            if (event.state() == IdleState.WRITER_IDLE) {
                log.info("----------------------客户端 Client 已经20秒没有写入数据-----------------------");
            } else if (event.state() == IdleState.READER_IDLE) {
                log.info("----------------------客户端 Client 已经10秒没有读入数据-----------------------");
            }
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }
}
