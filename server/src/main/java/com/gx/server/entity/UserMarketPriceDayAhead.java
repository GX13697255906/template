package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 用电侧日前市场出清结果表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@NoArgsConstructor
@TableName("biz_user_market_price_day_ahead")
@ApiModel(value="UserMarketPriceDayAhead对象", description="用电侧日前市场出清结果表")
public class UserMarketPriceDayAhead extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用电侧日前市场出清结果表id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "名称 名称现货市场要求为准")
    private String name;

    @ApiModelProperty(value = "用户编码")
    private String userCode;

    @ApiModelProperty(value = "0000 价格")
    private Double p0000;

    @ApiModelProperty(value = "0100 价格")
    private Double p0100;

    @ApiModelProperty(value = "0200 价格")
    private Double p0200;

    @ApiModelProperty(value = "0300 价格")
    private Double p0300;

    @ApiModelProperty(value = "0400 价格")
    private Double p0400;

    @ApiModelProperty(value = "0500 价格")
    private Double p0500;

    @ApiModelProperty(value = "0600 价格")
    private Double p0600;

    @ApiModelProperty(value = "0700 价格")
    private Double p0700;

    @ApiModelProperty(value = "0800 价格")
    private Double p0800;

    @ApiModelProperty(value = "0900 价格")
    private Double p0900;

    @ApiModelProperty(value = "1000 价格")
    private Double p1000;

    @ApiModelProperty(value = "1100 价格")
    private Double p1100;

    @ApiModelProperty(value = "1200 价格")
    private Double p1200;

    @ApiModelProperty(value = "1300 价格")
    private Double p1300;

    @ApiModelProperty(value = "1400 价格")
    private Double p1400;

    @ApiModelProperty(value = "1500 价格")
    private Double p1500;

    @ApiModelProperty(value = "1600 价格")
    private Double p1600;

    @ApiModelProperty(value = "1700 价格")
    private Double p1700;

    @ApiModelProperty(value = "1800 价格")
    private Double p1800;

    @ApiModelProperty(value = "1900 价格")
    private Double p1900;

    @ApiModelProperty(value = "2000 价格")
    private Double p2000;

    @ApiModelProperty(value = "2100 价格")
    private Double p2100;

    @ApiModelProperty(value = "2200 价格")
    private Double p2200;

    @ApiModelProperty(value = "2300 价格")
    private Double p2300;

    @ApiModelProperty(value = "时间 -1 （当日传输前日数据）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
