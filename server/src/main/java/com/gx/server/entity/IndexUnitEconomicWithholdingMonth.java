package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_unit_economic_withholding_month")
@ApiModel(value="IndexUnitEconomicWithholdingMonth对象", description="机组经济持留月表")
public class IndexUnitEconomicWithholdingMonth extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "电厂编码")
    private String powerPlantCode;

    @ApiModelProperty(value = "电厂名称")
    private String powerPlantName;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "机组名称")
    private String unitName;

    @ApiModelProperty(value = "时间  格式：yyyy-MM")
    private String date;

    @ApiModelProperty(value = "经济持留容量")
    private Double enconmicWithholdingCapacity;

    @ApiModelProperty(value = "经济持留区平均报价")
    private Double enconmicWithholdingAvgOffer;

    @ApiModelProperty(value = "经济持留指数")
    private Double enconmicWithholdingIndex;

    @ApiModelProperty(value = "经济持留指数占比")
    private Double enconmicWithholdingIndexProportion;

    @ApiModelProperty(value = "日期")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
