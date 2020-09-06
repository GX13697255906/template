package com.dms.cloud.biz309.client.constants;

/**
 * Description:
 *
 * @author taihaomaineng yabingsong
 * @date 2019-10-13
 */
public class Biz309Constants {

    /**
     * 服务名称
     */
    public static final String SERVER_NAME = "dms-biz309-server";

    /**
     * 状态:0-有效
     */
    public final static int ENABLED = 0;
    /**
     * 状态:1-无效
     */
    public final static int DISABLED = 1;
    /**
     * 执行状态:1-成功
     */
    public final static String SUCCEED = "成功";
    /**
     * 执行状态:2-失败
     */
    public final static String FAILURE = "失败";
    /**
     * 数字:1
     */
    public final static Integer NUMBER_ONE = 1;
    /**
     * 数字:2
     */
    public final static Integer NUMBER_TWO = 2;

    /**
     * 数据时间
     */
    public static final String SCOPE_DATE = "scope_date";
    /**
     * 发生时间(yyyyMMdd_hhmmss)
     */
    public static final String DATE_TIME = "date_time";
    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";
    /**
     * 数据状态 0-有效 1-无效
     */
    public static final String STATUS = "status";
    /**
     * 市场类型(日前市场/实时市场/调频市场)
     */
    public static final String MARKET_TYPE = "market_type";
    /**
     * 披露类型(日前边界信息)
     */
    public static final String DISCLOSURE_TYPE = "disclosure_type";
    /**
     * 出清结果类型(日前市场出清、实时市场出清、调 频辅助服务市场出清)
     */
    public static final String CLEARING_TYPE = "clearing_type";

    public static final String FM_YYYY_MM_DD_HHMISS = "yyyy-MM-dd HH:mm:ss";


    /**
     * yyyy-MM-dd时间格式.
     */
    public static final String FM_YYYY_MM_DD = "yyyy-MM-dd";
    /**
     * yyyy-MM时间格式.
     */
    public static final String FM_YYYY_MM = "yyyy-MM";
    /**
     * yyyy时间格式.
     */
    public static final String FM_YYYY = "yyyy";
    /**
     * MM-dd时间格式.
     */
    public static final String FM_MM_DD = "MM-dd";

    /**
     * HH:mm时间格式
     */
    public static final String HHMM = "HHmmss";

    /**
     * HH:mm时间格式
     */
    public static final String HH_MM = "HH:mm";

}
