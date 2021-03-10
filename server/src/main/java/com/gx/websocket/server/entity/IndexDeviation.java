package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 偏差率指标表
 *
 * @author houcun
 * @date 2019-10-24
 */
@Data
@TableName("biz_index_deviation")
@ApiModel(value = "IndexDeviation对象", description = "偏差率指标表")
public class IndexDeviation extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "主体编码（电厂编码、批发用户/售电公司注册ID）")
    private String subjectCode;

    @ApiModelProperty(value = "主体名称（电厂名称、批发用户/售电公司企业名称）")
    private String subjectName;

    @ApiModelProperty(value = "主体类型（针对批发用户/售电公司类型）")
    private String subjectType;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "机组名称")
    private String unitName;

    @ApiModelProperty(value = "机组类型")
    private String unitType;

    @ApiModelProperty(value = "偏差率类型（1-电厂偏差率  2-批发用户偏差率 3-售电公司偏差率）")
    private String type;

    @ApiModelProperty(value = "0点执行偏差率")
    private Double value0;
    
    @ApiModelProperty(value = "1点执行偏差率")
    private Double value1;

    @ApiModelProperty(value = "2点执行偏差率")
    private Double value2;

    @ApiModelProperty(value = "3点执行偏差率")
    private Double value3;

    @ApiModelProperty(value = "4点执行偏差率")
    private Double value4;

    @ApiModelProperty(value = "5点执行偏差率")
    private Double value5;

    @ApiModelProperty(value = "6点执行偏差率")
    private Double value6;

    @ApiModelProperty(value = "7点执行偏差率")
    private Double value7;

    @ApiModelProperty(value = "8点执行偏差率")
    private Double value8;

    @ApiModelProperty(value = "9点执行偏差率")
    private Double value9;

    @ApiModelProperty(value = "10点执行偏差率")
    private Double value10;

    @ApiModelProperty(value = "11点执行偏差率")
    private Double value11;

    @ApiModelProperty(value = "12点执行偏差率")
    private Double value12;

    @ApiModelProperty(value = "13点执行偏差率")
    private Double value13;

    @ApiModelProperty(value = "14点执行偏差率")
    private Double value14;

    @ApiModelProperty(value = "15点执行偏差率")
    private Double value15;

    @ApiModelProperty(value = "16点执行偏差率")
    private Double value16;

    @ApiModelProperty(value = "17点执行偏差率")
    private Double value17;

    @ApiModelProperty(value = "18点执行偏差率")
    private Double value18;

    @ApiModelProperty(value = "19点执行偏差率")
    private Double value19;

    @ApiModelProperty(value = "20点执行偏差率")
    private Double value20;

    @ApiModelProperty(value = "21点执行偏差率")
    private Double value21;

    @ApiModelProperty(value = "22点执行偏差率")
    private Double value22;

    @ApiModelProperty(value = "23点执行偏差率")
    private Double value23;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
