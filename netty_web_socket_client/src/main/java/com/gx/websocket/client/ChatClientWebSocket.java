package com.gx.websocket.client;

import com.gx.websocket.common.Constants;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshakerFactory;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import io.netty.handler.logging.LoggingHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * 服务端
 *
 * @author guoxun
 */
@Slf4j
@Service
public class ChatClientWebSocket {


    private EventLoopGroup workGroup = null;

    private Bootstrap bootstrap = null;

    private ChannelFuture channelFuture = null;

    private Channel channel;

    private URI uri = null;

    private WebSocketClientHandshaker clientHandshaker;

    private ChatClientWebSocketChannelHandler webSocketChannelHandler;


    public ChatClientWebSocket() {
        workGroup = new NioEventLoopGroup();
        bootstrap = new Bootstrap();
    }

    @PostConstruct
    public void init() {

        try {
            uri = new URI("ws://" + Constants.host + ":" + Constants.Web_Socket_Prot + "/websocket");
            clientHandshaker = WebSocketClientHandshakerFactory.newHandshaker(uri, WebSocketVersion.V00, null, false, new DefaultHttpHeaders());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        webSocketChannelHandler = new ChatClientWebSocketChannelHandler(clientHandshaker);

        bootstrap = new Bootstrap();
        bootstrap.group(workGroup)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new LoggingHandler())
                .handler(webSocketChannelHandler);
        connect();
    }

    public void connect() {
        channelFuture = bootstrap.connect(uri.getHost(), Constants.Web_Socket_Prot);
        channel = channelFuture.channel();
    }

    @PreDestroy
    private void destroy() {
        try {
            channel.closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        ChatClientWebSocket chatServer = new ChatClientWebSocket();
        chatServer.connect();

    }

}
