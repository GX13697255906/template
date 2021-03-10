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

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_user_quote_info")
@ApiModel(value="UserQuoteInfo对象", description="用户侧报价信息表")
public class UserQuoteInfo extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户侧标价信息id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "日期（yyyyMMdd）")
    private String date;

    @ApiModelProperty(value = "时刻（hhmm）")
    private String time;

    @ApiModelProperty(value = "用电企业名称")
    private String userEnterpriseName;

    @ApiModelProperty(value = "用户编码")
    private String userCode;

    @ApiModelProperty(value = "申报电量（万千瓦时）")
    private Double biddingEnergy;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
