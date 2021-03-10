package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_user_market_average_price_day_ahead")
@ApiModel(value="UserMarketAveragePriceDayAhead对象", description="用电侧日前市场综合加权平均电价")
public class UserMarketAveragePriceDayAhead extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用电侧日前市场综合平均电价id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态码(0可用,1不可用)")
    private Integer status;

    @ApiModelProperty(value = "0000时价格")
    private Double price0000;

    @ApiModelProperty(value = "0100时价格")
    private Double price0100;

    @ApiModelProperty(value = "0200时价格")
    private Double price0200;

    @ApiModelProperty(value = "0300时价格")
    private Double price0300;

    @ApiModelProperty(value = "0400时价格")
    private Double price0400;

    @ApiModelProperty(value = "0500时价格")
    private Double price0500;

    @ApiModelProperty(value = "0600时价格")
    private Double price0600;

    @ApiModelProperty(value = "0700时价格")
    private Double price0700;

    @ApiModelProperty(value = "0800时价格")
    private Double price0800;

    @ApiModelProperty(value = "0900时价格")
    private Double price0900;

    @ApiModelProperty(value = "1000时价格")
    private Double price1000;

    @ApiModelProperty(value = "1100时价格")
    private Double price1100;

    @ApiModelProperty(value = "1200时价格")
    private Double price1200;

    @ApiModelProperty(value = "1300时价格")
    private Double price1300;

    @ApiModelProperty(value = "1400时价格")
    private Double price1400;

    @ApiModelProperty(value = "1500时价格")
    private Double price1500;

    @ApiModelProperty(value = "1600时价格")
    private Double price1600;

    @ApiModelProperty(value = "1700时价格")
    private Double price1700;

    @ApiModelProperty(value = "1800时价格")
    private Double price1800;

    @ApiModelProperty(value = "1900时价格")
    private Double price1900;

    @ApiModelProperty(value = "2000时价格")
    private Double price2000;

    @ApiModelProperty(value = "2100时价格")
    private Double price2100;

    @ApiModelProperty(value = "2200时价格")
    private Double price2200;

    @ApiModelProperty(value = "2300时价格")
    private Double price2300;


}
