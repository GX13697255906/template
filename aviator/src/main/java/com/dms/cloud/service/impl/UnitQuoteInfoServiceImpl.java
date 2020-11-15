package com.dms.cloud.service.impl;

import com.dms.cloud.entity.UnitQuoteInfo;
import com.dms.cloud.mapper.UnitQuoteInfoMapper;
import com.dms.cloud.service.UnitQuoteInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 机组启动及空载报价表 服务实现类
 *
 * @author tianshuai
 * @date 2019-10-11
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UnitQuoteInfoServiceImpl extends BaseServiceImpl<UnitQuoteInfoMapper, UnitQuoteInfo> implements UnitQuoteInfoService {

}
