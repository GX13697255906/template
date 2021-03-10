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
 * 批发用户购电费用差值
 *
 * @author qingbo
 * @date 2019-11-20
 */
@Data
@TableName("biz_index_user_cost_minus")
@ApiModel(value = "IndexUserCostMinus对象", description = "批发用户购电费用差值")
public class IndexUserCostMinus extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "批发用户购电费用差值类型（1-日差值 ，2-月差值， 3-年差值）")
    private String type;

    @ApiModelProperty(value = "差值")
    private Double value;

    @ApiModelProperty(value = "日期（yyyy-MM-dd），当为月差值时，日期是当月第一天的日期，当为年时，日期是当年第一天的日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
