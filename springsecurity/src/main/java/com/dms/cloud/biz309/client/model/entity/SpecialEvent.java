package com.dms.cloud.biz309.client.model.entity;

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
 * 特殊事件数据表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_special_event")
@ApiModel(value="SpecialEvent对象", description="特殊事件数据表")
public class SpecialEvent extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "特殊事件数据id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "特殊事件名称")
    private String eventName;

    @ApiModelProperty(value = "开始时间(yyyyMMdd_hhmmss)")
    private String startTime;

    @ApiModelProperty(value = "结束时间(yyyyMMdd_hhmmss)")
    private String endTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "数据时间 -1（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private String status;


}
