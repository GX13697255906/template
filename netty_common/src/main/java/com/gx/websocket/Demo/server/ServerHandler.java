package com.gx.websocket.Demo.server;

import cn.hutool.core.date.DateUtil;
import com.gx.websocket.Demo.common.Message;
import com.gx.websocket.Demo.common.User;
import com.gx.websocket.Demo.constants.Constants;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

import java.util.Date;
import java.util.List;

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
        Message message = (Message) msg;
        if (!ObjectUtils.isEmpty(message)) {
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
            if(message.getType() == 3){
                log.info("======================= 接收到clint推送的信息 =====================");
                List<User> list = (List<User>) message.getData();
                System.out.println(list.get(0).getUsername());
            }
        }
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
