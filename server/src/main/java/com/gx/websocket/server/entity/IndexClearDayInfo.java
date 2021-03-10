package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 全景动态主体监测看板指标
 *
 * @author Blue
 * @date 2020-03-10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_clear_day_info")
@ApiModel(value = "IndexClearDayInfo对象", description = "全景动态主体监测看板指标")
public class IndexClearDayInfo extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "看板数据类型(1:发电公司,2:批发用户,3:售电公司)")
    private String type;

    @ApiModelProperty(value = "区域编码")
    private String areaCode;

    @ApiModelProperty(value = "参与主体编码")
    private String userCode;

    @ApiModelProperty(value = "发电侧机组编码")
    private String unitCode;

    @ApiModelProperty(value = "费用(预期收益/预期电费)")
    private Double fee;

    @ApiModelProperty(value = "电量(市场发电量/市场用电量)")
    private Double eleValue;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
