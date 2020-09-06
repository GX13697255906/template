package com.dms.cloud.biz308.client.model.entity;

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
 * 实际检修停复电时间表
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_maintenance_time_plant_actual")
@ApiModel(value="MaintenanceTimePlantActual对象", description="实际检修停复电时间表")
public class MaintenanceTimePlantActual extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "实际检修停复电时间id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "设备调度名(设备名称)")
    private String equipmentName;

    @ApiModelProperty(value = "设备编码")
    private String equipmentCode;

    @ApiModelProperty(value = "厂站调度名(电厂名称)")
    private String plantSubstationName;

    @ApiModelProperty(value = "厂站编码")
    private String plantSubstationCode;

    @ApiModelProperty(value = "检修申请单号")
    private String applyId;

    @ApiModelProperty(value = "设备类型(机组、开关、刀闸、变压器、负荷、电 容器、线路、电抗器、母线、直流线路 输电断面、其他)")
    private String equipmentType;

    @ApiModelProperty(value = "设备状态(1：开关/刀闸合/线路/变压器/机组/电容 器/电抗器/直流线路投入运行 0：开关/刀闸分/线路/变压器/机组/电容 器/电抗器/直流线路退出运行)")
    private Long epuStatus;

    @ApiModelProperty(value = "状态类型(大修，小修，试验，调停,  备用，启用)")
    private String statusType;

    @ApiModelProperty(value = "状态改变原因(计划检修，方式调整、故障检修，机组 调停，启用)")
    private String amendReason;

    @ApiModelProperty(value = "停运或启用开始时间yyyymmdd_hhmmss")
    private String startTime;

    @ApiModelProperty(value = "停运或启用结束时间yyyymmdd_hhmmss")
    private String endTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "时间（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
