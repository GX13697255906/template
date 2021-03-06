package com.gx.websocket.server.service.impl;

import com.gx.websocket.server.entity.UnitQuoteInfo;
import com.gx.websocket.server.mapper.UnitQuoteInfoMapper;
import com.gx.websocket.server.service.UnitQuoteInfoService;
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
