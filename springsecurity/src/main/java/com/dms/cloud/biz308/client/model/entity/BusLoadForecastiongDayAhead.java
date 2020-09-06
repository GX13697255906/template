package com.dms.cloud.biz308.client.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 日前母线负荷预测表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_bus_load_forecastiong_day_ahead")
@ApiModel(value="BusLoadForecastiongDayAhead对象", description="日前母线负荷预测表")
public class BusLoadForecastiongDayAhead extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "日前母线负荷预测表id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "母线负荷编码")
    private String busLoadCode;

    @ApiModelProperty(value = "母线负荷名称")
    private String busLoadName;

    @ApiModelProperty(value = "厂站名称")
    private String plantSubstationName;

    @ApiModelProperty(value = "厂站编码")
    private String plantSubstationCode;

    @ApiModelProperty(value = "00:00 有功00:00 时刻系统有功预测值")
    private Double p0000;

    @ApiModelProperty(value = "00:15 有功00:15 时刻系统有功预测值")
    private Double p0015;

    @ApiModelProperty(value = "00:30 有功0:30 时刻系统有功预测值")
    private Double p0030;

    @ApiModelProperty(value = "00:45 有功0:45 时刻系统有功预测值")
    private Double p0045;

    @ApiModelProperty(value = "01:00 有功1:00 时刻系统有功预测值")
    private Double p0100;

    @ApiModelProperty(value = "01:15 有功1:15 时刻系统有功预测值")
    private Double p0115;

    @ApiModelProperty(value = "01:30 有功1:30 时刻系统有功预测值")
    private Double p0130;

    @ApiModelProperty(value = "01:45 有功1:45 时刻系统有功预测值")
    private Double p0145;

    @ApiModelProperty(value = "02:00 有功2:00 时刻系统有功预测值")
    private Double p0200;

    @ApiModelProperty(value = "02:15 有功2:15 时刻系统有功预测值")
    private Double p0215;

    @ApiModelProperty(value = "02:30 有功2:30 时刻系统有功预测值")
    private Double p0230;

    @ApiModelProperty(value = "02:45 有功2:45 时刻系统有功预测值")
    private Double p0245;

    @ApiModelProperty(value = "03:00 有功3:00 时刻系统有功预测值")
    private Double p0300;

    @ApiModelProperty(value = "03:15 有功3:15 时刻系统有功预测值")
    private Double p0315;

    @ApiModelProperty(value = "03:30 有功3:30 时刻系统有功预测值")
    private Double p0330;

    @ApiModelProperty(value = "03:45 有功3:45 时刻系统有功预测值")
    private Double p0345;

    @ApiModelProperty(value = "04:00 有功4:00 时刻系统有功预测值")
    private Double p0400;

    @ApiModelProperty(value = "04:15 有功4:15 时刻系统有功预测值")
    private Double p0415;

    @ApiModelProperty(value = "04:30 有功4:30 时刻系统有功预测值")
    private Double p0430;

    @ApiModelProperty(value = "04:45 有功4:45 时刻系统有功预测值")
    private Double p0445;

    @ApiModelProperty(value = "05:00 有功5:00 时刻系统有功预测值")
    private Double p0500;

    @ApiModelProperty(value = "05:15 有功5:15 时刻系统有功预测值")
    private Double p0515;

    @ApiModelProperty(value = "05:30 有功5:30 时刻系统有功预测值")
    private Double p0530;

    @ApiModelProperty(value = "05:45 有功5:45 时刻系统有功预测值")
    private Double p0545;

    @ApiModelProperty(value = "06:00 有功06:00 时刻系统有功预测值")
    private Double p0600;

    @ApiModelProperty(value = "06:15 有功6:15 时刻系统有功预测值")
    private Double p0615;

    @ApiModelProperty(value = "06:30 有功6:30 时刻系统有功预测值")
    private Double p0630;

    @ApiModelProperty(value = "06:45 有功6:45 时刻系统有功预测值")
    private Double p0645;

    @ApiModelProperty(value = "07:00 有功7:00 时刻系统有功预测值")
    private Double p0700;

    @ApiModelProperty(value = "07:15 有功7:15 时刻系统有功预测值")
    private Double p0715;

    @ApiModelProperty(value = "07:30 有功7:30 时刻系统有功预测值")
    private Double p0730;

    @ApiModelProperty(value = "07:45 有功7:45 时刻系统有功预测值")
    private Double p0745;

    @ApiModelProperty(value = "08:00 有功8:00 时刻系统有功预测值")
    private Double p0800;

    @ApiModelProperty(value = "08:15 有功8:15 时刻系统有功预测值")
    private Double p0815;

    @ApiModelProperty(value = "08:30 有功8:30 时刻系统有功预测值")
    private Double p0830;

    @ApiModelProperty(value = "08:45 有功8:45 时刻系统有功预测值")
    private Double p0845;

    @ApiModelProperty(value = "09:00 有功9:00 时刻系统有功预测值")
    private Double p0900;

    @ApiModelProperty(value = "09:15 有功9:15 时刻系统有功预测值")
    private Double p0915;

    @ApiModelProperty(value = "09:30 有功9:30 时刻系统有功预测值")
    private Double p0930;

    @ApiModelProperty(value = "09:45 有功9:45 时刻系统有功预测值")
    private Double p0945;

    @ApiModelProperty(value = "10:00 有功10:00 时刻系统有功预测值")
    private Double p1000;

    @ApiModelProperty(value = "10:15 有功10:15 时刻系统有功预测值")
    private Double p1015;

    @ApiModelProperty(value = "10:30 有功10:30 时刻系统有功预测值")
    private Double p1030;

    @ApiModelProperty(value = "10:45 有功10:45 时刻系统有功预测值")
    private Double p1045;

    @ApiModelProperty(value = "11:00 有功11:00 时刻系统有功预测值")
    private Double p1100;

    @ApiModelProperty(value = "11:15 有功11:15 时刻系统有功预测值")
    private Double p1115;

    @ApiModelProperty(value = "11:30 有功11:30 时刻系统有功预测值")
    private Double p1130;

    @ApiModelProperty(value = "11:45 有功11:45 时刻系统有功预测值")
    private Double p1145;

    @ApiModelProperty(value = "12:00 有功12:00 时刻系统有功预测值")
    private Double p1200;

    @ApiModelProperty(value = "12:15 有功12:15 时刻系统有功预测值")
    private Double p1215;

    @ApiModelProperty(value = "12:30 有功12:30 时刻系统有功预测值")
    private Double p1230;

    @ApiModelProperty(value = "12:45 有功12:45 时刻系统有功预测值")
    private Double p1245;

    @ApiModelProperty(value = "13:00 有功13:00 时刻系统有功预测值")
    private Double p1300;

    @ApiModelProperty(value = "13:15 有功13:15 时刻系统有功预测值")
    private Double p1315;

    @ApiModelProperty(value = "13:30 有功13:30 时刻系统有功预测值")
    private Double p1330;

    @ApiModelProperty(value = "13:45 有功13:45 时刻系统有功预测值")
    private Double p1345;

    @ApiModelProperty(value = "14:00 有功14:00 时刻系统有功预测值")
    private Double p1400;

    @ApiModelProperty(value = "14:15 有功14:15 时刻系统有功预测值")
    private Double p1415;

    @ApiModelProperty(value = "14:30 有功14:30 时刻系统有功预测值")
    private Double p1430;

    @ApiModelProperty(value = "14:45 有功14:45 时刻系统有功预测值")
    private Double p1445;

    @ApiModelProperty(value = "15:00 有功15:00 时刻系统有功预测值")
    private Double p1500;

    @ApiModelProperty(value = "15:15 有功15:15 时刻系统有功预测值")
    private Double p1515;

    @ApiModelProperty(value = "15:30 有功15:30 时刻系统有功预测值")
    private Double p1530;

    @ApiModelProperty(value = "15:45 有功15:45 时刻系统有功预测值")
    private Double p1545;

    @ApiModelProperty(value = "16:00 有功16:00 时刻系统有功预测值")
    private Double p1600;

    @ApiModelProperty(value = "16:15 有功16:15 时刻系统有功预测值")
    private Double p1615;

    @ApiModelProperty(value = "16:30 有功16:30 时刻系统有功预测值")
    private Double p1630;

    @ApiModelProperty(value = "16:45 有功16:45 时刻系统有功预测值")
    private Double p1645;

    @ApiModelProperty(value = "17:00 有功17:00 时刻系统有功预测值")
    private Double p1700;

    @ApiModelProperty(value = "17:15 有功17:15 时刻系统有功预测值")
    private Double p1715;

    @ApiModelProperty(value = "17:30 有功17:30 时刻系统有功预测值")
    private Double p1730;

    @ApiModelProperty(value = "17:45 有功17:45 时刻系统有功预测值")
    private Double p1745;

    @ApiModelProperty(value = "18:00 有功18:00 时刻系统有功预测值")
    private Double p1800;

    @ApiModelProperty(value = "18:15 有功18:15 时刻系统有功预测值")
    private Double p1815;

    @ApiModelProperty(value = "18:30 有功18:30 时刻系统有功预测值")
    private Double p1830;

    @ApiModelProperty(value = "18:45 有功18:45 时刻系统有功预测值")
    private Double p1845;

    @ApiModelProperty(value = "19:00 有功19:00 时刻系统有功预测值")
    private Double p1900;

    @ApiModelProperty(value = "19:15 有功19:15 时刻系统有功预测值")
    private Double p1915;

    @ApiModelProperty(value = "19:30 有功19:30 时刻系统有功预测值")
    private Double p1930;

    @ApiModelProperty(value = "19:45 有功19:45 时刻系统有功预测值")
    private Double p1945;

    @ApiModelProperty(value = "20:00 有功20:00 时刻系统有功预测值")
    private Double p2000;

    @ApiModelProperty(value = "20:15 有功20:15 时刻系统有功预测值")
    private Double p2015;

    @ApiModelProperty(value = "20:30 有功20:30 时刻系统有功预测值")
    private Double p2030;

    @ApiModelProperty(value = "20:45 有功20:45 时刻系统有功预测值")
    private Double p2045;

    @ApiModelProperty(value = "21:00 有功21:00 时刻系统有功预测值")
    private Double p2100;

    @ApiModelProperty(value = "21:15 有功21:15 时刻系统有功预测值")
    private Double p2115;

    @ApiModelProperty(value = "21:30 有功21:30 时刻系统有功预测值")
    private Double p2130;

    @ApiModelProperty(value = "21:45 有功21:45 时刻系统有功预测值")
    private Double p2145;

    @ApiModelProperty(value = "22:00 有功22:00 时刻系统有功预测值")
    private Double p2200;

    @ApiModelProperty(value = "22:15 有功22:15 时刻系统有功预测值")
    private Double p2215;

    @ApiModelProperty(value = "22:30 有功22:30 时刻系统有功预测值")
    private Double p2230;

    @ApiModelProperty(value = "22:45 有功22:45 时刻系统有功预测值")
    private Double p2245;

    @ApiModelProperty(value = "23:00 有功23:00 时刻系统有功预测值")
    private Double p2300;

    @ApiModelProperty(value = "23:15 有功23:15 时刻系统有功预测值")
    private Double p2315;

    @ApiModelProperty(value = "23:30 有功23:30 时刻系统有功预测值")
    private Double p2330;

    @ApiModelProperty(value = "23:45 有功23:45 时刻系统有功预测值")
    private Double p2345;

    @ApiModelProperty(value = "0000 无功0:00 时刻系统无功预测值")
    private Double q0000;

    @ApiModelProperty(value = "0015 无功0:15 时刻系统无功预测值")
    private Double q0015;

    @ApiModelProperty(value = "0030 无功0:30 时刻系统无功预测值")
    private Double q0030;

    @ApiModelProperty(value = "0045 无功0:45 时刻系统无功预测值")
    private Double q0045;

    @ApiModelProperty(value = "0100 无功1:00 时刻系统无功预测值")
    private Double q0100;

    @ApiModelProperty(value = "0115 无功1:15 时刻系统无功预测值")
    private Double q0115;

    @ApiModelProperty(value = "0130 无功1:30 时刻系统无功预测值")
    private Double q0130;

    @ApiModelProperty(value = "0145无功1:45 时刻系统无功预测值")
    private Double q0145;

    @ApiModelProperty(value = "0200 无功2:00 时刻系统无功预测值")
    private Double q0200;

    @ApiModelProperty(value = "0215 无功2:15 时刻系统无功预测值")
    private Double q0215;

    @ApiModelProperty(value = "0230 无功2:30 时刻系统无功预测值")
    private Double q0230;

    @ApiModelProperty(value = "0245 无功2:45 时刻系统无功预测值")
    private Double q0245;

    @ApiModelProperty(value = "0300 无功3:00 时刻系统无功预测值")
    private Double q0300;

    @ApiModelProperty(value = "0315 无功3:15 时刻系统无功预测值")
    private Double q0315;

    @ApiModelProperty(value = "0330 无功3:30 时刻系统无功预测值")
    private Double q0330;

    @ApiModelProperty(value = "0345 无功3:45 时刻系统无功预测值")
    private Double q0345;

    @ApiModelProperty(value = "0400 无功4:00 时刻系统无功预测值")
    private Double q0400;

    @ApiModelProperty(value = "0415 无功4:15 时刻系统无功预测值")
    private Double q0415;

    @ApiModelProperty(value = "0430 无功4:30 时刻系统无功预测值")
    private Double q0430;

    @ApiModelProperty(value = "0445 无功4:45 时刻系统无功预测值")
    private Double q0445;

    @ApiModelProperty(value = "0500 无功5:00 时刻系统无功预测值")
    private Double q0500;

    @ApiModelProperty(value = "0515 无功5:15 时刻系统无功预测值")
    private Double q0515;

    @ApiModelProperty(value = "0530 无功5:30 时刻系统无功预测值")
    private Double q0530;

    @ApiModelProperty(value = "0545 无功5:45 时刻系统无功预测值")
    private Double q0545;

    @ApiModelProperty(value = "0600 无功6:00 时刻系统无功预测值")
    private Double q0600;

    @ApiModelProperty(value = "0615 无功6:15 时刻系统无功预测值")
    private Double q0615;

    @ApiModelProperty(value = "0630 无功6:30 时刻系统无功预测值")
    private Double q0630;

    @ApiModelProperty(value = "0645 无功6:45 时刻系统无功预测值")
    private Double q0645;

    @ApiModelProperty(value = "0700 无功7:00 时刻系统无功预测值")
    private Double q0700;

    @ApiModelProperty(value = "0715 无功7:15 时刻系统无功预测值")
    private Double q0715;

    @ApiModelProperty(value = "0730 无功7:30 时刻系统无功预测值")
    private Double q0730;

    @ApiModelProperty(value = "0745 无功7:45 时刻系统无功预测值")
    private Double q0745;

    @ApiModelProperty(value = "0800 无功8:00 时刻系统无功预测值")
    private Double q0800;

    @ApiModelProperty(value = "0815 无功8:15 时刻系统无功预测值")
    private Double q0815;

    @ApiModelProperty(value = "0830 无功8:30 时刻系统无功预测值")
    private Double q0830;

    @ApiModelProperty(value = "0845 无功8:45 时刻系统无功预测值")
    private Double q0845;

    @ApiModelProperty(value = "0900 无功9:00 时刻系统无功预测值")
    private Double q0900;

    @ApiModelProperty(value = "0915 无功9:15 时刻系统无功预测值")
    private Double q0915;

    @ApiModelProperty(value = "0930 无功9:30 时刻系统无功预测值")
    private Double q0930;

    @ApiModelProperty(value = "0945 无功9:45 时刻系统无功预测值")
    private Double q0945;

    @ApiModelProperty(value = "1000 无功10:00 时刻系统无功预测值")
    private Double q1000;

    @ApiModelProperty(value = "1015 无功10:15时刻系统无功预测值")
    private Double q1015;

    @ApiModelProperty(value = "1030 无功10:30 时刻系统无功预测值")
    private Double q1030;

    @ApiModelProperty(value = "1045 无功10:45 时刻系统无功预测值")
    private Double q1045;

    @ApiModelProperty(value = "1100 无功11:00 时刻系统无功预测值")
    private Double q1100;

    @ApiModelProperty(value = "1115 无功11:15 时刻系统无功预测值")
    private Double q1115;

    @ApiModelProperty(value = "1130 无功11:300 时刻系统无功预测值")
    private Double q1130;

    @ApiModelProperty(value = "1145 无功11:45 时刻系统无功预测值")
    private Double q1145;

    @ApiModelProperty(value = "1200 无功12:00 时刻系统无功预测值")
    private Double q1200;

    @ApiModelProperty(value = "1215 无功12:15 时刻系统无功预测值")
    private Double q1215;

    @ApiModelProperty(value = "1230 无功12:30 时刻系统无功预测值")
    private Double q1230;

    @ApiModelProperty(value = "1245 无功12:45 时刻系统无功预测值")
    private Double q1245;

    @ApiModelProperty(value = "1300 无功13:00 时刻系统无功预测值")
    private Double q1300;

    @ApiModelProperty(value = "1315 无功13:15 时刻系统无功预测值")
    private Double q1315;

    @ApiModelProperty(value = "1330 无功13:30 时刻系统无功预测值")
    private Double q1330;

    @ApiModelProperty(value = "1345 无功13:45 时刻系统无功预测值")
    private Double q1345;

    @ApiModelProperty(value = "1400 无功14:00 时刻系统无功预测值")
    private Double q1400;

    @ApiModelProperty(value = "1415 无功14:15 时刻系统无功预测值")
    private Double q1415;

    @ApiModelProperty(value = "1430 无功14:30 时刻系统无功预测值")
    private Double q1430;

    @ApiModelProperty(value = "1445 无功14:45 时刻系统无功预测值")
    private Double q1445;

    @ApiModelProperty(value = "1500 无功15:00 时刻系统无功预测值")
    private Double q1500;

    @ApiModelProperty(value = "1515 无功15:15 时刻系统无功预测值")
    private Double q1515;

    @ApiModelProperty(value = "1530 无功15:30 时刻系统无功预测值")
    private Double q1530;

    @ApiModelProperty(value = "1545 无功15:45 时刻系统无功预测值")
    private Double q1545;

    @ApiModelProperty(value = "1600 无功16:00 时刻系统无功预测值")
    private Double q1600;

    @ApiModelProperty(value = "1615 无功16:15 时刻系统无功预测值")
    private Double q1615;

    @ApiModelProperty(value = "1630 无功16:30 时刻系统无功预测值")
    private Double q1630;

    @ApiModelProperty(value = "1645 无功16:45 时刻系统无功预测值")
    private Double q1645;

    @ApiModelProperty(value = "1700 无功17:00 时刻系统无功预测值")
    private Double q1700;

    @ApiModelProperty(value = "1715 无功17:15 时刻系统无功预测值")
    private Double q1715;

    @ApiModelProperty(value = "1730 无功17:30 时刻系统无功预测值")
    private Double q1730;

    @ApiModelProperty(value = "1745 无功17:45 时刻系统无功预测值")
    private Double q1745;

    @ApiModelProperty(value = "1800 无功18:00 时刻系统无功预测值")
    private Double q1800;

    @ApiModelProperty(value = "1815 无功18:15 时刻系统无功预测值")
    private Double q1815;

    @ApiModelProperty(value = "1830 无功18:30 时刻系统无功预测值")
    private Double q1830;

    @ApiModelProperty(value = "1845 无功18:45 时刻系统无功预测值")
    private Double q1845;

    @ApiModelProperty(value = "1900 无功19:00 时刻系统无功预测值")
    private Double q1900;

    @ApiModelProperty(value = "1915 无功19:15 时刻系统无功预测值")
    private Double q1915;

    @ApiModelProperty(value = "1930 无功19:30 时刻系统无功预测值")
    private Double q1930;

    @ApiModelProperty(value = "1945 无功19:45 时刻系统无功预测值")
    private Double q1945;

    @ApiModelProperty(value = "2000 无功20:00 时刻系统无功预测值")
    private Double q2000;

    @ApiModelProperty(value = "2015 无功20:15 时刻系统无功预测值")
    private Double q2015;

    @ApiModelProperty(value = "2030 无功20:30 时刻系统无功预测值")
    private Double q2030;

    @ApiModelProperty(value = "2045 无功20:45 时刻系统无功预测值")
    private Double q2045;

    @ApiModelProperty(value = "2100 无功21:00 时刻系统无功预测值")
    private Double q2100;

    @ApiModelProperty(value = "2115 无功21:15 时刻系统无功预测值")
    private Double q2115;

    @ApiModelProperty(value = "2130 无功21:30 时刻系统无功预测值")
    private Double q2130;

    @ApiModelProperty(value = "2145 无功21:45 时刻系统无功预测值")
    private Double q2145;

    @ApiModelProperty(value = "2200 无功22:00 时刻系统无功预测值")
    private Double q2200;

    @ApiModelProperty(value = "2215 无功22:15 时刻系统无功预测值")
    private Double q2215;

    @ApiModelProperty(value = "2230 无功22:30 时刻系统无功预测值")
    private Double q2230;

    @ApiModelProperty(value = "2245 无功22:45 时刻系统无功预测值")
    private Double q2245;

    @ApiModelProperty(value = "2300 无功23:00 时刻系统无功预测值")
    private Double q2300;

    @ApiModelProperty(value = "2315 无功23:15 时刻系统无功预测值")
    private Double q2315;

    @ApiModelProperty(value = "2330 无功23:30 时刻系统无功预测值")
    private Double q2330;

    @ApiModelProperty(value = "2345 无功23:45 时刻系统无功预测值")
    private Double q2345;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
