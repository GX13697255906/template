package com.gx.websocket.Demo.client;

import cn.hutool.core.date.DateUtil;
import com.gx.websocket.Demo.constants.Constants;
import com.gx.websocket.Demo.common.Message;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;


/**
 * @author guoxun
 */
@Slf4j
public class ClientHandler extends ChannelInboundHandlerAdapter {

    private static final String ping = "ping";

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("客户端连接成功 Time:{}", DateUtil.format(new Date(), Constants.DATE_FORMAT));
        Message msg = new Message();
        msg.setMsg(ping);
        ctx.writeAndFlush(msg);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        log.error("客户端连接断开 5秒后重新尝试连接！ Time:{}", DateUtil.format(new Date(), Constants.DATE_FORMAT));
        new Client().connent();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        log.info("服务端返回报文长度：{}", msg);
//        Message message = (Message) msg;
//        if (ObjectUtils.isNotEmpty(message)) {
//            if (message.getType() == 2) {
//                log.info("client 接收到 server 回复的 pong 信息");
//            }
//            if (message.getType() == 1) {
//                log.info("client 接收到 server 发送的 ping 信息 回复心跳 pong -> server ");
//                message.setPing(null);
//                message.setType(2);
//                message.setPong(Constants.pong);
//                ctx.writeAndFlush(message);
//            }
//        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        log.error("客户端连接异常 Thime:{}", DateUtil.format(new Date(), Constants.DATE_FORMAT));
    }
}
