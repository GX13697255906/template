package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_ave_actual_bonus_month")
@ApiModel(value="IndexAveActualBonusMonth对象", description="")
public class IndexAveActualBonusMonth extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    private String areaCode;

    private String type;

    private String aveValue;

    private String highValue;

    private String lowValue;

    private String scopeDate;

    private Integer status;


}

