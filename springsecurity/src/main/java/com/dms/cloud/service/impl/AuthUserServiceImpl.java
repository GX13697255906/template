package com.dms.cloud.service.impl;

import com.dms.cloud.config.AuthorizationServiceConfig;
import com.dms.cloud.entity.AuthUserDetails;
import com.dms.cloud.entity.User;
import com.dms.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service("userDetailService")
@AutoConfigureBefore(AuthorizationServiceConfig.class)
public class AuthUserServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    public AuthUserServiceImpl() {
        System.out.println("AuthUserServiceImpl");
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.getUserByNickName(s);
        return new AuthUserDetails(
                user.getNickName(),
                user.getPassword(),
                true,
                true,
                true,
                true,
                Collections.EMPTY_LIST);
    }
}
