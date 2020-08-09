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
 * 预测指标表
 *
 * @author houcun
 * @date 2019-10-24
 */
@Data
@TableName("biz_index_divine")
@ApiModel(value = "IndexDivine对象", description = "预测指标表")
public class IndexDivine extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "预测类型（1-日前系统负荷预测  2-A类机组出力预测）")
    private String type;

    @ApiModelProperty(value = "预测值（元/MWh）")
    private Double value;

    @ApiModelProperty(value = "实际负荷值（MW）")
    private Double actualValue;

    @ApiModelProperty(value = "预测负荷值（MW）")
    private Double forecastValue;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
