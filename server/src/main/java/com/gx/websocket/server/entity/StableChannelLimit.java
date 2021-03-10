package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_stable_channel_limit")
@ApiModel(value="StableChannelLimit对象", description="稳定断面限额表")
public class StableChannelLimit extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "稳定断面限额id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "主条目")
    private String stabilityRule;

    @ApiModelProperty(value = "断面部分")
    private String stabilitySection;

    @ApiModelProperty(value = "断面公式")
    private String def;

    @ApiModelProperty(value = "限额部分")
    private Double supervisonLimit;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "数据时间 +1（YYYY-MM-DD）")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
