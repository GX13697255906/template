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

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_clear_day_info_user")
@ApiModel(value="IndexClearDayInfoUser对象", description="售电/批发/发电日清算结果（以天为单位）统计表")
public class IndexClearDayInfoUser extends AbstractEntity {

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

    @ApiModelProperty(value = "预估收益")
    private Double feeDay;

    @ApiModelProperty(value = "电厂日前实际出力")
    private Double eleValueDay;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
