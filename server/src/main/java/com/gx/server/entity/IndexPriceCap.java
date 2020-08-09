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
 * 价格帽指标
 * 
 * @author houcun
 * @date 2019-10-24
 */
@Data
@TableName("biz_index_price_cap")
@ApiModel(value = "IndexPriceCap对象", description = "")
public class IndexPriceCap extends AbstractEntity implements Serializable {

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

    @ApiModelProperty(value = "节点编码")
    private String nodeCode;

    @ApiModelProperty(value = "节点名称")
    private String nodeName;

    @ApiModelProperty(value = "1.节点价格帽中标机组出清量 2.节点价格帽出清量")
    private String type;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;

}
