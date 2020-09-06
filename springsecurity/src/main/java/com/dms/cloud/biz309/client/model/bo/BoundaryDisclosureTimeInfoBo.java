package com.dms.cloud.biz309.client.model.bo;

import com.dms.cloud.biz309.client.model.entity.BoundaryDisclosureTimeInfo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 边界信息披露时间表 查询条件
 * 
 * @author dgq
 * @date 2019/10/28
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BoundaryDisclosureTimeInfoBo extends BoundaryDisclosureTimeInfo {

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
