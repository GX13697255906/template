package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@TableName("biz_unit_output_day_ahead")
@ApiModel(value="UnitOutputDayAhead对象", description="发电侧日前市场机组出力信息表")
public class UnitOutPutDayAhead extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "发电侧日前市场机组出力信息ID")
    @TableId(value = "pbop_id", type = IdType.ID_WORKER)
    private Long pbopId;

    @ApiModelProperty(value = "电厂编码")
    private String powerPlantCode;

    @ApiModelProperty(value = "电厂调度名称")
    private String powerPlantName;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "机组名称")
    private String unitName;

    @ApiModelProperty(value = "00:00 机组出力情况")
    private Double p0000;

    @ApiModelProperty(value = "00:15 机组出力情况")
    private Double p0015;

    @ApiModelProperty(value = "00:30 机组出力情况")
    private Double p0030;

    @ApiModelProperty(value = "00:45 机组出力情况")
    private Double p0045;

    @ApiModelProperty(value = "01:00 机组出力情况")
    private Double p0100;

    @ApiModelProperty(value = "01:15 机组出力情况")
    private Double p0115;

    @ApiModelProperty(value = "01:30 机组出力情况")
    private Double p0130;

    @ApiModelProperty(value = "01:45 机组出力情况")
    private Double p0145;

    @ApiModelProperty(value = "02:00 机组出力情况")
    private Double p0200;

    @ApiModelProperty(value = "02:15 机组出力情况")
    private Double p0215;

    @ApiModelProperty(value = "02:30 机组出力情况")
    private Double p0230;

    @ApiModelProperty(value = "02:45 机组出力情况")
    private Double p0245;

    @ApiModelProperty(value = "03:00 机组出力情况")
    private Double p0300;

    @ApiModelProperty(value = "03:15 机组出力情况")
    private Double p0315;

    @ApiModelProperty(value = "03:30 机组出力情况")
    private Double p0330;

    @ApiModelProperty(value = "03:45 机组出力情况")
    private Double p0345;

    @ApiModelProperty(value = "04:00 机组出力情况")
    private Double p0400;

    @ApiModelProperty(value = "04:15 机组出力情况")
    private Double p0415;

    @ApiModelProperty(value = "04:30 机组出力情况")
    private Double p0430;

    @ApiModelProperty(value = "04:45 机组出力情况")
    private Double p0445;

    @ApiModelProperty(value = "05:00 机组出力情况")
    private Double p0500;

    @ApiModelProperty(value = "05:15 机组出力情况")
    private Double p0515;

    @ApiModelProperty(value = "05:30 机组出力情况")
    private Double p0530;

    @ApiModelProperty(value = "05:45 机组出力情况")
    private Double p0545;

    @ApiModelProperty(value = "06:00 机组出力情况")
    private Double p0600;

    @ApiModelProperty(value = "06:15 机组出力情况")
    private Double p0615;

    @ApiModelProperty(value = "06:30 机组出力情况")
    private Double p0630;

    @ApiModelProperty(value = "06:45 机组出力情况")
    private Double p0645;

    @ApiModelProperty(value = "07:00 机组出力情况")
    private Double p0700;

    @ApiModelProperty(value = "07:15 机组出力情况")
    private Double p0715;

    @ApiModelProperty(value = "07:30 机组出力情况")
    private Double p0730;

    @ApiModelProperty(value = "07:45 机组出力情况")
    private Double p0745;

    @ApiModelProperty(value = "08:00 机组出力情况")
    private Double p0800;

    @ApiModelProperty(value = "08:15 机组出力情况")
    private Double p0815;

    @ApiModelProperty(value = "08:30 机组出力情况")
    private Double p0830;

    @ApiModelProperty(value = "08:45 机组出力情况")
    private Double p0845;

    @ApiModelProperty(value = "09:00 机组出力情况")
    private Double p0900;

    @ApiModelProperty(value = "09:15 机组出力情况")
    private Double p0915;

    @ApiModelProperty(value = "09:30 机组出力情况")
    private Double p0930;

    @ApiModelProperty(value = "09:45 机组出力情况")
    private Double p0945;

    @ApiModelProperty(value = "10:00 机组出力情况")
    private Double p1000;

    @ApiModelProperty(value = "10:15 机组出力情况")
    private Double p1015;

    @ApiModelProperty(value = "10:30 机组出力情况")
    private Double p1030;

    @ApiModelProperty(value = "10:45 机组出力情况")
    private Double p1045;

    @ApiModelProperty(value = "11:00 机组出力情况")
    private Double p1100;

    @ApiModelProperty(value = "11:15 机组出力情况")
    private Double p1115;

    @ApiModelProperty(value = "11:30 机组出力情况")
    private Double p1130;

    @ApiModelProperty(value = "11:45 机组出力情况")
    private Double p1145;

    @ApiModelProperty(value = "12:00 机组出力情况")
    private Double p1200;

    @ApiModelProperty(value = "12:15 机组出力情况")
    private Double p1215;

    @ApiModelProperty(value = "12:30 机组出力情况")
    private Double p1230;

    @ApiModelProperty(value = "12:45 机组出力情况")
    private Double p1245;

    @ApiModelProperty(value = "13:00 机组出力情况")
    private Double p1300;

    @ApiModelProperty(value = "13:15 机组出力情况")
    private Double p1315;

    @ApiModelProperty(value = "13:30 机组出力情况")
    private Double p1330;

    @ApiModelProperty(value = "13:45 机组出力情况")
    private Double p1345;

    @ApiModelProperty(value = "14:00 机组出力情况")
    private Double p1400;

    @ApiModelProperty(value = "14:15 机组出力情况")
    private Double p1415;

    @ApiModelProperty(value = "14:30 机组出力情况")
    private Double p1430;

    @ApiModelProperty(value = "14:45 机组出力情况")
    private Double p1445;

    @ApiModelProperty(value = "15:00 机组出力情况")
    private Double p1500;

    @ApiModelProperty(value = "15:15 机组出力情况")
    private Double p1515;

    @ApiModelProperty(value = "15:30 机组出力情况")
    private Double p1530;

    @ApiModelProperty(value = "15:45 机组出力情况")
    private Double p1545;

    @ApiModelProperty(value = "16:00 机组出力情况")
    private Double p1600;

    @ApiModelProperty(value = "16:15 机组出力情况")
    private Double p1615;

    @ApiModelProperty(value = "16:30 机组出力情况")
    private Double p1630;

    @ApiModelProperty(value = "16:45 机组出力情况")
    private Double p1645;

    @ApiModelProperty(value = "17:00 机组出力情况")
    private Double p1700;

    @ApiModelProperty(value = "17:15 机组出力情况")
    private Double p1715;

    @ApiModelProperty(value = "17:30 机组出力情况")
    private Double p1730;

    @ApiModelProperty(value = "17:45 机组出力情况")
    private Double p1745;

    @ApiModelProperty(value = "18:00 机组出力情况")
    private Double p1800;

    @ApiModelProperty(value = "18:15 机组出力情况")
    private Double p1815;

    @ApiModelProperty(value = "18:30 机组出力情况")
    private Double p1830;

    @ApiModelProperty(value = "18:45 机组出力情况")
    private Double p1845;

    @ApiModelProperty(value = "19:00 机组出力情况")
    private Double p1900;

    @ApiModelProperty(value = "19:15 机组出力情况")
    private Double p1915;

    @ApiModelProperty(value = "19:30 机组出力情况")
    private Double p1930;

    @ApiModelProperty(value = "19:45 机组出力情况")
    private Double p1945;

    @ApiModelProperty(value = "20:00 机组出力情况")
    private Double p2000;

    @ApiModelProperty(value = "20:15 机组出力情况")
    private Double p2015;

    @ApiModelProperty(value = "20:30 机组出力情况")
    private Double p2030;

    @ApiModelProperty(value = "20:45 机组出力情况")
    private Double p2045;

    @ApiModelProperty(value = "21:00 机组出力情况")
    private Double p2100;

    @ApiModelProperty(value = "21:15 机组出力情况")
    private Double p2115;

    @ApiModelProperty(value = "21:30 机组出力情况")
    private Double p2130;

    @ApiModelProperty(value = "21:45 机组出力情况")
    private Double p2145;

    @ApiModelProperty(value = "22:00 机组出力情况")
    private Double p2200;

    @ApiModelProperty(value = "22:15 机组出力情况")
    private Double p2215;

    @ApiModelProperty(value = "22:30 机组出力情况")
    private Double p2230;

    @ApiModelProperty(value = "22:45 机组出力情况")
    private Double p2245;

    @ApiModelProperty(value = "23:00 机组出力情况")
    private Double p2300;

    @ApiModelProperty(value = "23:15 机组出力情况")
    private Double p2315;

    @ApiModelProperty(value = "23:30 机组出力情况")
    private Double p2330;

    @ApiModelProperty(value = "23:45 机组出力情况")
    private Double p2345;

    @ApiModelProperty(value = "时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Long status;


}
