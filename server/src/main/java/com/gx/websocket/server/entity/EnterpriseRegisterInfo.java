package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 企业注册信息表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@NoArgsConstructor
@TableName("biz_enterprise_register_info")
@ApiModel(value="EnterpriseRegisterInfo对象", description="企业注册信息表")
public class EnterpriseRegisterInfo extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "企业注册信息ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "企业名称")
    private String enterpriseName;

    @ApiModelProperty(value = "用户编码")
    private String userCode;

    @ApiModelProperty(value = "企业简称")
    private String enterpriseAbbr;

    @ApiModelProperty(value = "所属省级电网公司")
    private String provincialPowerGridName;

    @ApiModelProperty(value = "所属地级电网公司")
    private String regionalPowerGridName;

    @ApiModelProperty(value = "行政区域")
    private String administrativeDivision;

    @ApiModelProperty(value = "注册地址")
    private String registrationAddress;

    @ApiModelProperty(value = "注册资本,万元")
    private String registrationAsset;

    @ApiModelProperty(value = "电话")
    private String tel;

    @ApiModelProperty(value = "传真")
    private String fax;

    @ApiModelProperty(value = "邮政编码")
    private String postCode;

    @ApiModelProperty(value = "企业性质")
    private String enterpriseNature;

    @ApiModelProperty(value = "行业分类")
    private String industryClass;

    @ApiModelProperty(value = "负荷性质")
    private String loadNature;

    @ApiModelProperty(value = "企业所在地")
    private String enterpriseArea;

    @ApiModelProperty(value = "登记注册工商行政 管理局")
    private String registrationAic;

    @ApiModelProperty(value = "税务登记号")
    private String taxRegistrationId;

    @ApiModelProperty(value = "组织机构代码")
    private String agencyCode;

    @ApiModelProperty(value = "法定代表人")
    private String legalRepresentative;

    @ApiModelProperty(value = "法定代表人身份证 号")
    private String idnumber;

    @ApiModelProperty(value = "开户名称")
    private String accountName;

    @ApiModelProperty(value = "开户银行")
    private String accountBank;

    @ApiModelProperty(value = "账号,政府核准上网电价")
    private String accountNumber;

    @ApiModelProperty(value = "所有制")
    private String ownership;

    @ApiModelProperty(value = "企业类型(1-批发用户   2-售电公司)")
    private String type;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
