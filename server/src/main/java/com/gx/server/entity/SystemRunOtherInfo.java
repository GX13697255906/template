package com.gx.server.entity;

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
 * 其他系统与现货系统协同运行情况
 *
 * @author staton
 * @date 2019-11-19
 */
@Data
@NoArgsConstructor
@TableName("biz_system_run_other_info")
@ApiModel(value = "SystemRunOtherInfo对象", description = "其他系统与现货系统协同运行情况")
public class SystemRunOtherInfo extends AbstractEntity implements Serializable {

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

    @ApiModelProperty(value = "运行情况")
    private String abnormal;

    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

}
