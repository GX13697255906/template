package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 寡头指标服务
 *
 * @author staton
 * @date 2019-10-27
 */
@Data
@TableName("biz_index_single_head")
@ApiModel(value = "IndexSingleHead对象", description = "寡头指标服务")
public class IndexSingleHead extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @ApiModelProperty(value = "电厂名称")
    private String powerPlantName;

    @ApiModelProperty(value = "电厂编码")
    private String powerPlantCode;

    @ApiModelProperty(value = "数据类型 1 日关键供应商名单（方案二） 2 日双寡头机组（方案二） 3 日三寡头机组（方案二）")
    private Integer valueType;
    @ApiModelProperty(value = "每小时的值(该小时电厂的出力和)")
    private Double value;

    @ApiModelProperty(value = "时间（yyyy-MM-dd HH:mm:00）")
    private Date scopeDate;

    private Integer status;

    @ApiModelProperty(value = "计算双寡头/三寡头时，最大电厂申报出力的-电厂编码")
    private String topOneBindPowerPlantCode;

    @ApiModelProperty(value = "计算双寡头/三寡头时，最大电厂申报出力的-电厂名称")
    private String topOneBindPowerPlantName;

    @ApiModelProperty(value = "计算双寡头/三寡头时，最大电厂申报出力的值")
    private Double topOneBindPowerPlantOutput;

    @ApiModelProperty(value = "计算三寡头时，第二大电厂申报出力的-电厂编码")
    private String topTwoBindPowerPlantCode;

    @ApiModelProperty(value = "计算三寡头时，第二大电厂申报出力的-电厂名称")
    private String topTwoBindPowerPlantName;

    @ApiModelProperty(value = "计算三寡头时，第二大电厂申报出力的值")
    private Double topTwoBindPowerPlantOutput;

}
