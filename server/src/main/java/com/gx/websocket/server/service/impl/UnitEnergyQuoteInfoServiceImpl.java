package com.gx.websocket.server.service.impl;

import com.gx.websocket.server.entity.UnitEnergyQuoteInfo;
import com.gx.websocket.server.mapper.UnitEnergyQuoteInfoMapper;
import com.gx.websocket.server.service.UnitEnergyQuoteInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 机组能量报价表 服务实现类
 *
 * @author qingbo
 * @date 2019-10-11
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UnitEnergyQuoteInfoServiceImpl extends BaseServiceImpl<UnitEnergyQuoteInfoMapper, UnitEnergyQuoteInfo> implements UnitEnergyQuoteInfoService {

}
