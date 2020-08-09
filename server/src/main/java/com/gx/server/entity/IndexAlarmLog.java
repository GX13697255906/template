package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 指标告警日志表
 *
 * @author Blue
 * @date 2020-03-02
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_alarm_log")
@ApiModel(value="IndexAlarmLog对象", description="指标告警日志表")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class IndexAlarmLog extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "指标编码")
    private String indexCode;

    @ApiModelProperty(value = "指标名称")
    private String indexName;

    @ApiModelProperty(value = "主题域")
    private String subjectField;

    @ApiModelProperty(value = "主体编码")
    private String subjectCode;

    @ApiModelProperty(value = "主体名称")
    private String subjectName;

    @ApiModelProperty(value = "主体类型：1-批发用户，2-售电公司，3-发电企业")
    private String subjectType;

    @ApiModelProperty(value = "告警等级（1-低 ，2-中，3-高）")
    private Integer warningLevel;

    @ApiModelProperty(value = "告警类型：1-市场告警，2-主体告警")
    private String warningType;

    @ApiModelProperty(value = "详细描述")
    private String description;

    @ApiModelProperty(value = "状态 （0-未查看 1-已查看 2-忽略 3-已删除）")
    private Integer status;

    @ApiModelProperty(value = "告警时间")
    private Date warningTime;
}
