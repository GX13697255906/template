package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 边界数据调整记录表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Getter
@Setter
@NoArgsConstructor
@TableName("biz_boundary_data_adjust")
@ApiModel(value="BoundaryDataAdjust对象", description="边界数据调整记录表")
public class BoundaryDataAdjust extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "边界数据调整记录id")
    @TableId(value = "id")
    private Long id;

    @ApiModelProperty(value = "发生时间(yyyyMMdd_hhmmss)")
    private String dateTime;

    @ApiModelProperty(value = "操作人")
    private String staff;

    @ApiModelProperty(value = "调整内容(包括机组注册参数、约束条件、边 界数据，例如“把 XX 机组上限由 600MW 改为 500MW”)")
    private String adjustContent;

    @ApiModelProperty(value = "调整原因(例如“实际限高”)")
    private String adjustReason;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "数据时间 -1（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
