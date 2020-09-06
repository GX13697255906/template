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
 * 系统运行异常及处置
 *
 * @author staton
 * @date 2019-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_system_run_exception_handle")
@ApiModel(value = "SystemRunExceptionHandle对象", description = "系统运行异常及处置")
public class SystemRunExceptionHandle extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "序号")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "时间 - 表头，数据提交时间，yyyymmdd_hhmm:ss")
    private String dataTime;

    @ApiModelProperty(value = "填报人")
    private String userName;

    @ApiModelProperty(value = "市场类型")
    private String marketType;

    @ApiModelProperty(value = "异常")
    private String abnormal;

    @ApiModelProperty(value = "现象")
    private String appearance;

    @ApiModelProperty(value = "问题排除")
    private String cause;

    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

}
