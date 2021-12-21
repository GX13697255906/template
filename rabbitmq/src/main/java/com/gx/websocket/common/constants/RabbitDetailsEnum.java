package com.gx.websocket.common.constants;

import org.springframework.amqp.core.ExchangeTypes;

import java.io.Serializable;

/**
 * @author Administrator
 */
public enum RabbitDetailsEnum implements Serializable {

//    private final static String FX_EXCHANGE = "fx_exchange";

    API("fx", "fx_routingKey_direct", "fx_exchange", ExchangeTypes.DIRECT, "fx_queue_api", "API传输队列"),

    DIRECT_LOG("fx", "fx_routingKey_direct", "fx_exchange_direct", ExchangeTypes.DIRECT, "fx_queue_log", "直连型-日志传输队列"),

    FANOUT_API_0("fx", "", "fx_exchange_fanout", ExchangeTypes.FANOUT, "fx_queue_api_0", "扇型-日志传输队列"),
    FANOUT_API_1("fx", "", "fx_exchange_fanout", ExchangeTypes.FANOUT, "fx_queue_api_1", "扇型-日志传输队列"),
    FANOUT_API_2("fx", "", "fx_exchange_fanout", ExchangeTypes.FANOUT, "fx_queue_api_2", "扇型-日志传输队列"),

    TOPIC_LOG_0("fx", "fx_routingKey_topic", "fx_exchange_topic", ExchangeTypes.TOPIC, "fx_queue_log", "主题型-日志传输队列"),
    TOPIC_LOG_1("fx", "fx_routingKey_topic", "fx_exchange_topic", ExchangeTypes.TOPIC, "fx_queue_log", "主题型-日志传输队列"),
    TOPIC_LOG_2("fx", "fx_routingKey_topic", "fx_exchange_topic", ExchangeTypes.TOPIC, "fx_queue_log", "主题型-日志传输队列"),

    HEADERS_LOG("fx", "fx_routingKey_headers", "fx_exchange_headers", ExchangeTypes.HEADERS, "fx_queue_log", "headers型-日志传输队列");

    private String virtualHost;
    private String routingKey;
    private String exchange;
    private String exchangeType;
    private String queue;
    private String des;

    private RabbitDetailsEnum(String virtualHost, String routingKey, String exchange, String exchangeType, String queue, String des) {
        this.virtualHost = virtualHost;
        this.routingKey = routingKey;
        this.exchange = exchange;
        this.exchangeType = exchangeType;
        this.queue = queue;
        this.des = des;
    }

    public String getVirtualHost() {
        return virtualHost;
    }

    public void setVirtualHost(String virtualHost) {
        this.virtualHost = virtualHost;
    }

    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
