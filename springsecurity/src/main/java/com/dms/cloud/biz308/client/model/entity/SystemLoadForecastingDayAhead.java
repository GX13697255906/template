package com.dms.cloud.biz308.client.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


/**
 * 日前系统负荷预测表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_system_load_forecasting_day_ahead")
@ApiModel(value="SystemLoadForecastingDayAhead对象", description="日前系统负荷预测表")
public class SystemLoadForecastingDayAhead extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "日前系统负荷预测id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "区域名称")
    private String areaName;

    @ApiModelProperty(value = "00:00 有功预测值 00:00 时刻系统有功预测值")
    private Double p0000;

    @ApiModelProperty(value = "00:15 有功预测值 00:15 时刻系统有功预测值")
    private Double p0015;

    @ApiModelProperty(value = "00:30 有功预测值 00:30 时刻系统有功预测值")
    private Double p0030;

    @ApiModelProperty(value = "00:45 有功预测值 00:45 时刻系统有功预测值")
    private Double p0045;

    @ApiModelProperty(value = "01:00 有功预测值 01:00 时刻系统有功预测值")
    private Double p0100;

    @ApiModelProperty(value = "01:15 有功预测值01:15 时刻系统有功预测值")
    private Double p0115;

    @ApiModelProperty(value = "01:30 有功预测值 01:30 时刻系统有功预测值")
    private Double p0130;

    @ApiModelProperty(value = "01:45 有功预测值 01:45 时刻系统有功预测值")
    private Double p0145;

    @ApiModelProperty(value = "02:00 有功预测值 02:00 时刻系统有功预测值")
    private Double p0200;

    @ApiModelProperty(value = "02:15 有功预测值 02:15 时刻系统有功预测值")
    private Double p0215;

    @ApiModelProperty(value = "02:30 有功预测值 02:30 时刻系统有功预测值")
    private Double p0230;

    @ApiModelProperty(value = "02:45 有功预测值02:45 时刻系统有功预测值")
    private Double p0245;

    @ApiModelProperty(value = "03:00 有功预测值03:00 时刻系统有功预测值")
    private Double p0300;

    @ApiModelProperty(value = "03:15 有功预测值03:15 时刻系统有功预测值")
    private Double p0315;

    @ApiModelProperty(value = "03:30 有功预测值03:30 时刻系统有功预测值")
    private Double p0330;

    @ApiModelProperty(value = "03:45 有功预测值03:45 时刻系统有功预测值")
    private Double p0345;

    @ApiModelProperty(value = "04:00 有功预测值04:00 时刻系统有功预测值")
    private Double p0400;

    @ApiModelProperty(value = "04:15 有功预测值04:15 时刻系统有功预测值")
    private Double p0415;

    @ApiModelProperty(value = "04:30 有功预测值04:30 时刻系统有功预测值")
    private Double p0430;

    @ApiModelProperty(value = "04:45 有功预测值04:45 时刻系统有功预测值")
    private Double p0445;

    @ApiModelProperty(value = "05:00 有功预测值05:00 时刻系统有功预测值")
    private Double p0500;

    @ApiModelProperty(value = "05:15 有功预测值05:15 时刻系统有功预测值")
    private Double p0515;

    @ApiModelProperty(value = "05:30 有功预测值05:30 时刻系统有功预测值")
    private Double p0530;

    @ApiModelProperty(value = "05:45 有功预测值05:45 时刻系统有功预测值")
    private Double p0545;

    @ApiModelProperty(value = "06:00 有功预测值06:00 时刻系统有功预测值")
    private Double p0600;

    @ApiModelProperty(value = "06:15 有功预测值06:15 时刻系统有功预测值")
    private Double p0615;

    @ApiModelProperty(value = "06:30 有功预测值06:30 时刻系统有功预测值")
    private Double p0630;

    @ApiModelProperty(value = "06:45 有功预测值06:45 时刻系统有功预测值")
    private Double p0645;

    @ApiModelProperty(value = "07:00 有功预测值07:00 时刻系统有功预测值")
    private Double p0700;

    @ApiModelProperty(value = "07:15 有功预测值07:15 时刻系统有功预测值")
    private Double p0715;

    @ApiModelProperty(value = "07:30 有功预测值07:30 时刻系统有功预测值")
    private Double p0730;

    @ApiModelProperty(value = "07:45 有功预测值07:45 时刻系统有功预测值")
    private Double p0745;

    @ApiModelProperty(value = "08:00 有功预测值08:00 时刻系统有功预测值")
    private Double p0800;

    @ApiModelProperty(value = "08:15 有功预测值08:15 时刻系统有功预测值")
    private Double p0815;

    @ApiModelProperty(value = "08:30 有功预测值08:30 时刻系统有功预测值")
    private Double p0830;

    @ApiModelProperty(value = "08:45 有功预测值08:45 时刻系统有功预测值")
    private Double p0845;

    @ApiModelProperty(value = "09:00 有功预测值09:00 时刻系统有功预测值")
    private Double p0900;

    @ApiModelProperty(value = "09:15 有功预测值09:15 时刻系统有功预测值")
    private Double p0915;

    @ApiModelProperty(value = "09:30 有功预测值09:30 时刻系统有功预测值")
    private Double p0930;

    @ApiModelProperty(value = "09:45 有功预测值09:45 时刻系统有功预测值")
    private Double p0945;

    @ApiModelProperty(value = "10:00 有功预测值10:00 时刻系统有功预测值")
    private Double p1000;

    @ApiModelProperty(value = "10:15 有功预测值10:15 时刻系统有功预测值")
    private Double p1015;

    @ApiModelProperty(value = "10:30 有功预测值10:30 时刻系统有功预测值")
    private Double p1030;

    @ApiModelProperty(value = "10:45 有功预测值10:45 时刻系统有功预测值")
    private Double p1045;

    @ApiModelProperty(value = "11:00 有功预测值11:00 时刻系统有功预测值")
    private Double p1100;

    @ApiModelProperty(value = "11:15 有功预测值11:15 时刻系统有功预测值")
    private Double p1115;

    @ApiModelProperty(value = "11:30 有功预测值11:30 时刻系统有功预测值")
    private Double p1130;

    @ApiModelProperty(value = "11:45 有功预测值11:45 时刻系统有功预测值")
    private Double p1145;

    @ApiModelProperty(value = "12:00 有功预测值12:00 时刻系统有功预测值")
    private Double p1200;

    @ApiModelProperty(value = "12:15 有功预测值12:15 时刻系统有功预测值")
    private Double p1215;

    @ApiModelProperty(value = "12:30 有功预测值12:30 时刻系统有功预测值")
    private Double p1230;

    @ApiModelProperty(value = "12:45 有功预测值12:45 时刻系统有功预测值")
    private Double p1245;

    @ApiModelProperty(value = "13:00 有功预测值13:00 时刻系统有功预测值")
    private Double p1300;

    @ApiModelProperty(value = "13:15 有功预测值13:15 时刻系统有功预测值")
    private Double p1315;

    @ApiModelProperty(value = "13:30 有功预测值13:30 时刻系统有功预测值")
    private Double p1330;

    @ApiModelProperty(value = "13:45 有功预测值13:45 时刻系统有功预测值")
    private Double p1345;

    @ApiModelProperty(value = "14:00 有功预测值14:00 时刻系统有功预测值")
    private Double p1400;

    @ApiModelProperty(value = "14:15 有功预测值14:15 时刻系统有功预测值")
    private Double p1415;

    @ApiModelProperty(value = "14:30 有功预测值14:30 时刻系统有功预测值")
    private Double p1430;

    @ApiModelProperty(value = "14:45 有功预测值14:45 时刻系统有功预测值")
    private Double p1445;

    @ApiModelProperty(value = "15:00 有功预测值15:00 时刻系统有功预测值")
    private Double p1500;

    @ApiModelProperty(value = "15:15 有功预测值15:15 时刻系统有功预测值")
    private Double p1515;

    @ApiModelProperty(value = "15:30 有功预测值15:30 时刻系统有功预测值")
    private Double p1530;

    @ApiModelProperty(value = "15:45 有功预测值15:45 时刻系统有功预测值")
    private Double p1545;

    @ApiModelProperty(value = "16:00 有功预测值16:00 时刻系统有功预测值")
    private Double p1600;

    @ApiModelProperty(value = "16:15 有功预测值16:15 时刻系统有功预测值")
    private Double p1615;

    @ApiModelProperty(value = "16:30 有功预测值16:30 时刻系统有功预测值")
    private Double p1630;

    @ApiModelProperty(value = "16:45 有功预测值16:45 时刻系统有功预测值")
    private Double p1645;

    @ApiModelProperty(value = "17:00 有功预测值17:00 时刻系统有功预测值")
    private Double p1700;

    @ApiModelProperty(value = "17:15 有功预测值17:15 时刻系统有功预测值")
    private Double p1715;

    @ApiModelProperty(value = "17:30 有功预测值17:30 时刻系统有功预测值")
    private Double p1730;

    @ApiModelProperty(value = "17:45 有功预测值17:45 时刻系统有功预测值")
    private Double p1745;

    @ApiModelProperty(value = "18:00 有功预测值18:00 时刻系统有功预测值")
    private Double p1800;

    @ApiModelProperty(value = "18:15 有功预测值18:15 时刻系统有功预测值")
    private Double p1815;

    @ApiModelProperty(value = "18:30 有功预测值18:30 时刻系统有功预测值")
    private Double p1830;

    @ApiModelProperty(value = "18:45 有功预测值18:45 时刻系统有功预测值")
    private Double p1845;

    @ApiModelProperty(value = "19:00 有功预测值19:00 时刻系统有功预测值")
    private Double p1900;

    @ApiModelProperty(value = "19:15 有功预测值19:15 时刻系统有功预测值")
    private Double p1915;

    @ApiModelProperty(value = "19:30 有功预测值19:30 时刻系统有功预测值")
    private Double p1930;

    @ApiModelProperty(value = "19:45 有功预测值19:45 时刻系统有功预测值")
    private Double p1945;

    @ApiModelProperty(value = "20:00 有功预测值20:00 时刻系统有功预测值")
    private Double p2000;

    @ApiModelProperty(value = "20:15 有功预测值20:15 时刻系统有功预测值")
    private Double p2015;

    @ApiModelProperty(value = "20:30 有功预测值20:30 时刻系统有功预测值")
    private Double p2030;

    @ApiModelProperty(value = "20:45 有功预测值20:45 时刻系统有功预测值")
    private Double p2045;

    @ApiModelProperty(value = "21:00 有功预测值21:00 时刻系统有功预测值")
    private Double p2100;

    @ApiModelProperty(value = "21:15 有功预测值21:15 时刻系统有功预测值")
    private Double p2115;

    @ApiModelProperty(value = "21:30 有功预测值21:30 时刻系统有功预测值")
    private Double p2130;

    @ApiModelProperty(value = "21:45 有功预测值21:45 时刻系统有功预测值")
    private Double p2145;

    @ApiModelProperty(value = "22:00 有功预测值22:00 时刻系统有功预测值")
    private Double p2200;

    @ApiModelProperty(value = "22:15 有功预测值22:15 时刻系统有功预测值")
    private Double p2215;

    @ApiModelProperty(value = "22:30 有功预测值22:30 时刻系统有功预测值")
    private Double p2230;

    @ApiModelProperty(value = "22:45 有功预测值22:45 时刻系统有功预测值")
    private Double p2245;

    @ApiModelProperty(value = "23:00 有功预测值23:00 时刻系统有功预测值")
    private Double p2300;

    @ApiModelProperty(value = "23:15 有功预测值23:15 时刻系统有功预测值")
    private Double p2315;

    @ApiModelProperty(value = "23:30 有功预测值23:30 时刻系统有功预测值")
    private Double p2330;

    @ApiModelProperty(value = "23:45 有功预测值23:45 时刻系统有功预测值")
    private Double p2345;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "数据时间 +1（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
