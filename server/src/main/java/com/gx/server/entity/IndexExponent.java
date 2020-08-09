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
 * @author houcun
 * @date 2019-10-24
 */
@Data
@TableName("biz_index_exponent")
@ApiModel(value = "IndexExponent对象", description = "")
public class IndexExponent extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "电厂编码")
    private String powerPlantCode;

    @ApiModelProperty(value = "电厂名称")
    private String powerPlantName;

    @ApiModelProperty(value = "所属行政区域")
    private String administrativeDivision;

    @ApiModelProperty(value = "所属发电集团")
    private String powerGenerationCo;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "机组名称")
    private String unitName;

    @ApiModelProperty(value = "机组类型")
    private String unitType;

    @ApiModelProperty(value = "指标类型 （1.HHI指数 2.现货市场机组类型多元化指数 3.关键供应商报价加成指数 4.平均报价加成指数 5.机组类型/价格区间/高峰/非高峰：机组平均实际加成指数）")
    private String type;

    @ApiModelProperty(value = "价格")
    private Double price;

    @ApiModelProperty(value = "指标类型 （1.HHI指数 2.现货市场机组类型多元化指数 3.关键供应商报价加成指数 4.平均报价加成指数 5.机组类型/价格区间/高峰/非高峰：机组平均实际加成指数）")
    private Double value;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
