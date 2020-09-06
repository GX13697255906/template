package com.dms.cloud.biz311.client.model.entity;

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
 * 售电公司月结算信息
 *
 * @author houcun
 * @date 2019-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_sale_company_clear_month_info")
@ApiModel(value = "SaleCompanyClearMonthInfo对象", description = "售电公司月结算信息")
public class SaleCompanyClearMonthInfo extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "序号")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "时间yyyyMM")
    private Date date;

    @ApiModelProperty(value = "售电公司名称")
    private String userName;

    @ApiModelProperty(value = "售电公司编码")
    private String userCode;

    @ApiModelProperty(value = "售电公司月结算电量")
    private Double energy;

    @ApiModelProperty(value = "售电公司月结算费用")
    private Double fee;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

}
