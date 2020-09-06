package com.dms.cloud.biz308.client.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 超短期母线负荷预测表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_bus_load_forecastiong")
@ApiModel(value="BusLoadForecastiong对象", description="超短期母线负荷预测表")
public class BusLoadForecastiong extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "超短期系统负荷预测id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "负荷名称")
    private String loadName;

    @ApiModelProperty(value = "负荷编码")
    private String loadCode;

    @ApiModelProperty(value = "时间(yyyyMMdd_hhmm)")
    private String dateTime;

    @ApiModelProperty(value = "有功数据")
    private Double valueP;

    @ApiModelProperty(value = "无功数据")
    private Double valueQ;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "数据时间（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
