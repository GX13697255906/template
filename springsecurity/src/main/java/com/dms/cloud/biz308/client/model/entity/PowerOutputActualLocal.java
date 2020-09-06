package com.dms.cloud.biz308.client.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 地方电源实际出力
 *
 * @author qingbo
 * @date 2020-04-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_power_output_actual_local")
@ApiModel(value="PowerOutputActualLocal对象", description="地方电源实际出力")
public class PowerOutputActualLocal extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "区域名称")
    private String areaName;

    @ApiModelProperty(value = "类型")
    private String type;

    private Double p0000;

    private Double p0015;

    private Double p0030;

    private Double p0045;

    private Double p0100;

    private Double p0115;

    private Double p0130;

    private Double p0145;

    private Double p0200;

    private Double p0215;

    private Double p0230;

    private Double p0245;

    private Double p0300;

    private Double p0315;

    private Double p0330;

    private Double p0345;

    private Double p0400;

    private Double p0415;

    private Double p0430;

    private Double p0445;

    private Double p0500;

    private Double p0515;

    private Double p0530;

    private Double p0545;

    private Double p0600;

    private Double p0615;

    private Double p0630;

    private Double p0645;

    private Double p0700;

    private Double p0715;

    private Double p0730;

    private Double p0745;

    private Double p0800;

    private Double p0815;

    private Double p0830;

    private Double p0845;

    private Double p0900;

    private Double p0915;

    private Double p0930;

    private Double p0945;

    private Double p1000;

    private Double p1015;

    private Double p1030;

    private Double p1045;

    private Double p1100;

    private Double p1115;

    private Double p1130;

    private Double p1145;

    private Double p1200;

    private Double p1215;

    private Double p1230;

    private Double p1245;

    private Double p1300;

    private Double p1315;

    private Double p1330;

    private Double p1345;

    private Double p1400;

    private Double p1415;

    private Double p1430;

    private Double p1445;

    private Double p1500;

    private Double p1515;

    private Double p1530;

    private Double p1545;

    private Double p1600;

    private Double p1615;

    private Double p1630;

    private Double p1645;

    private Double p1700;

    private Double p1715;

    private Double p1730;

    private Double p1745;

    private Double p1800;

    private Double p1815;

    private Double p1830;

    private Double p1845;

    private Double p1900;

    private Double p1915;

    private Double p1930;

    private Double p1945;

    private Double p2000;

    private Double p2015;

    private Double p2030;

    private Double p2045;

    private Double p2100;

    private Double p2115;

    private Double p2130;

    private Double p2145;

    private Double p2200;

    private Double p2215;

    private Double p2230;

    private Double p2245;

    private Double p2300;

    private Double p2315;

    private Double p2330;

    private Double p2345;

    @ApiModelProperty(value = "日期 （yyyy-MM-dd）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
