package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_unit_market_price_day_ahead")
@ApiModel(value = "UnitMarketPriceDayAhead对象", description = "发电侧日前市场出清价格信息表 ")
public class UnitMarketPriceDayAhead extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "发电侧日前市场出清价格信息ID")
    @TableId(value = "pbprice_id", type = IdType.ID_WORKER)
    private Long pbpriceId;

    @ApiModelProperty(value = "电厂编码")
    private String powerPlantCode;

    @ApiModelProperty(value = "电厂调度名称")
    private String powerPlantName;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "机组调度名称")
    private String unitName;

    @ApiModelProperty(value = "00:00 出清价格")
    private Double price0000;

    @ApiModelProperty(value = "00:15 出清价格")
    private Double price0015;

    @ApiModelProperty(value = "00:30 出清价格")
    private Double price0030;

    @ApiModelProperty(value = "00:45 出清价格")
    private Double price0045;

    @ApiModelProperty(value = "01:00 出清价格")
    private Double price0100;

    @ApiModelProperty(value = "01:15 出清价格")
    private Double price0115;

    @ApiModelProperty(value = "01:30 出清价格")
    private Double price0130;

    @ApiModelProperty(value = "01:45 出清价格")
    private Double price0145;

    @ApiModelProperty(value = "02:00 出清价格")
    private Double price0200;

    @ApiModelProperty(value = "02:15 出清价格")
    private Double price0215;

    @ApiModelProperty(value = "02:30 出清价格")
    private Double price0230;

    @ApiModelProperty(value = "02:45 出清价格")
    private Double price0245;

    @ApiModelProperty(value = "03:00 出清价格")
    private Double price0300;

    @ApiModelProperty(value = "03:15 出清价格")
    private Double price0315;

    @ApiModelProperty(value = "03:30 出清价格")
    private Double price0330;

    @ApiModelProperty(value = "03:45 出清价格")
    private Double price0345;

    @ApiModelProperty(value = "04:00 出清价格")
    private Double price0400;

    @ApiModelProperty(value = "04:15 出清价格")
    private Double price0415;

    @ApiModelProperty(value = "04:30 出清价格")
    private Double price0430;

    @ApiModelProperty(value = "04:45 出清价格")
    private Double price0445;

    @ApiModelProperty(value = "05:00 出清价格")
    private Double price0500;

    @ApiModelProperty(value = "05:15 出清价格")
    private Double price0515;

    @ApiModelProperty(value = "05:30 出清价格")
    private Double price0530;

    @ApiModelProperty(value = "05:45 出清价格")
    private Double price0545;

    @ApiModelProperty(value = "06:00 出清价格")
    private Double price0600;

    @ApiModelProperty(value = "06:15 出清价格")
    private Double price0615;

    @ApiModelProperty(value = "06:30 出清价格")
    private Double price0630;

    @ApiModelProperty(value = "06:45 出清价格")
    private Double price0645;

    @ApiModelProperty(value = "07:00 出清价格")
    private Double price0700;

    @ApiModelProperty(value = "07:15 出清价格")
    private Double price0715;

    @ApiModelProperty(value = "07:30 出清价格")
    private Double price0730;

    @ApiModelProperty(value = "07:45 出清价格")
    private Double price0745;

    @ApiModelProperty(value = "08:00 出清价格")
    private Double price0800;

    @ApiModelProperty(value = "08:15 出清价格")
    private Double price0815;

    @ApiModelProperty(value = "08:30 出清价格")
    private Double price0830;

    @ApiModelProperty(value = "08:45 出清价格")
    private Double price0845;

    @ApiModelProperty(value = "09:00 出清价格")
    private Double price0900;

    @ApiModelProperty(value = "09:15 出清价格")
    private Double price0915;

    @ApiModelProperty(value = "09:30 出清价格")
    private Double price0930;

    @ApiModelProperty(value = "09:45 出清价格")
    private Double price0945;

    @ApiModelProperty(value = "10:00 出清价格")
    private Double price1000;

    @ApiModelProperty(value = "10:15 出清价格")
    private Double price1015;

    @ApiModelProperty(value = "10:30 出清价格")
    private Double price1030;

    @ApiModelProperty(value = "10:45 出清价格")
    private Double price1045;

    @ApiModelProperty(value = "11:00 出清价格")
    private Double price1100;

    @ApiModelProperty(value = "11:15 出清价格")
    private Double price1115;

    @ApiModelProperty(value = "11:30 出清价格")
    private Double price1130;

    @ApiModelProperty(value = "11:45 出清价格")
    private Double price1145;

    @ApiModelProperty(value = "12:00 出清价格")
    private Double price1200;

    @ApiModelProperty(value = "12:15 出清价格")
    private Double price1215;

    @ApiModelProperty(value = "12:30 出清价格")
    private Double price1230;

    @ApiModelProperty(value = "12:45 出清价格")
    private Double price1245;

    @ApiModelProperty(value = "13:00 出清价格")
    private Double price1300;

    @ApiModelProperty(value = "13:15 出清价格")
    private Double price1315;

    @ApiModelProperty(value = "13:30 出清价格")
    private Double price1330;

    @ApiModelProperty(value = "13:45 出清价格")
    private Double price1345;

    @ApiModelProperty(value = "14:00 出清价格")
    private Double price1400;

    @ApiModelProperty(value = "14:15 出清价格")
    private Double price1415;

    @ApiModelProperty(value = "14:30 出清价格")
    private Double price1430;

    @ApiModelProperty(value = "14:45 出清价格")
    private Double price1445;

    @ApiModelProperty(value = "15:00 出清价格")
    private Double price1500;

    @ApiModelProperty(value = "15:15 出清价格")
    private Double price1515;

    @ApiModelProperty(value = "15:30 出清价格")
    private Double price1530;

    @ApiModelProperty(value = "15:45 出清价格")
    private Double price1545;

    @ApiModelProperty(value = "16:00 出清价格")
    private Double price1600;

    @ApiModelProperty(value = "16:15 出清价格")
    private Double price1615;

    @ApiModelProperty(value = "16:30 出清价格")
    private Double price1630;

    @ApiModelProperty(value = "16:45 出清价格")
    private Double price1645;

    @ApiModelProperty(value = "17:00 出清价格")
    private Double price1700;

    @ApiModelProperty(value = "17:15 出清价格")
    private Double price1715;

    @ApiModelProperty(value = "17:30 出清价格")
    private Double price1730;

    @ApiModelProperty(value = "17:45 出清价格")
    private Double price1745;

    @ApiModelProperty(value = "18:00 出清价格")
    private Double price1800;

    @ApiModelProperty(value = "18:15 出清价格")
    private Double price1815;

    @ApiModelProperty(value = "18:30 出清价格")
    private Double price1830;

    @ApiModelProperty(value = "18:45 出清价格")
    private Double price1845;

    @ApiModelProperty(value = "19:00 出清价格")
    private Double price1900;

    @ApiModelProperty(value = "19:15 出清价格")
    private Double price1915;

    @ApiModelProperty(value = "19:30 出清价格")
    private Double price1930;

    @ApiModelProperty(value = "19:45 出清价格")
    private Double price1945;

    @ApiModelProperty(value = "20:00 出清价格")
    private Double price2000;

    @ApiModelProperty(value = "20:15 出清价格")
    private Double price2015;

    @ApiModelProperty(value = "20:30 出清价格")
    private Double price2030;

    @ApiModelProperty(value = "20:45 出清价格")
    private Double price2045;

    @ApiModelProperty(value = "21:00 出清价格")
    private Double price2100;

    @ApiModelProperty(value = "21:15 出清价格")
    private Double price2115;

    @ApiModelProperty(value = "21:30 出清价格")
    private Double price2130;

    @ApiModelProperty(value = "21:45 出清价格")
    private Double price2145;

    @ApiModelProperty(value = "22:00 出清价格")
    private Double price2200;

    @ApiModelProperty(value = "22:15 出清价格")
    private Double price2215;

    @ApiModelProperty(value = "22:30 出清价格")
    private Double price2230;

    @ApiModelProperty(value = "22:45 出清价格")
    private Double price2245;

    @ApiModelProperty(value = "23:00 出清价格")
    private Double price2300;

    @ApiModelProperty(value = "23:15 出清价格")
    private Double price2315;

    @ApiModelProperty(value = "23:30 出清价格")
    private Double price2330;

    @ApiModelProperty(value = "23:45 出清价格")
    private Double price2345;

    @ApiModelProperty(value = "时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
