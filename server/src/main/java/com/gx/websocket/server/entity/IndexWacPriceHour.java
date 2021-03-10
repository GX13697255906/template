package com.gx.websocket.server.entity;

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
 * 综合加权平均电价指标-小时表
 *
 * @author houcun
 * @date 2020-04-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_wac_price_hour")
@ApiModel(value="IndexWacPriceHour对象", description="综合加权平均电价指标-小时表")
public class IndexWacPriceHour extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "电厂编码/用户编码")
    private String code;

    @ApiModelProperty(value = "电厂名称/用户名称")
    private String name;

    @ApiModelProperty(value = "所属行政区域")
    private String administrativeDivision;

    @ApiModelProperty(value = "机组名称")
    private String unitName;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "1.用户侧 2.发电侧")
    private String type;

    @ApiModelProperty(value = "0000小时的价格一致性指数")
    private String p0000;

    @ApiModelProperty(value = "0000小时日前出清量加权平均电价")
    private String a0000;

    @ApiModelProperty(value = "0000小时实时出清量加权平均电价")
    private String r0000;

    private String p0100;

    private String a0100;

    private String r0100;

    private String p0200;

    private String a0200;

    private String r0200;

    private String p0300;

    private String a0300;

    private String r0300;

    private String p0400;

    private String a0400;

    private String r0400;

    private String p0500;

    private String a0500;

    private String r0500;

    private String p0600;

    private String a0600;

    private String r0600;

    private String p0700;

    private String a0700;

    private String r0700;

    private String p0800;

    private String a0800;

    private String r0800;

    private String p0900;

    private String a0900;

    private String r0900;

    private String p1000;

    private String a1000;

    private String r1000;

    private String p1100;

    private String a1100;

    private String r1100;

    private String p1200;

    private String a1200;

    private String r1200;

    private String p1300;

    private String a1300;

    private String r1300;

    private String p1400;

    private String a1400;

    private String r1400;

    private String p1500;

    private String a1500;

    private String r1500;

    private String p1600;

    private String a1600;

    private String r1600;

    private String p1700;

    private String a1700;

    private String r1700;

    private String p1800;

    private String a1800;

    private String r1800;

    private String p1900;

    private String a1900;

    private String r1900;

    private String p2000;

    private String a2000;

    private String r2000;

    private String p2100;

    private String a2100;

    private String r2100;

    private String p2200;

    private String a2200;

    private String r2200;

    private String p2300;

    private String a2300;

    private String r2300;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
