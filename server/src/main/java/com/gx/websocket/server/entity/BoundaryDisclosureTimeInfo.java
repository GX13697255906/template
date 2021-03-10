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
 * 边界信息披露时间表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@NoArgsConstructor
@TableName("biz_boundary_disclosure_time_info")
@ApiModel(value="BoundaryDisclosureTimeInfo对象", description="边界信息披露时间表")
public class BoundaryDisclosureTimeInfo extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "边界信息披露时间id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "日期(yyyyMMdd)")
    private String date;

    @ApiModelProperty(value = "披露类型{1:日前市场;2:实时市场;3:调频市场;}")
    private String disclosureType;

    @ApiModelProperty(value = "披露项目(系统负荷预测、西电计划、A 类电 源总出力计划)")
    private String disclosureItem;

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
