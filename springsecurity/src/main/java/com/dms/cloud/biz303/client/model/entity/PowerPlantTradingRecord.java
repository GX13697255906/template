package com.dms.cloud.biz303.client.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 发电企业基数合约/中长期合约交易记录表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_power_plant_trading_record")
@ApiModel(value = "PowerPlantTradingRecord对象", description = "发电企业基数合约/中长期合约交易记录表")
public class PowerPlantTradingRecord extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "交易记录ID")
    @TableId(value = "trading_id", type = IdType.ID_WORKER)
    private Long tradingId;

    @ApiModelProperty(value = "交易编码")
    private String tradingCode;

    @ApiModelProperty(value = "交易类型")
    private String tradingType;

    @ApiModelProperty(value = "交易名称")
    private String tradingName;

    @ApiModelProperty(value = "买方企业编码")
    private String buyerEnterpriseCode;

    @ApiModelProperty(value = "买方企业名称")
    private String buyerEnterpriseName;

    @ApiModelProperty(value = "买方企业类型（发电企业、用电企业）")
    private String buyerEnterpriseType;

    @ApiModelProperty(value = "买方企业机组编码（如不是发电企业则为null）")
    private String buyerUnitCode;

    @ApiModelProperty(value = "买方企业机组名称（如不是发电企业则为null）")
    private String buyerUnitName;

    @ApiModelProperty(value = "卖方企业编码")
    private String sellerEnterpriseCode;

    @ApiModelProperty(value = "卖方企业名称")
    private String sellerEnterpriseName;

    @ApiModelProperty(value = "卖方企业类型（发电企业、用电企业）")
    private String sellerEnterpriseType;

    @ApiModelProperty(value = "卖方企业机组编码（如不是发电企业则为null）")
    private String sellerUnitCode;

    @ApiModelProperty(value = "卖方企业机组名称（如不是发电企业则为null）")
    private String sellerUnitName;

    @ApiModelProperty(value = "交易日期（yyyyMMdd）")
    private String tradeDate;

    @ApiModelProperty(value = "交易时刻（hh:mm）")
    private String tradeTime;

    @ApiModelProperty(value = "交易电量（MWh）")
    private Double electricalEnergy;

    @ApiModelProperty(value = "买价")
    private Double buyerPrice;

    @ApiModelProperty(value = "卖价")
    private Double sellerPrice;

    @ApiModelProperty(value = "1-基数合约  2-中长期合约")
    private String type;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

}
