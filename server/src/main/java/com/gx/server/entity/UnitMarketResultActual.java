package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 *  发电侧实时市场出清结果表 
 *
 * @author houcun
 * @date 2019-10-15
 */
@Data
@NoArgsConstructor
@TableName("biz_unit_market_result_actual")
@ApiModel(value="UnitMarketResultActual对象", description=" 发电侧实时市场出清结果表 ")
public class UnitMarketResultActual extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "发电侧实时市场出清结果ID")
    @TableId(value = "realm_id", type = IdType.ID_WORKER)
    private Long realmId;

    @ApiModelProperty(value = "电厂编码")
    private String powerPlantCode;

    @ApiModelProperty(value = "电厂名称")
    private String powerPlantName;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "机组名称")
    private String unitName;

    @ApiModelProperty(value = "时间（yyyyMMdd_hhmm）")
    private String resultDateTime;

    @ApiModelProperty(value = "出清价格（元/MW）")
    private Double price;

    @ApiModelProperty(value = "开停（0-停 1-开）")
    private Integer startupShutdown;

    @ApiModelProperty(value = "出力")
    private Double output;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

    @ApiModelProperty(value = "时间")
    private Date scopeDate;

}
