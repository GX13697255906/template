package com.gx.websocket.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("biz_index_ave_actual_bonus_day_unit")
@ApiModel(value="IndexAveActualBonusDayUnit对象", description="")
public class IndexAveActualBonusDayUnit extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    private String areaCode;

    private String powerPlantCode;

    private String powerPlantName;

    private String administrativeDivision;

    private String unitCode;

    private String unitName;

    private String type;

    private String aveValue;

    private String highValue;

    private String lowValue;

    private Date scopeDate;

    private Integer status;


}

