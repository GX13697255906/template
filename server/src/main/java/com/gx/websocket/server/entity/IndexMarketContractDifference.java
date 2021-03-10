package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 日期市场与中长期合同差值
 *
 * @author dgq
 * @date 2019-10-31
 */
@Data
@TableName("biz_index_market_contract_difference")
@ApiModel(value = "IndexMarketContractDifference对象", description = "日期市场与中长期合同差值")
public class IndexMarketContractDifference extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "电厂名称")
    private String powerPlantName;

    @ApiModelProperty(value = "电厂编码")
    private String powerPlantCode;

    @ApiModelProperty(value = "所属行政区域")
    private String administrativeDivision;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "机组名称")
    private String unitName;

    @ApiModelProperty(value = "机组类型{0:全部机组;1:燃气机组;2:燃煤机组;}")
    private String unitType;

    @ApiModelProperty(value = "差值类型{1:价格差值;2:电量占比;3:三种中长期合同交易电量;4:三种中长期合同交易数量;5:三种中长期合同交易电量价格;}")
    private Integer differenceType;

    @ApiModelProperty(value = "市场值")
    private Double marketValue;

    @ApiModelProperty(value = "合同值")
    private Double contractValue;

    @ApiModelProperty(value = "差值")
    private Double differenceValue;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "数据时间 -1（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态{valid:0,有效;invalid:1,无效;}")
    private Integer status;

}
