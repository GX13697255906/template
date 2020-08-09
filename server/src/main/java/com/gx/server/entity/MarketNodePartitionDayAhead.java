package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 日前市场节点分区信息
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_market_node_partition_day_ahead")
@ApiModel(value="MarketNodePartitionDayAhead对象", description="日前市场节点分区信息")
public class MarketNodePartitionDayAhead extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "实时市场节点分区信息id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "时间(yyyyMMdd_hhmm)")
    private String date;

    @ApiModelProperty(value = "分区")
    private String zone;

    @ApiModelProperty(value = "分区价格")
    private Double price;

    @ApiModelProperty(value = "节点名称")
    private String nodeName;

    @ApiModelProperty(value = "节点编码")
    private String nodeCode;

    @ApiModelProperty(value = "数据时间 -1")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
