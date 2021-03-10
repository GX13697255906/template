package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * HHI指标表-月度
 *
 * @author lijuan
 * @date 2020-04-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_hhi_month")
@ApiModel(value="IndexHhiMonth对象", description="HHI指标表-月度")
public class IndexHhiMonth extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "所属发电集团")
    private String powerGenerationCo;

    @ApiModelProperty(value = "HHI类型：1-发电装机 2-实时出清量 3-实时用电量")
    private String type;

    @ApiModelProperty(value = "HHI值")
    private Double value;

    @ApiModelProperty(value = "市场份额")
    private Double rank;

    @ApiModelProperty(value = "集团值")
    private Double valueSelf;

    @ApiModelProperty(value = "全市场值")
    private Double valueAll;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
