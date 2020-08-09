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

/**
 * 综合加权平均电价指标-月表
 *
 * @author houcun
 * @date 2020-04-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_wac_price_month")
@ApiModel(value="IndexWacPriceMonth对象", description="综合加权平均电价指标-月表")
public class IndexWacPriceMonth extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "1.用户侧 2.发电侧")
    private String type;

    @ApiModelProperty(value = "价格一致性指数")
    private String pValue;

    @ApiModelProperty(value = "日前出清量加权平均电价")
    private String aValue;

    @ApiModelProperty(value = "0000小时实时出清量加权平均电价")
    private String rValue;

    @ApiModelProperty(value = "日期(yyyy_MM)")
    private String scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
