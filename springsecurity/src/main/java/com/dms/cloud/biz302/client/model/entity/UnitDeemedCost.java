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
 * 机组核定成本表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_unit_deemed_cost")
@ApiModel(value="UnitDeemedCost对象", description="机组核定成本表")
public class UnitDeemedCost extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "机组核定成本ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "电厂编码")
    private String powerPlantCode;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "电厂名称")
    private String powerPlantName;

    @ApiModelProperty(value = "机组名称")
    private String unitName;

    @ApiModelProperty(value = "冷态启动成本，元")
    private Double coldstartingCost;

    @ApiModelProperty(value = "温态启动成本，元")
    private Double warmstartingCost;

    @ApiModelProperty(value = "热态启动成本，元")
    private Double hotstartingCost;

    @ApiModelProperty(value = "空载成本，元/小时")
    private Double unloadedCost;

    @ApiModelProperty(value = "能量成本，元/MW")
    private Double energyCost;

    @ApiModelProperty(value = "有效时间，yyyyMMdd_hhmm")
    private String effectiveTime;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
