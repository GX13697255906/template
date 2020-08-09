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
import java.util.Date;

/**
 * 系统实际负荷分析指标-小时表
 *
 * @author xun.guo
 * @date 2020-04-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_system_load_analysis_hour")
@ApiModel(value="IndexSystemLoadAnalysisHour对象", description="系统实际负荷分析指标-小时表")
public class IndexSystemLoadAnalysisHour extends AbstractEntity implements Serializable {

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
    private Double p0000;

    @ApiModelProperty(value = "0000小时的系统实际负荷标准差")
    private Double d0000;

    private Double p0100;

    private Double d0100;

    private Double p0200;

    private Double d0200;

    private Double p0300;

    private Double d0300;

    private Double p0400;

    private Double d0400;

    private Double p0500;

    private Double d0500;

    private Double p0600;

    private Double d0600;

    private Double p0700;

    private Double d0700;

    private Double p0800;

    private Double d0800;

    private Double p0900;

    private Double d0900;

    private Double p1000;

    private Double d1000;

    private Double p1100;

    private Double d1100;

    private Double p1200;

    private Double d1200;

    private Double p1300;

    private Double d1300;

    private Double p1400;

    private Double d1400;

    private Double p1500;

    private Double d1500;

    private Double p1600;

    private Double d1600;

    private Double p1700;

    private Double d1700;

    private Double p1800;

    private Double d1800;

    private Double p1900;

    private Double d1900;

    private Double p2000;

    private Double d2000;

    private Double p2100;

    private Double d2100;

    private Double p2200;

    private Double d2200;

    private Double p2300;

    private Double d2300;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
