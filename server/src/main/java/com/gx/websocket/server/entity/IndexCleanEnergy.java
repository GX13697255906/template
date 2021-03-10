package com.gx.websocket.server.entity;

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
 * 清洁能源指标表
 *
 * @author Tianshuai
 * @date 2019-10-21
 */
@Data
@NoArgsConstructor
@TableName("biz_index_clean_energy")
@ApiModel(value="IndexCleanEnergy对象", description="清洁能源指标表")
public class IndexCleanEnergy extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "类型（1-清洁能源消纳比例）")
    private String type;

    @ApiModelProperty(value = "清洁能源消纳比例")
    private Double value;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "利用小时数")
    private Double useHour;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
