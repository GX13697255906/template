package com.gx.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 发电企业主体注册信息表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@NoArgsConstructor
@TableName("biz_power_plant_register_info")
@ApiModel(value = "PowerPlantRegisterInfo对象", description = "发电企业主体注册信息表")
public class PowerPlantRegisterInfo extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "发电企业主体注册信息ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "电厂编码（统一编码）")
    private String powerPlantCode;

    @ApiModelProperty(value = "电厂名称")
    private String powerPlantName;

    @ApiModelProperty(value = "所属行政区域")
    private String administrativeDivision;

    @ApiModelProperty(value = "所属发电集团")
    private String powerGenerationCo;

    @ApiModelProperty(value = "电厂地址")
    private String powerPlantAddress;

    @ApiModelProperty(value = "电话")
    private String tel;

    @ApiModelProperty(value = "传真")
    private String fax;

    @ApiModelProperty(value = "邮政编码")
    private String postCode;

    @ApiModelProperty(value = "登记注册工商行政 管理局")
    private String registrationAic;

    @ApiModelProperty(value = "营业执照编码")
    private String businessLicCode;

    @ApiModelProperty(value = "电厂（机组）发电业 务许可证编号")
    private String unitGeneratingServiceLicCode;

    @ApiModelProperty(value = "税务登记号")
    private String taxRegistrationId;

    @ApiModelProperty(value = "组织机构代码")
    private String agencyCode;

    @ApiModelProperty(value = "法定代表人")
    private String legalRepresentative;

    @ApiModelProperty(value = "法人代表证件类型，身份证等")
    private String documentType;

    @ApiModelProperty(value = "法定代表人证件号码")
    private String idNumber;

    @ApiModelProperty(value = "开户名称")
    private String accountName;

    @ApiModelProperty(value = "开户银行")
    private String accountBank;

    @ApiModelProperty(value = "账号")
    private String accountNumber;

    @ApiModelProperty(value = "所有制，国有、民营")
    private String ownership;

    @ApiModelProperty(value = "所属省级电网公司")
    private String provincialPowerGridName;

    @ApiModelProperty(value = "所属地级电网公司")
    private String regionalPowerGridName;

    @ApiModelProperty(value = "调度关系，网调、中调、地调、其他")
    private String dispatchingRelation;

    @ApiModelProperty(value = "统一社会信用代码")
    private String uniformSocialCreditCode;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

    @ApiModelProperty(value = "是否手动维护标志 0-不是 1-是")
    private Integer isManualFlag;
}
