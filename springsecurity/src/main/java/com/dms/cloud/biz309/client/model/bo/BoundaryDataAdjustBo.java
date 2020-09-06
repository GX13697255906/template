package com.dms.cloud.biz309.client.model.bo;

import com.dms.cloud.biz309.client.model.entity.BoundaryDataAdjust;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 边界数据调整记录表 查询参数对象
 * 
 * @author dgq
 * @date 2019/10/29
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BoundaryDataAdjustBo extends BoundaryDataAdjust {

    private static final long serialVersionUID = 1L;

    /**
     * 开始时间 (yyyy-MM-dd hh:mm:ss)
     */
    @ApiModelProperty(value = "开始时间(yyyy-MM-dd hh:mm:ss)")
    private String startDate;
    /**
     * 结束时间 (yyyy-MM-dd hh:mm:ss)
     */
    @ApiModelProperty(value = "结束时间(yyyy-MM-dd hh:mm:ss)")
    private String endDate;

}
