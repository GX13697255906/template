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

/**
 * 用电侧实时市场综合加权平均电价表
 *
 * @author houcun
 * @date 2020-04-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_user_market_average_price_actual")
@ApiModel(value="UserMarketAveragePriceActual对象", description="用电侧实时市场综合加权平均电价表")
public class UserMarketAveragePriceActual extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用电侧实时市场出清结果信息id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "电价时间(yyyyMMdd_HH:mm)")
    private String dataTime;

    @ApiModelProperty(value = "电价")
    private Double price;

    @ApiModelProperty(value = "数据状态(0可用,1不可用)")
    private Integer status;

    @ApiModelProperty(value = "数据时间(yyyy-MM-dd)")
    private Date scopeDate;


}
