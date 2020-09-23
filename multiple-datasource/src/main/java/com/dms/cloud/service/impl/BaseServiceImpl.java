package com.dms.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dms.cloud.common.mybatis.base.mapper.SuperMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

/**
 * @author: zyf
 * @date: 2018/12/24 12:49
 * @desc: 父类service
 */
public abstract class BaseServiceImpl<M extends SuperMapper<T>, T> extends ServiceImpl<M, T> {

    @Autowired
    public ApplicationContext applicationContext;


}
