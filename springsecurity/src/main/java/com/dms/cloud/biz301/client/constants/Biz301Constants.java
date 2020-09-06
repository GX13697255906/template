package com.dms.cloud.biz301.client.constants;

/**
 * @author ：yangqingbo
 * @date ：Created in 2019/10/13 9:47
 * @description：基础信息服务常量
 */
public class Biz301Constants {

    /**
     * 服务名称
     */
    public static final String BASE_INFO_SERVER = "dms-biz301-server";

    /**
     * 状态:0-有效
     */
    public final static int ENABLED = 0;

    /**
     * 状态:1-无效
     */
    public final static int DISABLED = 1;
    
    /** 企业类型：1-批发用户 */
    public static final String ENTERPRISE_USER_1 = "1";

    /** 企业类型：2-售电公司 */
    public static final String ENTERPRISE_SALE_2 = "2";

    /** 机组类型：1=燃煤 */
    public static final String UNIT_TYPE_1 = "燃煤";

    /** 机组类型：2=燃气 */
    public static final String UNIT_TYPE_2 = "燃气";

    /** 机组类型：3=燃煤 */
    public static final String UNIT_TYPE_3 = "燃油";

    public static final String FM_YYYY_MM_DD_HHMISS = "yyyy-MM-dd HH:mm:ss";
}
