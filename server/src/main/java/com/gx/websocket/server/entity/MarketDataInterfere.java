package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 市场出清结果人工干预信息表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@NoArgsConstructor
@TableName("biz_market_data_interfere")
@ApiModel(value="MarketDataInterfere对象", description="市场出清结果人工干预信息表")
public class MarketDataInterfere extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "市场出清结果人工干预信息id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "时间(yyyyMMdd_hhmmss)")
    private String dataTime;

    @ApiModelProperty(value = "操作人")
    private String staff;

    @ApiModelProperty(value = "市场类型{1:日前市场;2:实时市场;3:调频市场;}")
    private String marketType;

    @ApiModelProperty(value = "干预内容(“把 XX 机组 00:30  分的机组中标 出力由 300MW 修改为 350MW，价格由 450元/MW 修改为 500元/MW”)")
    private String interfereContent;

    @ApiModelProperty(value = "干预原因(“断面越限”)")
    private String interfereReason;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "数据时间 -1（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
