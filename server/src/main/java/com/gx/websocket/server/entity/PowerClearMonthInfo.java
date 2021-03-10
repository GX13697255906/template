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
 * 发电企业月结算信息
 *
 * @author houcun
 * @date 2019-11-19
 */
@Data
@NoArgsConstructor
@TableName("biz_power_clear_month_info")
@ApiModel(value = "PowerClearMonthInfo对象", description = "发电企业月结算信息")
public class PowerClearMonthInfo extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "序号")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "时间yyyyMM")
    private Date date;

    @ApiModelProperty(value = "电厂编码")
    private String facCode;

    @ApiModelProperty(value = "电厂名称")
    private String facName;

    @ApiModelProperty(value = "月结算电量")
    private Double energy;

    @ApiModelProperty(value = "发电厂月结算费用")
    private Double fee;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

}
