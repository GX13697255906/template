package com.dms.cloud.biz309.client.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 市场全局参数
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_market_global_parameter")
@ApiModel(value="MarketGlobalParameter对象", description="市场全局参数")
public class MarketGlobalParameter extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "市场全局参数id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "市场类型(日前市场/实时市场/调频市场)")
    private String marketType;

    @ApiModelProperty(value = "申报开始时间(yyyyMMdd_hhmmss)")
    private String bidtimeStart;

    @ApiModelProperty(value = "申报结束时间(yyyyMMdd_hhmmss)")
    private String bidtimeEnd;

    @ApiModelProperty(value = "出清计算周期_分钟(例如 5/15/1440)")
    private Long clearingCalculationPeriod;

    @ApiModelProperty(value = "出清计划间隔_分钟(例如 5/15)")
    private Long clearingPlanInterval;

    @ApiModelProperty(value = "价格帽")
    private Double priceCap;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "数据时间（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

    public static final String MARKET_TYPE = "market_type";

}
