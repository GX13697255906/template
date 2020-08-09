package com.gx.server.entity;

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
 * 用户台账信息表
 *
 * @author houcun
 * @date 2019-10-14
 */
@Data
@NoArgsConstructor
@TableName("biz_user_standing_book")
@ApiModel(value = "UserStandingBook对象", description = "用户台账信息表")
public class UserStandingBook extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户台账id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "地市局")
    private String powerSupplyBureau;

    @ApiModelProperty(value = "单位")
    private String organization;

    @ApiModelProperty(value = "供电所")
    private String powerSupplyStation;

    @ApiModelProperty(value = "户号")
    private String userId;

    @ApiModelProperty(value = "用户名称")
    private String userName;

    @ApiModelProperty(value = "用户编号")
    private String userCode;

    @ApiModelProperty(value = "计量点编号")
    private String measurePointId;

    @ApiModelProperty(value = "计量点名称")
    private String measurePointName;

    @ApiModelProperty(value = "行业分类")
    private String industryClass;

    @ApiModelProperty(value = "用户容量")
    private String userCapacity;

    @ApiModelProperty(value = "电压等级")
    private String voltageLevel;

    @ApiModelProperty(value = "用电类型")
    private String consumptionType;

    @ApiModelProperty(value = "负荷性质")
    private String loadNature;

    @ApiModelProperty(value = "变电站")
    private String substation;

    @ApiModelProperty(value = "线路名称")
    private String lineName;

    @ApiModelProperty(value = "台区")
    private String supplyArea;

    @ApiModelProperty(value = "时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
