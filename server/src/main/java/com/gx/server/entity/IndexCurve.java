package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 曲线指标表
 *
 * @author houcun
 * @date 2019-10-24
 */
@Data
@TableName("biz_index_curve")
@ApiModel(value = "IndexCurve对象", description = "曲线指标表")
public class IndexCurve extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

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

    @ApiModelProperty(value = "曲线类型：1-电厂日前价格曲线 2-电厂日前出力曲线 3-电厂实时价格曲线4-电厂实时出力曲线5-电厂实际上网电量曲线6-批发用户实际用电曲线7-批发用户日前用电曲线8-售电公司日前申报曲线9-售电公司代理用户实际用电曲线")
    private String type;

    @ApiModelProperty(value = "0点指标值")
    private Double value0;

    @ApiModelProperty(value = "1点指标值")
    private Double value1;

    @ApiModelProperty(value = "2点指标值")
    private Double value2;

    @ApiModelProperty(value = "3点指标值")
    private Double value3;

    @ApiModelProperty(value = "4点执指标值")
    private Double value4;

    @ApiModelProperty(value = "5点指标值")
    private Double value5;

    @ApiModelProperty(value = "6点指标值")
    private Double value6;

    @ApiModelProperty(value = "7点指标值")
    private Double value7;

    @ApiModelProperty(value = "8点指标值")
    private Double value8;

    @ApiModelProperty(value = "9点指标值")
    private Double value9;

    @ApiModelProperty(value = "10点指标值")
    private Double value10;

    @ApiModelProperty(value = "11点指标值")
    private Double value11;

    @ApiModelProperty(value = "12点指标值")
    private Double value12;

    @ApiModelProperty(value = "13点指标值")
    private Double value13;

    @ApiModelProperty(value = "14点指标值")
    private Double value14;

    @ApiModelProperty(value = "15点指标值")
    private Double value15;

    @ApiModelProperty(value = "16点指标值")
    private Double value16;

    @ApiModelProperty(value = "17点指标值")
    private Double value17;

    @ApiModelProperty(value = "18点指标值")
    private Double value18;

    @ApiModelProperty(value = "19点指标值")
    private Double value19;

    @ApiModelProperty(value = "20点指标值")
    private Double value20;

    @ApiModelProperty(value = "21点指标值")
    private Double value21;

    @ApiModelProperty(value = "22点指标值")
    private Double value22;

    @ApiModelProperty(value = "23点指标值")
    private Double value23;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
