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
 * 发电侧上网电价与节点电价指标表
 *
 * @author qingbo
 * @date 2019-11-09
 */
@Data
@TableName("biz_index_power_and_node_price")
@ApiModel(value = "IndexPowerAndNodePrice对象", description = "发电侧上网电价与节点电价指标表")
public class IndexPowerAndNodePrice extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "发电侧上网电价与节点电价指标id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "指标类型：1代表发电侧上网电价与节点电价的差值； 2代表发电侧上网电价与节点电价的变化率")
    private Integer indexType;

    @ApiModelProperty(value = "00:00 指标值")
    private Double value0;

    @ApiModelProperty(value = "01:00 指标值")
    private Double value1;

    @ApiModelProperty(value = "02:00 指标值")
    private Double value2;

    @ApiModelProperty(value = "03:00 指标值")
    private Double value3;

    @ApiModelProperty(value = "04:00 指标值")
    private Double value4;

    @ApiModelProperty(value = "05:00 指标值")
    private Double value5;

    @ApiModelProperty(value = "06:00 指标值")
    private Double value6;

    @ApiModelProperty(value = "07:00 指标值")
    private Double value7;

    @ApiModelProperty(value = "08:00 指标值")
    private Double value8;

    @ApiModelProperty(value = "09:00 指标值")
    private Double value9;

    @ApiModelProperty(value = "10:00 指标值")
    private Double value10;

    @ApiModelProperty(value = "11:00 指标值")
    private Double value11;

    @ApiModelProperty(value = "12:00 指标值")
    private Double value12;

    @ApiModelProperty(value = "13:00 指标值")
    private Double value13;

    @ApiModelProperty(value = "14:00 指标值")
    private Double value14;

    @ApiModelProperty(value = "15:00 指标值")
    private Double value15;

    @ApiModelProperty(value = "16:00 指标值")
    private Double value16;

    @ApiModelProperty(value = "17:00 指标值")
    private Double value17;

    @ApiModelProperty(value = "18:00 指标值")
    private Double value18;

    @ApiModelProperty(value = "19:00 指标值")
    private Double value19;

    @ApiModelProperty(value = "20:00 指标值")
    private Double value20;

    @ApiModelProperty(value = "21:00 指标值")
    private Double value21;

    @ApiModelProperty(value = "22:00 指标值")
    private Double value22;

    @ApiModelProperty(value = "23:00 指标值")
    private Double value23;

    @ApiModelProperty(value = "指标时间（yyyy-MM-dd）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Long status;


}
