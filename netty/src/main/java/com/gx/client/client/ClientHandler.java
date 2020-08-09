package com.gx.client.client;

import cn.hutool.core.date.DateUtil;
import com.gx.client.Constants;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
public class ClientHandler extends ChannelInboundHandlerAdapter{

//
//    @Override
//    protected void handleData(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
//        byte[] data = new byte[byteBuf.readableBytes() - 5];
//        byteBuf.skipBytes(5);
//        byteBuf.readBytes(data);
//        String content = new String(data);
//        System.out.println(name + " get content: " + content);
//    }
//
//    @Override
//    protected void handleAllIdle(ChannelHandlerContext ctx) {
//        super.handleAllIdle(ctx);
//        sendPingMsg(ctx);
//    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("连接成功 Time:{}", DateUtil.format(new Date(), Constants.DATE_FORMAT));
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        log.error("连接断开 5秒后重新尝试连接！ Time:{}", DateUtil.format(new Date(), Constants.DATE_FORMAT));
        new Client().connent();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        super.channelRead(ctx, msg);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        log.error("连接异常 Thime:{}", DateUtil.format(new Date(), Constants.DATE_FORMAT));
    }

}
