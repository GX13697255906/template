package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 清洁能源实际发电量指标表
 * 
 * @author Tianshuai
 * @date 2019-11-01
 */
@Data
@NoArgsConstructor
@TableName("biz_index_clean_actual")
@ApiModel(value = "IndexCleanActual对象", description = "")
public class IndexCleanActual extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "清洁能源实际发电量id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "区域名称")
    private String areaName;

    @ApiModelProperty(value = "光伏能源发电量")
    private Double light;

    @ApiModelProperty(value = "水电能源发电量")
    private Double water;

    @ApiModelProperty(value = "风电能源发电量")
    private Double wind;

    @ApiModelProperty(value = "光伏利用小时数")
    private Double lightHour;

    @ApiModelProperty(value = "水电利用小时数")
    private Double waterHour;

    @ApiModelProperty(value = "风电利用小时数")
    private Double windHour;

    @ApiModelProperty(value = "光伏发电计划电量")
    private Double lightPlan;

    @ApiModelProperty(value = "水电发电计划电量")
    private Double waterPlan;

    @ApiModelProperty(value = "风电发电计划电量")
    private Double windPlan;

    @ApiModelProperty(value = "光伏受限电量")
    private Double lightLimit;

    @ApiModelProperty(value = "水电受限电量")
    private Double waterLimit;

    @ApiModelProperty(value = "风电受限电量")
    private Double windLimit;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

}
