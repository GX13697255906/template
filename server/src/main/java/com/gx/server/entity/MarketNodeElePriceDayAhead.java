package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 日前市场节点电价信息表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@NoArgsConstructor
@TableName("biz_market_node_ele_price_day_ahead")
@ApiModel(value = "MarketNodeElePriceDayAhead对象", description = "日前市场节点电价信息表")
public class MarketNodeElePriceDayAhead extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "日前市场节点电价信息表id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "厂站名称")
    private String facName;

    @ApiModelProperty(value = "厂站编码")
    private String facCode;

    @ApiModelProperty(value = "行政区域")
    private String facAdress;

    @ApiModelProperty(value = "节点名称(名称现货市场要求为准)")
    private String nodeName;

    @ApiModelProperty(value = "节点编码")
    private String nodeCode;

    @ApiModelProperty(value = "时间（yyyyMMdd）")
    private String date;

    @ApiModelProperty(value = "价格 0000")
    private Double price0000;

    @ApiModelProperty(value = "价格 0015")
    private Double price0015;

    @ApiModelProperty(value = "价格 0030 ")
    private Double price0030;

    @ApiModelProperty(value = "价格 0045")
    private Double price0045;

    @ApiModelProperty(value = "价格 0100")
    private Double price0100;

    @ApiModelProperty(value = "价格 0115 ")
    private Double price0115;

    @ApiModelProperty(value = "价格 0130")
    private Double price0130;

    @ApiModelProperty(value = "价格 0145 ")
    private Double price0145;

    @ApiModelProperty(value = "价格 0200 ")
    private Double price0200;

    @ApiModelProperty(value = "价格 0215")
    private Double price0215;

    @ApiModelProperty(value = "价格 0230 ")
    private Double price0230;

    @ApiModelProperty(value = "价格 0245")
    private Double price0245;

    @ApiModelProperty(value = "价格 0300")
    private Double price0300;

    @ApiModelProperty(value = "价格0315 ")
    private Double price0315;

    @ApiModelProperty(value = "价格 0330 ")
    private Double price0330;

    @ApiModelProperty(value = "价格 0345")
    private Double price0345;

    @ApiModelProperty(value = "价格 0400")
    private Double price0400;

    @ApiModelProperty(value = "价格 0415")
    private Double price0415;

    @ApiModelProperty(value = "价格 0430）")
    private Double price0430;

    @ApiModelProperty(value = "价格 0445")
    private Double price0445;

    @ApiModelProperty(value = "价格 0500")
    private Double price0500;

    @ApiModelProperty(value = "价格 0515")
    private Double price0515;

    @ApiModelProperty(value = "价格 0530")
    private Double price0530;

    @ApiModelProperty(value = "价格 0545")
    private Double price0545;

    @ApiModelProperty(value = "价格 0600")
    private Double price0600;

    @ApiModelProperty(value = "价格 0615")
    private Double price0615;

    @ApiModelProperty(value = "价格 0630")
    private Double price0630;

    @ApiModelProperty(value = "价格 0645")
    private Double price0645;

    @ApiModelProperty(value = "价格 0700")
    private Double price0700;

    @ApiModelProperty(value = "价格 0715")
    private Double price0715;

    @ApiModelProperty(value = "价格 0730")
    private Double price0730;

    @ApiModelProperty(value = "价格 0745")
    private Double price0745;

    @ApiModelProperty(value = "价格 0800")
    private Double price0800;

    @ApiModelProperty(value = "价格 0815")
    private Double price0815;

    @ApiModelProperty(value = "价格 0830")
    private Double price0830;

    @ApiModelProperty(value = "价格 0845")
    private Double price0845;

    @ApiModelProperty(value = "价格 0900")
    private Double price0900;

    @ApiModelProperty(value = "价格 0915")
    private Double price0915;

    @ApiModelProperty(value = "价格 0930")
    private Double price0930;

    @ApiModelProperty(value = "价格 0945")
    private Double price0945;

    @ApiModelProperty(value = "价格 1000")
    private Double price1000;

    @ApiModelProperty(value = "价格 1015")
    private Double price1015;

    @ApiModelProperty(value = "价格 1030")
    private Double price1030;

    @ApiModelProperty(value = "价格 1045")
    private Double price1045;

    @ApiModelProperty(value = "价格 1100")
    private Double price1100;

    @ApiModelProperty(value = "价格 1115")
    private Double price1115;

    @ApiModelProperty(value = "价格 1130")
    private Double price1130;

    @ApiModelProperty(value = "价格 1145")
    private Double price1145;

    @ApiModelProperty(value = "价格 1200")
    private Double price1200;

    @ApiModelProperty(value = "价格 1215")
    private Double price1215;

    @ApiModelProperty(value = "价格 1230")
    private Double price1230;

    @ApiModelProperty(value = "价格 1245")
    private Double price1245;

    @ApiModelProperty(value = "价格 1300")
    private Double price1300;

    @ApiModelProperty(value = "价格 1315")
    private Double price1315;

    @ApiModelProperty(value = "价格 1330")
    private Double price1330;

    @ApiModelProperty(value = "价格 1345")
    private Double price1345;

    @ApiModelProperty(value = "价格 1400")
    private Double price1400;

    @ApiModelProperty(value = "价格 1415")
    private Double price1415;

    @ApiModelProperty(value = "价格 1430")
    private Double price1430;

    @ApiModelProperty(value = "价格 1445")
    private Double price1445;

    @ApiModelProperty(value = "价格 1500")
    private Double price1500;

    @ApiModelProperty(value = "价格 1515")
    private Double price1515;

    @ApiModelProperty(value = "价格 1530")
    private Double price1530;

    @ApiModelProperty(value = "价格 1545")
    private Double price1545;

    @ApiModelProperty(value = "价格 1600")
    private Double price1600;

    @ApiModelProperty(value = "价格 1615")
    private Double price1615;

    @ApiModelProperty(value = "价格 1630")
    private Double price1630;

    @ApiModelProperty(value = "价格 1645")
    private Double price1645;

    @ApiModelProperty(value = "价格 1700")
    private Double price1700;

    @ApiModelProperty(value = "价格 1715")
    private Double price1715;

    @ApiModelProperty(value = "价格 1730")
    private Double price1730;

    @ApiModelProperty(value = "价格 1745")
    private Double price1745;

    @ApiModelProperty(value = "价格 1800")
    private Double price1800;

    @ApiModelProperty(value = "价格 1815")
    private Double price1815;

    @ApiModelProperty(value = "价格 1830")
    private Double price1830;

    @ApiModelProperty(value = "价格 1845")
    private Double price1845;

    @ApiModelProperty(value = "价格 1900")
    private Double price1900;

    @ApiModelProperty(value = "价格 1915")
    private Double price1915;

    @ApiModelProperty(value = "价格 1930")
    private Double price1930;

    @ApiModelProperty(value = "价格 1945")
    private Double price1945;

    @ApiModelProperty(value = "价格 2000")
    private Double price2000;

    @ApiModelProperty(value = "价格 2015")
    private Double price2015;

    @ApiModelProperty(value = "价格 2030")
    private Double price2030;

    @ApiModelProperty(value = "价格 2045")
    private Double price2045;

    @ApiModelProperty(value = "价格 2100")
    private Double price2100;

    @ApiModelProperty(value = "价格 2115")
    private Double price2115;

    @ApiModelProperty(value = "价格 2130")
    private Double price2130;

    @ApiModelProperty(value = "价格 2145")
    private Double price2145;

    @ApiModelProperty(value = "价格 2200")
    private Double price2200;

    @ApiModelProperty(value = "价格 2215")
    private Double price2215;

    @ApiModelProperty(value = "价格 2230")
    private Double price2230;

    @ApiModelProperty(value = "价格 2245")
    private Double price2245;

    @ApiModelProperty(value = "价格 2300")
    private Double price2300;

    @ApiModelProperty(value = "价格 2315")
    private Double price2315;

    @ApiModelProperty(value = "价格 2330")
    private Double price2330;

    @ApiModelProperty(value = "价格 2345")
    private Double price2345;

    @ApiModelProperty(value = "数据时间 -1")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
