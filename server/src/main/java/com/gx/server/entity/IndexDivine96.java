package com.gx.server.entity;

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
 * 预测准确率表-1天96点
 *
 * @author qingbo
 * @date 2020-04-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_divine_96")
@ApiModel(value="IndexDivine96对象", description="预测准确率表-1天96点")
public class IndexDivine96 extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "预测类型1：超短期系统负荷预测2：非市场机组出力预测3：联络线集合偏差率")
            private String type;

    @ApiModelProperty(value = "0000准确率")
    private Double p0000;

    @ApiModelProperty(value = "0000实际负荷")
    private Double a0000;

    @ApiModelProperty(value = "0000预测负荷")
    private Double f0000;

    @ApiModelProperty(value = "0015准确率")
    private Double p0015;

    private Double a0015;

    private Double f0015;

    @ApiModelProperty(value = "0030准确率")
    private Double p0030;

    private Double a0030;

    private Double f0030;

    private Double p0045;

    private Double a0045;

    private Double f0045;

    private Double p0100;

    private Double a0100;

    private Double f0100;

    private Double p0115;

    private Double a0115;

    private Double f0115;

    private Double p0130;

    private Double a0130;

    private Double f0130;

    private Double p0145;

    private Double a0145;

    private Double f0145;

    private Double p0200;

    private Double a0200;

    private Double f0200;

    private Double p0215;

    private Double a0215;

    private Double f0215;

    private Double p0230;

    private Double a0230;

    private Double f0230;

    private Double p0245;

    private Double a0245;

    private Double f0245;

    private Double p0300;

    private Double a0300;

    private Double f0300;

    private Double p0315;

    private Double a0315;

    private Double f0315;

    private Double p0330;

    private Double a0330;

    private Double f0330;

    private Double p0345;

    private Double a0345;

    private Double f0345;

    private Double p0400;

    private Double a0400;

    private Double f0400;

    private Double p0415;

    private Double a0415;

    private Double f0415;

    private Double p0430;

    private Double a0430;

    private Double f0430;

    private Double p0445;

    private Double a0445;

    private Double f0445;

    private Double p0500;

    private Double a0500;

    private Double f0500;

    private Double p0515;

    private Double a0515;

    private Double f0515;

    private Double p0530;

    private Double a0530;

    private Double f0530;

    private Double p0545;

    private Double a0545;

    private Double f0545;

    private Double p0600;

    private Double a0600;

    private Double f0600;

    private Double p0615;

    private Double a0615;

    private Double f0615;

    private Double p0630;

    private Double a0630;

    private Double f0630;

    private Double p0645;

    private Double a0645;

    private Double f0645;

    private Double p0700;

    private Double a0700;

    private Double f0700;

    private Double p0715;

    private Double a0715;

    private Double f0715;

    private Double p0730;

    private Double a0730;

    private Double f0730;

    private Double p0745;

    private Double a0745;

    private Double f0745;

    private Double p0800;

    private Double a0800;

    private Double f0800;

    private Double p0815;

    private Double a0815;

    private Double f0815;

    private Double p0830;

    private Double a0830;

    private Double f0830;

    private Double p0845;

    private Double a0845;

    private Double f0845;

    private Double p0900;

    private Double a0900;

    private Double f0900;

    private Double p0915;

    private Double a0915;

    private Double f0915;

    private Double p0930;

    private Double a0930;

    private Double f0930;

    private Double p0945;

    private Double a0945;

    private Double f0945;

    private Double p1000;

    private Double a1000;

    private Double f1000;

    private Double p1015;

    private Double a1015;

    private Double f1015;

    private Double p1030;

    private Double a1030;

    private Double f1030;

    private Double p1045;

    private Double a1045;

    private Double f1045;

    private Double p1100;

    private Double a1100;

    private Double f1100;

    private Double p1115;

    private Double a1115;

    private Double f1115;

    private Double p1130;

    private Double a1130;

    private Double f1130;

    private Double p1145;

    private Double a1145;

    private Double f1145;

    private Double p1200;

    private Double a1200;

    private Double f1200;

    private Double p1215;

    private Double a1215;

    private Double f1215;

    private Double p1230;

    private Double a1230;

    private Double f1230;

    private Double p1245;

    private Double a1245;

    private Double f1245;

    private Double p1300;

    private Double a1300;

    private Double f1300;

    private Double p1315;

    private Double a1315;

    private Double f1315;

    private Double p1330;

    private Double a1330;

    private Double f1330;

    private Double p1345;

    private Double a1345;

    private Double f1345;

    private Double p1400;

    private Double a1400;

    private Double f1400;

    private Double p1415;

    private Double a1415;

    private Double f1415;

    private Double p1430;

    private Double a1430;

    private Double f1430;

    private Double a1445;

    private Double f1445;

    private Double p1445;

    private Double a1500;

    private Double f1500;

    private Double p1500;

    private Double a1515;

    private Double f1515;

    private Double p1515;

    private Double a1530;

    private Double f1530;

    private Double p1530;

    private Double a1545;

    private Double f1545;

    private Double p1545;

    private Double a1600;

    private Double f1600;

    private Double p1600;

    private Double p1615;

    private Double a1615;

    private Double f1615;

    private Double p1630;

    private Double a1630;

    private Double f1630;

    private Double p1645;

    private Double a1645;

    private Double f1645;

    private Double p1700;

    private Double a1700;

    private Double f1700;

    private Double p1715;

    private Double a1715;

    private Double f1715;

    private Double p1730;

    private Double a1730;

    private Double f1730;

    private Double p1745;

    private Double a1745;

    private Double f1745;

    private Double p1800;

    private Double a1800;

    private Double f1800;

    private Double p1815;

    private Double a1815;

    private Double f1815;

    private Double p1830;

    private Double a1830;

    private Double f1830;

    private Double p1845;

    private Double a1845;

    private Double f1845;

    private Double p1900;

    private Double a1900;

    private Double f1900;

    private Double p1915;

    private Double a1915;

    private Double f1915;

    private Double p1930;

    private Double a1930;

    private Double f1930;

    private Double p1945;

    private Double a1945;

    private Double f1945;

    private Double p2000;

    private Double a2000;

    private Double f2000;

    private Double p2015;

    private Double a2015;

    private Double f2015;

    private Double p2030;

    private Double a2030;

    private Double f2030;

    private Double p2045;

    private Double a2045;

    private Double f2045;

    private Double p2100;

    private Double a2100;

    private Double f2100;

    private Double p2115;

    private Double a2115;

    private Double f2115;

    private Double p2130;

    private Double a2130;

    private Double f2130;

    private Double p2145;

    private Double a2145;

    private Double f2145;

    private Double p2200;

    private Double a2200;

    private Double f2200;

    private Double p2215;

    private Double a2215;

    private Double f2215;

    private Double p2230;

    private Double a2230;

    private Double f2230;

    private Double p2245;

    private Double a2245;

    private Double f2245;

    private Double p2300;

    private Double a2300;

    private Double f2300;

    private Double p2315;

    private Double a2315;

    private Double f2315;

    private Double p2330;

    private Double a2330;

    private Double f2330;

    private Double p2345;

    private Double a2345;

    private Double f2345;

    @ApiModelProperty(value = "时间（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
