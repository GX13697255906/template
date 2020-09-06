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
 * 机组启动及空载报价表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_unit_quote_info")
@ApiModel(value="UnitQuoteInfo对象", description="机组启动及空载报价表")
public class UnitQuoteInfo extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "机组启动及空载报价id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "电厂编码")
    private String powerPlantCode;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "电厂名称")
    private String powerPlantName;

    @ApiModelProperty(value = "机组名称(名称现货市场要求为准")
    private String unitName;

    @ApiModelProperty(value = "热态启动报价（元/次）")
    private Double hotstartingCost;

    @ApiModelProperty(value = "温态启动报价（元/次）")
    private Double warmstartingCost;

    @ApiModelProperty(value = "冷态启动报价（元/次）")
    private Double coldstartingCost;

    @ApiModelProperty(value = "空载费用报价（元/小时）")
    private Double unloadedCost;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
