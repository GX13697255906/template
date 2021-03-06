package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 送受电计划调整
 *
 * @author staton
 * @date 2019-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_elec_send_receive_plan")
@ApiModel(value = "ElecSendReceivePlan对象", description = "送受电计划调整")
public class ElecSendReceivePlan extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "序号")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "时间 - 表头，数据提交时间，yyyymmdd_hhmm:ss")
    private String dataTime;

    @ApiModelProperty(value = "计划类型")
    private String planType;

    @ApiModelProperty(value = "通道")
    private String channel;

    @ApiModelProperty(value = "开始时间")
    private Date startTime;

    @ApiModelProperty(value = "结束时间")
    private Date endTime;

    @ApiModelProperty(value = "原因")
    private String reason;

    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

}
