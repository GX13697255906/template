package com.dms.cloud.biz306.client.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 机组能量报价表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_unit_energy_quote_info")
@ApiModel(value="UnitEnergyQuoteInfo对象", description="机组能量报价表")
public class UnitEnergyQuoteInfo extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "机组能量报价id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "电厂编码")
    private String powerPlantCode;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "电厂名称")
    private String powerPlantName;

    @ApiModelProperty(value = "机组名称(名称现货市场要求为准)")
    private String unitName;

    @ApiModelProperty(value = "时间（yyyyMMdd_hhmm）")
    private String dateTime;

    @ApiModelProperty(value = "段序号")
    private String segmentOrder;

    @ApiModelProperty(value = "分段起始容量（MW）")
    private Double segmentInitialCapacity;

    @ApiModelProperty(value = "分段终止容量（MW）")
    private Double segmentTerminalCapacity;

    @ApiModelProperty(value = "分段报价（元/MW）")
    private Double segmentBid;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
