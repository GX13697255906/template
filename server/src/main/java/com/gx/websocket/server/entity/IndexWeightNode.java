package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 加权平均综合电价指标
 *
 * @author qingbo
 * @date 2019-11-07
 */
@Data
@TableName("biz_index_weight_node")
@ApiModel(value = "IndexWeightNode对象", description = "加权平均综合电价指标")
public class IndexWeightNode extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "分区编号")
    private String zoneCode;

    @ApiModelProperty(value = "所属省/地级行政区")
    private String pertain;

    @ApiModelProperty(value = "指标类型（指标类型 1-加权平均综合电价平均值,2-加权平均综合电价中位数，3-加权平均综合电价标准差,4-加权平均综合电价上四分位，5-加权平均综合电价下四分位，6-加权平均综合电价最大值，7-加权平均综合电价最小值）")
    private Integer indexType;

    @ApiModelProperty(value = "0小时加权平均综合电价指标值")
    private Double value0;

    @ApiModelProperty(value = "1小时加权平均综合电价指标值")
    private Double value1;

    @ApiModelProperty(value = "2小时加权平均综合电价指标值")
    private Double value2;

    @ApiModelProperty(value = "3小时加权平均综合电价指标值")
    private Double value3;

    @ApiModelProperty(value = "4小时加权平均综合电价指标值")
    private Double value4;

    @ApiModelProperty(value = "5小时加权平均综合电价指标值")
    private Double value5;

    @ApiModelProperty(value = "6小时加权平均综合电价指标值")
    private Double value6;

    @ApiModelProperty(value = "7小时加权平均综合电价指标值")
    private Double value7;

    @ApiModelProperty(value = "8小时加权平均综合电价指标值")
    private Double value8;

    @ApiModelProperty(value = "9小时加权平均综合电价指标值")
    private Double value9;

    @ApiModelProperty(value = "10小时加权平均综合电价指标值")
    private Double value10;

    @ApiModelProperty(value = "11小时加权平均综合电价指标值")
    private Double value11;

    @ApiModelProperty(value = "12小时加权平均综合电价指标值")
    private Double value12;

    @ApiModelProperty(value = "13小时加权平均综合电价指标值")
    private Double value13;

    @ApiModelProperty(value = "14小时加权平均综合电价指标值")
    private Double value14;

    @ApiModelProperty(value = "15小时加权平均综合电价指标值")
    private Double value15;

    @ApiModelProperty(value = "16小时加权平均综合电价指标值")
    private Double value16;

    @ApiModelProperty(value = "17小时加权平均综合电价指标值")
    private Double value17;

    @ApiModelProperty(value = "18小时加权平均综合电价指标值")
    private Double value18;

    @ApiModelProperty(value = "19小时加权平均综合电价指标值")
    private Double value19;

    @ApiModelProperty(value = "20小时加权平均综合电价指标值")
    private Double value20;

    @ApiModelProperty(value = "21小时加权平均综合电价指标值")
    private Double value21;

    @ApiModelProperty(value = "22小时加权平均综合电价指标值")
    private Double value22;

    @ApiModelProperty(value = "23小时加权平均综合电价指标值")
    private Double value23;

    @ApiModelProperty(value = "日期(yyyy-MM-dd)")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
