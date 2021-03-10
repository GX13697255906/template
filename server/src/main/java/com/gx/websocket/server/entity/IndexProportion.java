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
 * 占比指标计算存储表
 *
 * @author houcun
 * @date 2019-10-24
 */
@Data
@TableName("biz_index_proportion")
@ApiModel(value = "IndexProportion对象", description = "占比指标计算存储表")
public class IndexProportion extends AbstractEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "主体编码（电厂编码、批发用户/售电公司注册ID）")
    private String subjectCode;

    @ApiModelProperty(value = "主体名称（电厂名称、批发用户/售电公司企业名称）")
    private String subjectName;

    @ApiModelProperty(value = "主体类型（针对批发用户/售电公司类型）")
    private String subjectType;

    @ApiModelProperty(value = "机组编码")
    private String unitCode;

    @ApiModelProperty(value = "机组名称")
    private String unitName;

    @ApiModelProperty(value = "占比类型(1 燃煤日占比 2 燃煤月占比 3 燃煤年占比 4 燃气日占比 5 燃气月占比 6 燃气年占比 7 价格帽中标机组数量占比 8 价格帽出清节点数量占比 9 中长期交易电量与日前出清电量占比(月) 10 中长期交易电量与日前出清电量占比(季) 11 中长期交易电量与日前出清电量占比（年） 12 燃煤季占比  13 燃气季占比)")
    private Integer valueType;

    @ApiModelProperty(value = "值")
    private Double value;

    @ApiModelProperty(value = "中标机组数量占比时 存储引字段 出清量")
    private Double loadValue;

    @ApiModelProperty(value = "日期")
    private Date scopeDate;

    @ApiModelProperty(value = "状态 0-有效  1-无效")
    private Integer status;


}
