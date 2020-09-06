package com.dms.cloud.biz312.client.model.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 早汇报-3个备注
 *
 * @author staton
 * @date 2019-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_earlier_report_remark")
@ApiModel(value = "EarlierReportRemark对象", description = "早汇报-3个备注")
public class EarlierReportRemark extends AbstractEntity {

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
