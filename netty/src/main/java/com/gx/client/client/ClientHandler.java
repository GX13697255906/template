package com.gx.client.client;

import cn.hutool.core.date.DateUtil;
import com.gx.client.Constants;
import com.gx.client.common.Message;
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
        System.out.println("客户端接收信息 msg = " + String.valueOf(msg));
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
