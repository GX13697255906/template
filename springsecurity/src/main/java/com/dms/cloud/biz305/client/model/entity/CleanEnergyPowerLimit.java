package com.dms.cloud.biz305.client.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 清洁能源发电量、利用小时数、受限电量表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_clean_energy_power_limit")
@ApiModel(value = "CleanEnergyPowerLimit对象", description = "清洁能源发电量、利用小时数、受限电量表")
public class CleanEnergyPowerLimit extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "清洁能源发电量、利用小时数、受限电量id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "日期（yyyyMMdd）")
    private String date;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "区域名称")
    private String areaName;

    @ApiModelProperty(value = "电厂类型（风能、光伏、水电）")
    private String powerPlantType;

    @ApiModelProperty(value = "发电量(MWh)")
    private String generatedEnergy;

    @ApiModelProperty(value = "受限电量（MWh）")
    private String limitedEnergy;

    @ApiModelProperty(value = "利用小时数")
    private String utilHours;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
