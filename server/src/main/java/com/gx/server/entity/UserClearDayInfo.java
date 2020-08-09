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
 * 批发用户日清算信息
 *
 * @author houcun
 * @date 2019-11-19
 */
@Data
@NoArgsConstructor
@TableName("biz_user_clear_day_info")
@ApiModel(value = "UserClearDayInfo对象", description = "批发用户日清算信息")
public class UserClearDayInfo extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "序号")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "时间yyyyMMdd")
    private Date date;

    @ApiModelProperty(value = "批发用户名称")
    private String userName;

    @ApiModelProperty(value = "用户编码")
    private String userCode;

    @ApiModelProperty(value = "时刻HHmm")
    private Date dataTime;

    @ApiModelProperty(value = "结算电量")
    private Double energy;

    @ApiModelProperty(value = "用户日清算费用")
    private Double fee;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

}
