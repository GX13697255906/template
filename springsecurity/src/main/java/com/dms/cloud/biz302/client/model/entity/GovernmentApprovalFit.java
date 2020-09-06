package com.dms.cloud.biz302.client.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.mybatis.base.entity.AbstractEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 政府核准上网电价表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_government_approval_fit")
@ApiModel(value="GovernmentApprovalFit对象", description="政府核准上网电价表")
public class GovernmentApprovalFit extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "上网电价ID")
    @TableId(value = "fit_id", type = IdType.ID_WORKER)
    private Long fitId;

    @ApiModelProperty(value = "电厂编码")
    private String powerPlantCode;

    @ApiModelProperty(value = "电厂名称")
    private String powerPlantName;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "机组名称")
    private String unitName;

    @ApiModelProperty(value = "上网电价（元/MWh）")
    private Double salesPriceToNetwork;

    @ApiModelProperty(value = "执行开始时间（yyyyMMdd_hhmm）")
    private String startTime;

    @ApiModelProperty(value = "执行结束时间（yyyyMMdd_hhmm）")
    private String endTime;

    @ApiModelProperty(value = "状态（0-有效 1-无效）")
    private Integer status;


}
