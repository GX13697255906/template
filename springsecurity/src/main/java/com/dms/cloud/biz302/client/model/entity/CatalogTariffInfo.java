package com.dms.cloud.biz302.client.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 用电企业目录电价表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_catalog_tariff_info")
@ApiModel(value="CatalogTariffInfo对象", description="用电企业目录电价表")
public class CatalogTariffInfo extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = " 用电企业目录电价ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "电价名称")
    private String electricityPriceName;

    @ApiModelProperty(value = "适用用电性质")
    private String powerConsumptionNature;

    @ApiModelProperty(value = "适用电压等级")
    private String voltageLevel;

    @ApiModelProperty(value = "适用容量等级")
    private String capacityLevel;

    @ApiModelProperty(value = "电价类型")
    private String electricityPriceType;

    @ApiModelProperty(value = "电价，元/MW")
    private Double electricityPrice;

    @ApiModelProperty(value = "执行开始时间，yyyyMMdd_hhmm")
    private String startTime;

    @ApiModelProperty(value = "电价编码")
    private String electricityPriceCode;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

}
