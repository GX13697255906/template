package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author houcun
 * @date 2019-10-24
 */
@Data
@TableName("biz_index_special_event")
@ApiModel(value = "IndexSpecialEvent对象", description = "")
public class IndexSpecialEvent extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "特殊事件ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "特殊事件类型:1.台风事件2.高温预警3.寒潮预警4.重大节日5.保供电")
    private String eventType;

    @ApiModelProperty(value = "特殊事件天数")
    private Integer eventNum;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;


}
