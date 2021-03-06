package com.gx.websocket.Demo.client;

import com.gx.websocket.Demo.constants.Constants;
import com.gx.websocket.Demo.common.Message;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import lombok.extern.slf4j.Slf4j;


/**
 * @author guoxun
 * @des 客户端添加心跳
 */
@Slf4j
@ChannelHandler.Sharable
public class ClientSenderIdleStateTrigger extends ChannelInboundHandlerAdapter {

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleState state = ((IdleStateEvent) evt).state();
            if (state == IdleState.WRITER_IDLE) {
                log.info("client 20秒内没有发送数据到 server 发送心跳 ping -> server");
                Message message = new Message();
                message.setType(1);
                message.setPing(Constants.ping);
                message.setMsg("client 测试 server 是否连接");
                ctx.writeAndFlush(message);
            }
            if (state == IdleState.READER_IDLE) {
                log.error("-----------error------------ client 与 server 的连接断开 client 需要重新尝试连接 -----------error------------");
                new Client().connent();
            }
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
    }
}
