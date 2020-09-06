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
 * 市场运营流程状态信息表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_market_process_status")
@ApiModel(value="MarketProcessStatus对象", description="市场运营流程状态信息表")
public class MarketProcessStatus extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "市场运营流程状态信息id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "市场类型{1:日前市场;2:实时市场;3:调频市场;}")
    private String marketType;

    @ApiModelProperty(value = "流程节点(数据接入、事前发布、市场出清、 结果发布)")
    private String processNode;

    @ApiModelProperty(value = "开始时间(yyyyMMdd_hhmmss)")
    private String startTime;

    @ApiModelProperty(value = "结束时间(yyyyMMdd_hhmmss)")
    private String endTime;

    @ApiModelProperty(value = "操作人(实时市场、数据接入等自动程序执 行，操作人为 auto，其他人工操作 流程填写操作名称)")
    private String staff;

    @ApiModelProperty(value = "执行状态(成功/失败)")
    private String processStatus;

    @ApiModelProperty(value = "结果描述(执行失败时描述失败原因)")
    private String resultDescribe;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "数据时间 -1（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
