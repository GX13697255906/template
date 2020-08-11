package com.gx.client.server;

import cn.hutool.core.date.DateUtil;
import com.gx.client.Constants;
import com.gx.client.common.Message;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * 消息处理
 * @author guoxun
 */

@Slf4j
public class ServerHandler extends ChannelInboundHandlerAdapter {

    private static final String pong = "pong";

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("服务端-通道被激活！ 时间：{}", DateUtil.format(new Date(), Constants.DATE_FORMAT));
        ctx.writeAndFlush("服务端-通道激活，可以传递数据");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//        log.info("--------------服务端-读取信息--------------");
//        Message message = (Message) msg;
//        System.out.println("server ping = " + message.getMsg());
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
//        log.info("服务端-读取结束 时间：{}", DateUtil.format(new Date(), Constants.DATE_FORMAT));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        log.error("----------------服务端-连接异常----------------");
        log.error(cause.getMessage());
    }
}
