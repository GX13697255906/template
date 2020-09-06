package com.dms.cloud.biz303.client.constants;

/**
 * @author ：yangqingbo
 * @date ：Created in 2019/10/13 9:47
 * @description：中长期市场交易信息服务常量
 */
public class Biz303Constants {

    /**
     * 服务名称
     */
    public static final String MARKET_TRADING_RECORD_SERVER = "dms-biz303-server";

    /**
     * 状态: 0-有效
     */
    public final static int ENABLED = 0;
    /**
     * 状态:1-无效
     */
    public final static int DISABLED = 1;
    /**
     * 数据时间
     */
    public static final String SCOPE_DATE = "scope_date";
    /**
     * 数据状态 0-有效 1-无效
     */
    public static final String STATUS = "status";
    /**
     * 合同类型:1-基数合约 2-中长期合约
     */
    public static final String TYPE = "type";
}
