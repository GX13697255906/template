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
 * 新增启停机组
 *
 * @author staton
 * @date 2019-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_new_unit_start_stop")
@ApiModel(value = "NewUnitStartStop对象", description = "新增启停机组")
public class NewUnitStartStop extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "序号")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "时间 - 表头，数据提交时间，yyyymmdd_hhmm:ss")
    private String dataTime;

    @ApiModelProperty(value = "电厂名称")
    private String facName;

    @ApiModelProperty(value = "机组")
    private String unitName;

    @ApiModelProperty(value = "开停机行为")
    private String behavior;

    @ApiModelProperty(value = "日前计划")
    private String plan;

    @ApiModelProperty(value = "原因")
    private String reason;

    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

}
