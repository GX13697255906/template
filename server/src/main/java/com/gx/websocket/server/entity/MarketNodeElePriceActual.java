package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_market_node_ele_price_actual")
@ApiModel(value="MarketNodeElePriceActual对象", description="实时市场节点电价信息表")
public class MarketNodeElePriceActual extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "实时市场节点电价信息id")
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

    @ApiModelProperty(value = "时间（yyyyMMdd_hhmm）")
    private String dateTime;

    @ApiModelProperty(value = "价格")
    private Double price;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
