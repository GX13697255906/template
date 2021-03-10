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
 * 联络线计划表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@NoArgsConstructor
@TableName("biz_contact_line_plan")
@ApiModel(value="ContactLinePlan对象", description="联络线计划表")
public class ContactLinePlan extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "A类电源出力预测表id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String receiveAreaName;

    @ApiModelProperty(value = "区域名称")
    private String receiveAreaCode;

    @ApiModelProperty(value = "0000 计划值 00:00 时刻系统外送电计划")
    private Double p0000;

    @ApiModelProperty(value = "0015 计划值 00:15 时刻系统外送电计划")
    private Double p0015;

    @ApiModelProperty(value = "0030 计划值 00:30 时刻系统外送电计划")
    private Double p0030;

    @ApiModelProperty(value = "0045 计划值 00:45 时刻系统外送电计划")
    private Double p0045;

    @ApiModelProperty(value = "0100 计划值01:00 时刻系统外送电计划")
    private Double p0100;

    @ApiModelProperty(value = "0115 计划值 01:15 时刻系统外送电计划")
    private Double p0115;

    @ApiModelProperty(value = "0130 计划值 01:30 时刻系统外送电计划")
    private Double p0130;

    @ApiModelProperty(value = "0145 计划值 01:45 时刻系统外送电计划")
    private Double p0145;

    @ApiModelProperty(value = "0200 计划值02:00 时刻系统外送电计划")
    private Double p0200;

    @ApiModelProperty(value = "0215 计划值02:15 时刻系统外送电计划")
    private Double p0215;

    @ApiModelProperty(value = "0230 计划值02:30 时刻系统外送电计划")
    private Double p0230;

    @ApiModelProperty(value = "0245 计划值 02:45 时刻系统外送电计划")
    private Double p0245;

    @ApiModelProperty(value = "0300 计划值 03:00 时刻系统外送电计划")
    private Double p0300;

    @ApiModelProperty(value = "0315 计划值 03:15 时刻系统外送电计划")
    private Double p0315;

    @ApiModelProperty(value = "0330 计划值 03:30 时刻系统外送电计划")
    private Double p0330;

    @ApiModelProperty(value = "0345 计划值 03:45 时刻系统外送电计划")
    private Double p0345;

    @ApiModelProperty(value = "0400 计划值 04:00 时刻系统外送电计划")
    private Double p0400;

    @ApiModelProperty(value = "0415 计划值 04:15 时刻系统外送电计划")
    private Double p0415;

    @ApiModelProperty(value = "0430 计划值 04:30 时刻系统外送电计划")
    private Double p0430;

    @ApiModelProperty(value = "0445 计划值 04:45 时刻系统外送电计划")
    private Double p0445;

    @ApiModelProperty(value = "0500 计划值05:00 时刻系统外送电计划")
    private Double p0500;

    @ApiModelProperty(value = "0515 计划值 05:15 时刻系统外送电计划")
    private Double p0515;

    @ApiModelProperty(value = "0530 计划值 05:30 时刻系统外送电计划")
    private Double p0530;

    @ApiModelProperty(value = "0545 计划值 05:45 时刻系统外送电计划")
    private Double p0545;

    @ApiModelProperty(value = "0600 计划值 06:00 时刻系统外送电计划")
    private Double p0600;

    @ApiModelProperty(value = "0615 计划值 06:15 时刻系统外送电计划")
    private Double p0615;

    @ApiModelProperty(value = "0630 计划值 06:30 时刻系统外送电计划")
    private Double p0630;

    @ApiModelProperty(value = "0645 计划值 06:45 时刻系统外送电计划")
    private Double p0645;

    @ApiModelProperty(value = "0700 计划值 07:00 时刻系统外送电计划")
    private Double p0700;

    @ApiModelProperty(value = "0715 计划值 07:15 时刻系统外送电计划")
    private Double p0715;

    @ApiModelProperty(value = "0730 计划值 07:30 时刻系统外送电计划")
    private Double p0730;

    @ApiModelProperty(value = "0745 计划值07:45 时刻系统外送电计划")
    private Double p0745;

    @ApiModelProperty(value = "0800 计划值08:00 时刻系统外送电计划")
    private Double p0800;

    @ApiModelProperty(value = "0815 计划值 08:15 时刻系统外送电计划")
    private Double p0815;

    @ApiModelProperty(value = "0830 计划值 08:30 时刻系统外送电计划")
    private Double p0830;

    @ApiModelProperty(value = "0845 计划值 08:45 时刻系统外送电计划")
    private Double p0845;

    @ApiModelProperty(value = "0900 计划值 09:00 时刻系统外送电计划")
    private Double p0900;

    @ApiModelProperty(value = "0915 计划值09:15 时刻系统外送电计划")
    private Double p0915;

    @ApiModelProperty(value = "0930 计划值 09:30 时刻系统外送电计划")
    private Double p0930;

    @ApiModelProperty(value = "0945 计划值 09:45 时刻系统外送电计划")
    private Double p0945;

    @ApiModelProperty(value = "1000 计划值 10:00 时刻系统外送电计划")
    private Double p1000;

    @ApiModelProperty(value = "1015 计划值 10:15 时刻系统外送电计划")
    private Double p1015;

    @ApiModelProperty(value = "1030 计划值10:30 时刻系统外送电计划")
    private Double p1030;

    @ApiModelProperty(value = "1045 计划值 10:45 时刻系统外送电计划")
    private Double p1045;

    @ApiModelProperty(value = "1100 计划值 11:00 时刻系统外送电计划")
    private Double p1100;

    @ApiModelProperty(value = "1115 计划值 11:15 时刻系统外送电计划")
    private Double p1115;

    @ApiModelProperty(value = "1130计划值11:30 时刻系统外送电计划")
    private Double p1130;

    @ApiModelProperty(value = "1145 计划值 11:45 时刻系统外送电计划")
    private Double p1145;

    @ApiModelProperty(value = "1200 计划值 12:00 时刻系统外送电计划")
    private Double p1200;

    @ApiModelProperty(value = "1215 计划值 12:15 时刻系统外送电计划")
    private Double p1215;

    @ApiModelProperty(value = "1230 计划值12:30 时刻系统外送电计划")
    private Double p1230;

    @ApiModelProperty(value = "1245 计划值 12:45 时刻系统外送电计划")
    private Double p1245;

    @ApiModelProperty(value = "1300 计划值 13:00 时刻系统外送电计划")
    private Double p1300;

    @ApiModelProperty(value = "1315 计划值 13:15 时刻系统外送电计划")
    private Double p1315;

    @ApiModelProperty(value = "1330 计划值13:30 时刻系统外送电计划")
    private Double p1330;

    @ApiModelProperty(value = "1345 计划值 13:45 时刻系统外送电计划")
    private Double p1345;

    @ApiModelProperty(value = "1400 计划值 14:00 时刻系统外送电计划")
    private Double p1400;

    @ApiModelProperty(value = "1415 计划值 14:15 时刻系统外送电计划")
    private Double p1415;

    @ApiModelProperty(value = "1430 计划值 14:30 时刻系统外送电计划")
    private Double p1430;

    @ApiModelProperty(value = "1445 计划值 14:45 时刻系统外送电计划")
    private Double p1445;

    @ApiModelProperty(value = "1500 计划值 15:00 时刻系统外送电计划")
    private Double p1500;

    @ApiModelProperty(value = "1515 计划值 15:15 时刻系统外送电计划")
    private Double p1515;

    @ApiModelProperty(value = "1530 计划值 15:30 时刻系统外送电计划")
    private Double p1530;

    @ApiModelProperty(value = "1545 计划值 15:45 时刻系统外送电计划")
    private Double p1545;

    @ApiModelProperty(value = "1600 计划值16:00 时刻系统外送电计划")
    private Double p1600;

    @ApiModelProperty(value = "1615计划值 16:15 时刻系统外送电计划")
    private Double p1615;

    @ApiModelProperty(value = "1630 计划值 16:30 时刻系统外送电计划")
    private Double p1630;

    @ApiModelProperty(value = "1645 计划值 16:45 时刻系统外送电计划")
    private Double p1645;

    @ApiModelProperty(value = "1700 计划值 17:00 时刻系统外送电计划")
    private Double p1700;

    @ApiModelProperty(value = "1715 计划值 17:15 时刻系统外送电计划")
    private Double p1715;

    @ApiModelProperty(value = "1730 计划值 17:30 时刻系统外送电计划")
    private Double p1730;

    @ApiModelProperty(value = "1745 计划值 17:45 时刻系统外送电计划")
    private Double p1745;

    @ApiModelProperty(value = "1800 计划值 18:00 时刻系统外送电计划")
    private Double p1800;

    @ApiModelProperty(value = "1815计划值 18:15 时刻系统外送电计划")
    private Double p1815;

    @ApiModelProperty(value = "1830 计划值 18:30 时刻系统外送电计划")
    private Double p1830;

    @ApiModelProperty(value = "1845 计划值 18:45 时刻系统外送电计划")
    private Double p1845;

    @ApiModelProperty(value = "1900 计划值 19:00 时刻系统外送电计划")
    private Double p1900;

    @ApiModelProperty(value = "1915 计划值19:15 时刻系统外送电计划")
    private Double p1915;

    @ApiModelProperty(value = "1930 计划值 19:30 时刻系统外送电计划")
    private Double p1930;

    @ApiModelProperty(value = "1945 计划值 19:45 时刻系统外送电计划")
    private Double p1945;

    @ApiModelProperty(value = "2000 计划值 20:00 时刻系统外送电计划")
    private Double p2000;

    @ApiModelProperty(value = "2015 计划值 20:15 时刻系统外送电计划")
    private Double p2015;

    @ApiModelProperty(value = "2030 计划值 20:30 时刻系统外送电计划")
    private Double p2030;

    @ApiModelProperty(value = "2045 计划值 20:45 时刻系统外送电计划")
    private Double p2045;

    @ApiModelProperty(value = "2100 计划值 21:00 时刻系统外送电计划")
    private Double p2100;

    @ApiModelProperty(value = "2115 计划值 21:15 时刻系统外送电计划")
    private Double p2115;

    @ApiModelProperty(value = "2130 计划值 21:30 时刻系统外送电计划")
    private Double p2130;

    @ApiModelProperty(value = "2145 计划值 21:45 时刻系统外送电计划")
    private Double p2145;

    @ApiModelProperty(value = "2200 计划值 22:00 时刻系统外送电计划")
    private Double p2200;

    @ApiModelProperty(value = "2215 计划值 22:15 时刻系统外送电计划")
    private Double p2215;

    @ApiModelProperty(value = "2230 计划值22:30 时刻系统外送电计划")
    private Double p2230;

    @ApiModelProperty(value = "2245 计划值 22:45 时刻系统外送电计划")
    private Double p2245;

    @ApiModelProperty(value = "2300 计划值 23:00 时刻系统外送电计划")
    private Double p2300;

    @ApiModelProperty(value = "2315 计划值 23:15 时刻系统外送电计划")
    private Double p2315;

    @ApiModelProperty(value = "2330 计划值 23:30 时刻系统外送电计划")
    private Double p2330;

    @ApiModelProperty(value = "2345 计划值23:45 时刻系统外送电计划")
    private Double p2345;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "数据时间 +1（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "送端区域名")
    private String supplyAreaName;

    @ApiModelProperty(value = "送端编码")
    private String supplyAreaCode;


}
