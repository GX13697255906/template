package com.dms.cloud.service.impl;

import com.dms.cloud.biz306.client.model.entity.UserQuoteInfo;
import com.dms.cloud.mapper.UserQuoteInfoMapper;
import com.dms.cloud.service.UserQuoteInfoService;
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
