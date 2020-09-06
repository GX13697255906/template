package com.dms.cloud.service.impl;

import com.dms.cloud.biz306.client.model.entity.UnitEnergyQuoteInfo;
import com.dms.cloud.mapper.UnitEnergyQuoteInfoMapper;
import com.dms.cloud.service.UnitEnergyQuoteInfoService;
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
