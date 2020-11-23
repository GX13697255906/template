package com.dms.cloud.service;

import com.dms.cloud.entity.User;
import com.dms.cloud.common.IBaseService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author xun.guo
 * @since 2020-11-21
 */
public interface UserService extends IBaseService<User> {

    Boolean addUser(String userName, String nickName, String password);

    /**
     * 通过登录名获取用户信息
     *
     * @param nickName
     * @return
     */
    User getUserByNickName(String nickName);

}
