package com.dms.cloud.biz308.client.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 边界数据校验信息表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_boundary_data_check")
@ApiModel(value="BoundaryDataCheck对象", description="边界数据校验信息表")
public class BoundaryDataCheck extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "边界数据校验信息ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "数据类型(短期系统负荷预测、日前联络线计 划等)")
    private String dataType;

    @ApiModelProperty(value = "数据时间(yyyymmdd_hhmmss)")
    private String dataTime;

    @ApiModelProperty(value = "校验结果(成功/失败/告警)")
    private String checkResult;

    @ApiModelProperty(value = "校验日志(例如：“XX 机组出力 500MW 超过 机组最大技术出力 400MW”)")
    private String checkLog;

    @ApiModelProperty(value = "校验时间(yyyymmdd_hhmmss)")
    private String checkTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "时间+1（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}