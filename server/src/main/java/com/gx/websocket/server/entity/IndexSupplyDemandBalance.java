package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 供需平衡指标服务
 *
 * @author staton
 * @date 2019-10-27
 */
@Data
@TableName("biz_index_supply_demand_balance")
@ApiModel(value = "IndexSupplyDemandBalance对象", description = "供需平衡指标服务")
public class IndexSupplyDemandBalance extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @ApiModelProperty(value = "存储类型：1 小时供需平衡价格 2 月小时供需平衡价格平均值 3 季小时供需平衡价格平均值 4 年小时供需平衡价格平均值")
    private Integer valueType;

    @ApiModelProperty(value = "价格")
    private Double value;

    @ApiModelProperty(value = "负荷")
    private Double loadValue;

    @ApiModelProperty(value = "日期（yyyy-MM-dd HH:mm:00）")
    private Date scopeDate;

    private Integer status;


}
