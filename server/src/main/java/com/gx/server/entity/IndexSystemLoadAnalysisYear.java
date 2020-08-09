package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 系统实际负荷分析指标-年表
 *
 * @author qingbo
 * @date 2020-04-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_system_load_analysis_year")
@ApiModel(value="IndexSystemLoadAnalysisYear对象", description="系统实际负荷分析指标-年表")
public class IndexSystemLoadAnalysisYear extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "区域名称")
    private String areaName;

    @ApiModelProperty(value = "负荷分析类型 1-统调负荷分析 2-市场负荷分析")
    private Integer type;

    @ApiModelProperty(value = "最大负荷")
    private Double maxValue;

    @ApiModelProperty(value = "最大负荷出现时间（yyyy_MM_dd hh:mm）")
    private String maxTime;

    @ApiModelProperty(value = "0000小时的系统实际负荷平均值")
    private Double pValue;

    @ApiModelProperty(value = "0000小时的系统实际负荷标准差")
    private Double dValue;

    @ApiModelProperty(value = "日期")
    private String scopeYear;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
