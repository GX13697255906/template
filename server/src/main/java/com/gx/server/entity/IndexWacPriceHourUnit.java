package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 综合加权平均电价指标-机组小时表
 *
 * @author houcun
 * @date 2020-04-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_wac_price_hour_unit")
@ApiModel(value="IndexWacPriceHourUnit对象", description="综合加权平均电价指标-机组小时表")
public class IndexWacPriceHourUnit extends AbstractEntity implements Serializable {

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

    @ApiModelProperty(value = "所属行政区域")
    private String administrativeDivision;

    @ApiModelProperty(value = "机组名称")
    private String unitName;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "0000小时的价格一致性指数")
    private Double p0000;

    @ApiModelProperty(value = "0000小时日前出清量加权平均电价")
    private Double a0000;

    @ApiModelProperty(value = "0000小时实时出清量加权平均电价")
    private Double r0000;

    private Double p0100;

    private Double a0100;

    private Double r0100;

    private Double p0200;

    private Double a0200;

    private Double r0200;

    private Double p0300;

    private Double a0300;

    private Double r0300;

    private Double p0400;

    private Double a0400;

    private Double r0400;

    private Double p0500;

    private Double a0500;

    private Double r0500;

    private Double p0600;

    private Double a0600;

    private Double r0600;

    private Double p0700;

    private Double a0700;

    private Double r0700;

    private Double p0800;

    private Double a0800;

    private Double r0800;

    private Double p0900;

    private Double a0900;

    private Double r0900;

    private Double p1000;

    private Double a1000;

    private Double r1000;

    private Double p1100;

    private Double a1100;

    private Double r1100;

    private Double p1200;

    private Double a1200;

    private Double r1200;

    private Double p1300;

    private Double a1300;

    private Double r1300;

    private Double p1400;

    private Double a1400;

    private Double r1400;

    private Double p1500;

    private Double a1500;

    private Double r1500;

    private Double p1600;

    private Double a1600;

    private Double r1600;

    private Double p1700;

    private Double a1700;

    private Double r1700;

    private Double p1800;

    private Double a1800;

    private Double r1800;

    private Double p1900;

    private Double a1900;

    private Double r1900;

    private Double p2000;

    private Double a2000;

    private Double r2000;

    private Double p2100;

    private Double a2100;

    private Double r2100;

    private Double p2200;

    private Double a2200;

    private Double r2200;

    private Double p2300;

    private Double a2300;

    private Double r2300;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
