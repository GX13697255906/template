package com.dms.cloud.biz306.client.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 用户侧报价信息表
 *
 * @author qingbo
 * @date 2019-10-11
 */
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

    @ApiModelProperty(value = "用电企业编码")
    private String userCode;

    @ApiModelProperty(value = "申报电量（万千瓦时）")
    private Double biddingEnergy;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}