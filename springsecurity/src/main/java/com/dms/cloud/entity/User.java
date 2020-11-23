package com.dms.cloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dms.cloud.common.AbstractEntity;

import java.time.LocalDateTime;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author xun.guo
 * @since 2020-11-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "用户对象", description = "用户对象")
@TableName("base_user")
public class User extends AbstractEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.ID_WORKER)
    private Long userId;

    @ApiModelProperty(value = "用户姓名")
    private String userName;

    @ApiModelProperty(value = "账号")
    private String nickName;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "用户状态 ： 0-有效  1-无效")
    private Integer status;


    public User(String userName, String nickName, String password) {
        this.userName = userName;
        this.nickName = nickName;
        this.password = password;
        this.status = 0;
    }

    public User() {
    }

}
