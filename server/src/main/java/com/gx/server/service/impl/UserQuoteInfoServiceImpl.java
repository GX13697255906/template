package com.gx.server.service.impl;

import com.gx.server.entity.UserQuoteInfo;
import com.gx.server.mapper.UserQuoteInfoMapper;
import com.gx.server.service.UserQuoteInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户侧报价信息表 服务实现类
 *
 * @author tianshuai
 * @date 2019-10-11
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserQuoteInfoServiceImpl extends BaseServiceImpl<UserQuoteInfoMapper, UserQuoteInfo> implements UserQuoteInfoService {

}
