package com.dms.cloud.biz305.client.model.entity;

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
 * 清洁能源发电计划表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_clean_energy_electric_plan")
@ApiModel(value="CleanEnergyElectricPlan对象", description="清洁能源发电计划表")
public class CleanEnergyElectricPlan extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "清洁能源发电计划表id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码,以区域编码要求为准")
    private String areaCode;

    @ApiModelProperty(value = "区域名称,广东、广西、云南、贵州、海 南、广州、深圳")
    private String areaName;

    @ApiModelProperty(value = "发电类型,风能、光伏、水电")
    private String powerGenerationType;

    @ApiModelProperty(value = "电量数（MWh）")
    private String energy;

    @ApiModelProperty(value = "日期（yyyyMMdd）")
    private String date;

    @ApiModelProperty(value = "最大电力（MW）")
    private String maxEnergy;

    @ApiModelProperty(value = "最小电力（MW）")
    private String minEnergy;

    @ApiModelProperty(value = "0000 负荷（MW）")
    private Double p1;

    @ApiModelProperty(value = "0015 负荷（MW）")
    private Double p2;

    @ApiModelProperty(value = "0030 负荷（MW）")
    private Double p3;

    @ApiModelProperty(value = "0045 负荷（MW）")
    private Double p4;

    @ApiModelProperty(value = "0100 负荷（MW）")
    private Double p5;

    @ApiModelProperty(value = "0115 负荷（MW）")
    private Double p6;

    @ApiModelProperty(value = "0130 负荷（MW）")
    private Double p7;

    @ApiModelProperty(value = "0145 负荷（MW）")
    private Double p8;

    @ApiModelProperty(value = "0200 负荷（MW）")
    private Double p9;

    @ApiModelProperty(value = "0215 负荷（MW）")
    private Double p10;

    @ApiModelProperty(value = "0230 负荷（MW）")
    private Double p11;

    @ApiModelProperty(value = "0245 负荷（MW）")
    private Double p12;

    @ApiModelProperty(value = "0300 负荷（MW）")
    private Double p13;

    @ApiModelProperty(value = "0315 负荷（MW）")
    private Double p14;

    @ApiModelProperty(value = "0330 负荷（MW）")
    private Double p15;

    @ApiModelProperty(value = "0345 负荷（MW）")
    private Double p16;

    @ApiModelProperty(value = "0400 负荷（MW）")
    private Double p17;

    @ApiModelProperty(value = "0415 负荷（MW）")
    private Double p18;

    @ApiModelProperty(value = "0430 负荷（MW）")
    private Double p19;

    @ApiModelProperty(value = "0445 负荷（MW）")
    private Double p20;

    @ApiModelProperty(value = "0500 负荷（MW）")
    private Double p21;

    @ApiModelProperty(value = "0515 负荷（MW）")
    private Double p22;

    @ApiModelProperty(value = "0530 负荷（MW）")
    private Double p23;

    @ApiModelProperty(value = "0545 负荷（MW）")
    private Double p24;

    @ApiModelProperty(value = "0600 负荷（MW）")
    private Double p25;

    @ApiModelProperty(value = "0615 负荷（MW）")
    private Double p26;

    @ApiModelProperty(value = "0630 负荷（MW）")
    private Double p27;

    @ApiModelProperty(value = "0645 负荷（MW）")
    private Double p28;

    @ApiModelProperty(value = "0700 负荷（MW）")
    private Double p29;

    @ApiModelProperty(value = "0715 负荷（MW）")
    private Double p30;

    @ApiModelProperty(value = "0730 负荷（MW）")
    private Double p31;

    @ApiModelProperty(value = "0745 负荷（MW）")
    private Double p32;

    @ApiModelProperty(value = "0800 负荷（MW）")
    private Double p33;

    @ApiModelProperty(value = "0815 负荷（MW）")
    private Double p34;

    @ApiModelProperty(value = "0830 负荷（MW）")
    private Double p35;

    @ApiModelProperty(value = "0845 负荷（MW）")
    private Double p36;

    @ApiModelProperty(value = "0900 负荷（MW）")
    private Double p37;

    @ApiModelProperty(value = "0915 负荷（MW）")
    private Double p38;

    @ApiModelProperty(value = "0930 负荷（MW）")
    private Double p39;

    @ApiModelProperty(value = "0945 负荷（MW）")
    private Double p40;

    @ApiModelProperty(value = "1000 负荷（MW）")
    private Double p41;

    @ApiModelProperty(value = "1015 负荷（MW）")
    private Double p42;

    @ApiModelProperty(value = "1030 负荷（MW）")
    private Double p43;

    @ApiModelProperty(value = "1045 负荷（MW）")
    private Double p44;

    @ApiModelProperty(value = "1100 负荷（MW）")
    private Double p45;

    @ApiModelProperty(value = "1115 负荷（MW）")
    private Double p46;

    @ApiModelProperty(value = "1130 负荷（MW）")
    private Double p47;

    @ApiModelProperty(value = "1145 负荷（MW）")
    private Double p48;

    @ApiModelProperty(value = "1200 负荷（MW）")
    private Double p49;

    @ApiModelProperty(value = "1215 负荷（MW）")
    private Double p50;

    @ApiModelProperty(value = "1230 负荷（MW）")
    private Double p51;

    @ApiModelProperty(value = "1245 负荷（MW）")
    private Double p52;

    @ApiModelProperty(value = "1300 负荷（MW）")
    private Double p53;

    @ApiModelProperty(value = "1315 负荷（MW）")
    private Double p54;

    @ApiModelProperty(value = "1330 负荷（MW）")
    private Double p55;

    @ApiModelProperty(value = "1345 负荷（MW）")
    private Double p56;

    @ApiModelProperty(value = "1400 负荷（MW）")
    private Double p57;

    @ApiModelProperty(value = "1415 负荷（MW）")
    private Double p58;

    @ApiModelProperty(value = "1430 负荷（MW）")
    private Double p59;

    @ApiModelProperty(value = "1445 负荷（MW）")
    private Double p60;

    @ApiModelProperty(value = "1500 负荷（MW）")
    private Double p61;

    @ApiModelProperty(value = "1515 负荷（MW）")
    private Double p62;

    @ApiModelProperty(value = "1530 负荷（MW）")
    private Double p63;

    @ApiModelProperty(value = "1545 负荷（MW）")
    private Double p64;

    @ApiModelProperty(value = "1600 负荷（MW）")
    private Double p65;

    @ApiModelProperty(value = "1615 负荷（MW）")
    private Double p66;

    @ApiModelProperty(value = "1630 负荷（MW）")
    private Double p67;

    @ApiModelProperty(value = "1645 负荷（MW）")
    private Double p68;

    @ApiModelProperty(value = "1700 负荷（MW）")
    private Double p69;

    @ApiModelProperty(value = "1715 负荷（MW）")
    private Double p70;

    @ApiModelProperty(value = "1730 负荷（MW）")
    private Double p71;

    @ApiModelProperty(value = "1745 负荷（MW）")
    private Double p72;

    @ApiModelProperty(value = "1800 负荷（MW）")
    private Double p73;

    @ApiModelProperty(value = "1815 负荷（MW）")
    private Double p74;

    @ApiModelProperty(value = "1830 负荷（MW）")
    private Double p75;

    @ApiModelProperty(value = "1845 负荷（MW）")
    private Double p76;

    @ApiModelProperty(value = "1900 负荷（MW）")
    private Double p77;

    @ApiModelProperty(value = "1915 负荷（MW）")
    private Double p78;

    @ApiModelProperty(value = "1930 负荷（MW）")
    private Double p79;

    @ApiModelProperty(value = "1945 负荷（MW）")
    private Double p80;

    @ApiModelProperty(value = "2000 负荷（MW）")
    private Double p81;

    @ApiModelProperty(value = "2015 负荷（MW）")
    private Double p82;

    @ApiModelProperty(value = "2030 负荷（MW）")
    private Double p83;

    @ApiModelProperty(value = "2045 负荷（MW）")
    private Double p84;

    @ApiModelProperty(value = "2100 负荷（MW）")
    private Double p85;

    @ApiModelProperty(value = "2115 负荷（MW）")
    private Double p86;

    @ApiModelProperty(value = "2130 负荷（MW）")
    private Double p87;

    @ApiModelProperty(value = "2145 负荷（MW）")
    private Double p88;

    @ApiModelProperty(value = "2200 负荷（MW）")
    private Double p89;

    @ApiModelProperty(value = "2215 负荷（MW）")
    private Double p90;

    @ApiModelProperty(value = "2230 负荷（MW）")
    private Double p91;

    @ApiModelProperty(value = "2245 负荷（MW）")
    private Double p92;

    @ApiModelProperty(value = "2300 负荷（MW）")
    private Double p93;

    @ApiModelProperty(value = "2315 负荷（MW）")
    private Double p94;

    @ApiModelProperty(value = "2330 负荷（MW）")
    private Double p95;

    @ApiModelProperty(value = "2345 负荷（MW）")
    private Double p96;
    
    @ApiModelProperty(value = "时间（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
