package com.dms.cloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dms.cloud.entity.User;
import com.dms.cloud.mapper.UserMapper;
import com.dms.cloud.service.UserService;
import com.dms.cloud.common.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author xun.guo
 * @since 2020-11-21
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 根据登录名获取用户信息
     *
     * @param nickName
     * @return
     */
    @Override
    public User getUserByNickName(String nickName) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getNickName, nickName)
                .eq(User::getStatus, 0);
        User user = userService.getOne(queryWrapper);
        return user;
    }

    /**
     * 添加用户
     *
     * @param userName
     * @param nickName
     * @param password
     * @return
     */
    @Override
    public Boolean addUser(String userName, String nickName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setNickName(nickName);
        user.setPassword(passwordEncoder.encode(password));
        user.setUpdateTime(new Date());
        user.setCreateTime(new Date());
        user.setStatus(0);
        return userService.save(user);
    }

}
