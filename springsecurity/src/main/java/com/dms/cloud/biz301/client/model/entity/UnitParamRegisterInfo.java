package com.dms.cloud.biz301.client.model.entity;

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
 * 机组注册参数表
 *
 * @author houcun
 * @date 2019-10-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_unit_param_register_info")
@ApiModel(value="UnitParamRegisterInfo对象", description="机组注册参数表")
public class UnitParamRegisterInfo extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "机组参数注册ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "机组名称")
    private String unitName;

    @ApiModelProperty(value = "电厂编码")
    private String powerPlantCode;

    @ApiModelProperty(value = "电厂名称")
    private String powerPlantName;

    @ApiModelProperty(value = "机组类型")
    private String unitType;

    @ApiModelProperty(value = "额定出力")
    private Double ratedOutput;

    @ApiModelProperty(value = "最小技术出力（兆瓦）")
    private Double minimumLoading;

    @ApiModelProperty(value = "冷态开机通知时间（分钟）")
    private Float coldStartingInfoTime;

    @ApiModelProperty(value = "温态开机通知时间（分钟）")
    private Float warmStartingInfoTime;

    @ApiModelProperty(value = "热态开机通知时间（分钟）")
    private Float hotStartingInfoTime;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

    @ApiModelProperty(value = "是否手动维护标志 0-不是  1-是")
    private Integer isManualFlag;
}
