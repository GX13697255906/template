package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@TableName("biz_index_node_price")
@ApiModel(value = "IndexNodePrice对象", description = "市场节点电价(实时/日前)指标表")
public class IndexNodePrice extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "厂站编码")
    private String facCode;

    @ApiModelProperty(value = "厂站名称")
    private String facName;

    @ApiModelProperty(value = "行政区域")
    private String facAdress;

    @ApiModelProperty(value = "节点编码")
    private String nodeCode;

    @ApiModelProperty(value = "节点名称")
    private String nodeName;

    @ApiModelProperty(value = "价格类型(1实时 2日前)")
    private String type;

    @ApiModelProperty(value = "0点指标值")
    private Double value0;

    @ApiModelProperty(value = "1点指标值")
    private Double value1;

    @ApiModelProperty(value = "2点指标值")
    private Double value2;

    @ApiModelProperty(value = "3点指标值")
    private Double value3;

    @ApiModelProperty(value = "4点指标值")
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

