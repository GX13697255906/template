package com.dms.cloud.biz309.client.model.entity;

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
 * 出清结果发布信息表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_clearing_results_published_info")
@ApiModel(value="ClearingResultsPublishedInfo对象", description="出清结果发布信息表")
public class ClearingResultsPublishedInfo extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "出清结果发布id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "区域名称")
    private String areaName;

    @ApiModelProperty(value = "日期(yyyyMMdd)")
    private String date;

    @ApiModelProperty(value = "出清结果类型{1:日前市场;2:实时市场;3:调频市场;}")
    private String clearingType;

    @ApiModelProperty(value = "时刻(日出清结果为 null，其他为出清时段 hhmm)")
    private String publishTime;

    @ApiModelProperty(value = "披露时间(yyyyMMdd_hhmmss)")
    private String disclosureTime;

    @ApiModelProperty(value = "披露人")
    private String staff;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "数据时间（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
