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
 * 早汇报-3个备注
 *
 * @author staton
 * @date 2019-11-19
 */
@Data
@NoArgsConstructor
@TableName("biz_earlier_report_remark")
@ApiModel(value = "EarlierReportRemark对象", description = "早汇报-3个备注")
public class EarlierReportRemark extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "类型：1停复电操作情况的备注 2设备跳闸及处置情况的备注 3人工干预记录的备注")
    private Integer type;

    @ApiModelProperty(value = "备注")
    private String remark;

    private Date scopeDate;

    private Integer status;

}
