package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 电源出力预测表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@NoArgsConstructor
@TableName("biz_power_pack_of")
@ApiModel(value="PowerPackOf对象", description="电源出力预测表")
public class PowerPackOf extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "地方电源出力预测表id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "区域全省、供电局")
    private String areaName;

    @ApiModelProperty(value = "电源类型（1-A类电源 2-地方电源）")
    private String type;

    @ApiModelProperty(value = "地方电源类型（只有电源类型为地方才有值）")
    private String powerType;

    @ApiModelProperty(value = "0000 计划值00:00 时刻系统有功预测值(MW)")
    private Double p0000;

    @ApiModelProperty(value = "00:15 计划值00:15 时刻系统有功预测值(MW)")
    private Double p0015;

    @ApiModelProperty(value = "0030 计划值00:30 时刻系统有功预测值(MW)")
    private Double p0030;

    @ApiModelProperty(value = "00:45 计划值00:45 时刻系统有功预测值(MW)")
    private Double p0045;

    @ApiModelProperty(value = "01:00 计划值01:00 时刻系统有功预测值(MW)")
    private Double p0100;

    @ApiModelProperty(value = "01:15 计划值01:15 时刻系统有功预测值(MW)")
    private Double p0115;

    @ApiModelProperty(value = "01:30 计划值01:30 时刻系统有功预测值(MW)")
    private Double p0130;

    @ApiModelProperty(value = "01:45 计划值01:45 时刻系统有功预测值(MW)")
    private Double p0145;

    @ApiModelProperty(value = "02:00 计划值02:00 时刻系统有功预测值(MW)")
    private Double p0200;

    @ApiModelProperty(value = "02:15 计划值02:15 时刻系统有功预测值(MW)")
    private Double p0215;

    @ApiModelProperty(value = "02:30 计划值02:30 时刻系统有功预测值(MW)")
    private Double p0230;

    @ApiModelProperty(value = "02:45 计划值02:45 时刻系统有功预测值(MW)")
    private Double p0245;

    @ApiModelProperty(value = "03:00 计划值03:00 时刻系统有功预测值(MW)")
    private Double p0300;

    @ApiModelProperty(value = "03:15 计划值03:15 时刻系统有功预测值(MW)")
    private Double p0315;

    @ApiModelProperty(value = "03:30 计划值03:30 时刻系统有功预测值(MW)")
    private Double p0330;

    @ApiModelProperty(value = "03:45 计划值03:45 时刻系统有功预测值(MW)")
    private Double p0345;

    @ApiModelProperty(value = "04:00 计划值04:00 时刻系统有功预测值(MW)")
    private Double p0400;

    @ApiModelProperty(value = "04:15 计划值04:15 时刻系统有功预测值(MW)")
    private Double p0415;

    @ApiModelProperty(value = "04:30 计划值04:30 时刻系统有功预测值(MW)")
    private Double p0430;

    @ApiModelProperty(value = "04:45 计划值04:45 时刻系统有功预测值(MW)")
    private Double p0445;

    @ApiModelProperty(value = "05:00 计划值05:00 时刻系统有功预测值(MW)")
    private Double p0500;

    @ApiModelProperty(value = "05:15 计划值05:15 时刻系统有功预测值(MW)")
    private Double p0515;

    @ApiModelProperty(value = "05:30 计划值05:30 时刻系统有功预测值(MW)")
    private Double p0530;

    @ApiModelProperty(value = "05:45 计划值05:45 时刻系统有功预测值(MW)")
    private Double p0545;

    @ApiModelProperty(value = "06:00 计划值06:00 时刻系统有功预测值(MW)")
    private Double p0600;

    @ApiModelProperty(value = "06:15 计划值06:15 时刻系统有功预测值(MW)")
    private Double p0615;

    @ApiModelProperty(value = "06:30 计划值06:30 时刻系统有功预测值(MW)")
    private Double p0630;

    @ApiModelProperty(value = "06:45 计划值06:45 时刻系统有功预测值(MW)")
    private Double p0645;

    @ApiModelProperty(value = "07:00 计划值07:00 时刻系统有功预测值(MW)")
    private Double p0700;

    @ApiModelProperty(value = "07:15 计划值07:15 时刻系统有功预测值(MW)")
    private Double p0715;

    @ApiModelProperty(value = "07:30 计划值07:30 时刻系统有功预测值(MW)")
    private Double p0730;

    @ApiModelProperty(value = "07:45 计划值07:45 时刻系统有功预测值(MW)")
    private Double p0745;

    @ApiModelProperty(value = "08:00 计划值08:00 时刻系统有功预测值(MW)")
    private Double p0800;

    @ApiModelProperty(value = "08:15计划值08:15 时刻系统有功预测值(MW)")
    private Double p0815;

    @ApiModelProperty(value = "08:30 计划值08:30 时刻系统有功预测值(MW)")
    private Double p0830;

    @ApiModelProperty(value = "08:45 计划值08:45 时刻系统有功预测值(MW)")
    private Double p0845;

    @ApiModelProperty(value = "09:00 计划值09:00 时刻系统有功预测值(MW)")
    private Double p0900;

    @ApiModelProperty(value = "09:15 计划值09:15 时刻系统有功预测值(MW)")
    private Double p0915;

    @ApiModelProperty(value = "09:30 计划值09:30 时刻系统有功预测值(MW)")
    private Double p0930;

    @ApiModelProperty(value = "09:45 计划值09:45 时刻系统有功预测值(MW)")
    private Double p0945;

    @ApiModelProperty(value = "10:00 计划值10:00 时刻系统有功预测值(MW)")
    private Double p1000;

    @ApiModelProperty(value = "10:15 计划值10:15 时刻系统有功预测值(MW)")
    private Double p1015;

    @ApiModelProperty(value = "10:30 计划值10:30 时刻系统有功预测值(MW)")
    private Double p1030;

    @ApiModelProperty(value = "10:45 计划值10:45 时刻系统有功预测值(MW)")
    private Double p1045;

    @ApiModelProperty(value = "11:00 计划值11:00 时刻系统有功预测值(MW)")
    private Double p1100;

    @ApiModelProperty(value = "11:15 计划值11:15 时刻系统有功预测值(MW)")
    private Double p1115;

    @ApiModelProperty(value = "11:30 计划值11:30 时刻系统有功预测值(MW)")
    private Double p1130;

    @ApiModelProperty(value = "11:45 计划值11:45 时刻系统有功预测值(MW)")
    private Double p1145;

    @ApiModelProperty(value = "12:00 计划值12:00 时刻系统有功预测值(MW)")
    private Double p1200;

    @ApiModelProperty(value = "12:15 计划值12:15 时刻系统有功预测值(MW)")
    private Double p1215;

    @ApiModelProperty(value = "12:30 计划值12:30 时刻系统有功预测值(MW)")
    private Double p1230;

    @ApiModelProperty(value = "12:45 计划值12:45 时刻系统有功预测值(MW)")
    private Double p1245;

    @ApiModelProperty(value = "13:00 计划值13:00 时刻系统有功预测值(MW)")
    private Double p1300;

    @ApiModelProperty(value = "13:15 计划值13:15 时刻系统有功预测值(MW)")
    private Double p1315;

    @ApiModelProperty(value = "13:30 计划值13:30 时刻系统有功预测值(MW)")
    private Double p1330;

    @ApiModelProperty(value = "13:45 计划值13:45 时刻系统有功预测值(MW)")
    private Double p1345;

    @ApiModelProperty(value = "14:00 计划值14:00 时刻系统有功预测值(MW)")
    private Double p1400;

    @ApiModelProperty(value = "14:15 计划值14:15 时刻系统有功预测值(MW)")
    private Double p1415;

    @ApiModelProperty(value = "14:30 计划值14:30 时刻系统有功预测值(MW)")
    private Double p1430;

    @ApiModelProperty(value = "14:45 计划值14:45 时刻系统有功预测值(MW)")
    private Double p1445;

    @ApiModelProperty(value = "15:00 计划值15:00 时刻系统有功预测值(MW)")
    private Double p1500;

    @ApiModelProperty(value = "15:15 计划值15:15 时刻系统有功预测值(MW)")
    private Double p1515;

    @ApiModelProperty(value = "15:30 计划值15:30 时刻系统有功预测值(MW)")
    private Double p1530;

    @ApiModelProperty(value = "15:45 计划值15:45 时刻系统有功预测值(MW)")
    private Double p1545;

    @ApiModelProperty(value = "16:00 计划值16:00 时刻系统有功预测值(MW)")
    private Double p1600;

    @ApiModelProperty(value = "16:15 计划值16:15 时刻系统有功预测值(MW)")
    private Double p1615;

    @ApiModelProperty(value = "16:30 计划值16:30 时刻系统有功预测值(MW)")
    private Double p1630;

    @ApiModelProperty(value = "16:45 计划值16:45 时刻系统有功预测值(MW)")
    private Double p1645;

    @ApiModelProperty(value = "17:00 计划值17:00 时刻系统有功预测值(MW)")
    private Double p1700;

    @ApiModelProperty(value = "17:15 计划值17:15 时刻系统有功预测值(MW)")
    private Double p1715;

    @ApiModelProperty(value = "17:30 计划值17:30 时刻系统有功预测值(MW)")
    private Double p1730;

    @ApiModelProperty(value = "17:45 计划值17:45 时刻系统有功预测值(MW)")
    private Double p1745;

    @ApiModelProperty(value = "18:00 计划值18:00 时刻系统有功预测值(MW)")
    private Double p1800;

    @ApiModelProperty(value = "18:15 计划值18:15 时刻系统有功预测值(MW)")
    private Double p1815;

    @ApiModelProperty(value = "18:30 计划值18:30 时刻系统有功预测值(MW)")
    private Double p1830;

    @ApiModelProperty(value = "18:45 计划值18:45 时刻系统有功预测值(MW)")
    private Double p1845;

    @ApiModelProperty(value = "19:00计划值19:00 时刻系统有功预测值(MW)")
    private Double p1900;

    @ApiModelProperty(value = "19:15 计划值19:15 时刻系统有功预测值(MW)")
    private Double p1915;

    @ApiModelProperty(value = "19:30 计划值19:30 时刻系统有功预测值(MW)")
    private Double p1930;

    @ApiModelProperty(value = "19:45 计划值19:45 时刻系统有功预测值(MW)")
    private Double p1945;

    @ApiModelProperty(value = "20:00 计划值20:00 时刻系统有功预测值(MW)")
    private Double p2000;

    @ApiModelProperty(value = "20:15计划值20:15 时刻系统有功预测值(MW)")
    private Double p2015;

    @ApiModelProperty(value = "20:30 计划值20:30 时刻系统有功预测值(MW)")
    private Double p2030;

    @ApiModelProperty(value = "20:45 计划值20:45 时刻系统有功预测值(MW)")
    private Double p2045;

    @ApiModelProperty(value = "21:00 计划值21:00 时刻系统有功预测值(MW)")
    private Double p2100;

    @ApiModelProperty(value = "21:15 计划值21:15 时刻系统有功预测值(MW)")
    private Double p2115;

    @ApiModelProperty(value = "21:30 计划值21:30 时刻系统有功预测值(MW)")
    private Double p2130;

    @ApiModelProperty(value = "21:45 计划值21:45 时刻系统有功预测值(MW)")
    private Double p2145;

    @ApiModelProperty(value = "22:00 计划值22:00 时刻系统有功预测值(MW)")
    private Double p2200;

    @ApiModelProperty(value = "22:15 计划值22:15 时刻系统有功预测值(MW)")
    private Double p2215;

    @ApiModelProperty(value = "22:30计划值22:30 时刻系统有功预测值(MW)")
    private Double p2230;

    @ApiModelProperty(value = "22:45 计划值22:45 时刻系统有功预测值(MW)")
    private Double p2245;

    @ApiModelProperty(value = "23:00 计划值23:00 时刻系统有功预测值(MW)")
    private Double p2300;

    @ApiModelProperty(value = "23:15 计划值23:15 时刻系统有功预测值(MW)")
    private Double p2315;

    @ApiModelProperty(value = "23:30 计划值23:30 时刻系统有功预测值(MW)")
    private Double p2330;

    @ApiModelProperty(value = "23:45 计划值23:45 时刻系统有功预测值(MW)")
    private Double p2345;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "时间 + 1（YYYY-MM-DD）采集频率为当天传输次日数据")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
