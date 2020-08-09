package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 目录电价和加权平均综合电价指标表
 *
 * @author houcun
 * @date 2019-10-24
 */
@Data
@TableName("biz_index_catalog_tariff")
@ApiModel(value = "IndexCatalogTariff对象", description = "目录电价和加权平均综合电价指标表")
public class IndexCatalogTariff extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "适用用电性质")
    private String powerConsumptionNature;

    @ApiModelProperty(value = "适用电压等级")
    private String voltageLevel;

    @ApiModelProperty(value = "适用容量等级")
    private String capacityLevel;

    @ApiModelProperty(value = "指标类型（1-目录电价和加权平均综合电价差值,2-目录电价和加权平均综合电上浮率）")
    private Integer type;

    @ApiModelProperty(value = "0小时目录电价和加权平均综合电价指标")
    private Double value0;

    @ApiModelProperty(value = "1小时目录电价和加权平均综合电价指标")
    private Double value1;

    @ApiModelProperty(value = "2小时目录电价和加权平均综合电价指标")
    private Double value2;

    @ApiModelProperty(value = "3小时目录电价和加权平均综合电价指标")
    private Double value3;

    @ApiModelProperty(value = "4小时目录电价和加权平均综合电价指标")
    private Double value4;

    @ApiModelProperty(value = "5小时目录电价和加权平均综合电价指标")
    private Double value5;

    @ApiModelProperty(value = "6小时目录电价和加权平均综合电价指标")
    private Double value6;

    @ApiModelProperty(value = "7小时目录电价和加权平均综合电价指标")
    private Double value7;

    @ApiModelProperty(value = "8小时目录电价和加权平均综合电价指标")
    private Double value8;

    @ApiModelProperty(value = "9小时目录电价和加权平均综合电价指标")
    private Double value9;

    @ApiModelProperty(value = "10小时目录电价和加权平均综合电价指标")
    private Double value10;

    @ApiModelProperty(value = "11小时目录电价和加权平均综合电价指标")
    private Double value11;

    @ApiModelProperty(value = "12小时目录电价和加权平均综合电价指标")
    private Double value12;

    @ApiModelProperty(value = "13小时目录电价和加权平均综合电价指标")
    private Double value13;

    @ApiModelProperty(value = "14小时目录电价和加权平均综合电价指标")
    private Double value14;

    @ApiModelProperty(value = "15小时目录电价和加权平均综合电价指标")
    private Double value15;

    @ApiModelProperty(value = "16小时目录电价和加权平均综合电价指标")
    private Double value16;

    @ApiModelProperty(value = "17小时目录电价和加权平均综合电价指标")
    private Double value17;

    @ApiModelProperty(value = "18小时目录电价和加权平均综合电价指标")
    private Double value18;

    @ApiModelProperty(value = "19小时目录电价和加权平均综合电价指标")
    private Double value19;

    @ApiModelProperty(value = "20小时目录电价和加权平均综合电价指标")
    private Double value20;

    @ApiModelProperty(value = "21小时目录电价和加权平均综合电价指标")
    private Double value21;

    @ApiModelProperty(value = "22小时目录电价和加权平均综合电价指标")
    private Double value22;

    @ApiModelProperty(value = "23小时目录电价和加权平均综合电价指标")
    private Double value23;

    @ApiModelProperty(value = "日期(yyyy-MM-dd)")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
