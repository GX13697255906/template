package com.gx.server.entity;

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
@TableName("biz_user_market_result_actual")
@ApiModel(value="UserMarketResultActual对象", description="用电侧实时市场出清结果表")
public class UserMarketResultActual extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "电侧实时市场出清结果id")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "用户编码")
    private String userCode;

    @ApiModelProperty(value = "时间(yyyyMMdd_hhmm)")
    private String dateTime;

    @ApiModelProperty(value = "价格")
    private Double price;

    @ApiModelProperty(value = "出力")
    private Double output;

    @ApiModelProperty(value = "数据时间")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效 1-无效")
    private Integer status;


}
