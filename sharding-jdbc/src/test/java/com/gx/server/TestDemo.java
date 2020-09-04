//package com.gx.server;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.gx.server.entity.UnitEnergyQuoteInfo;
//import com.gx.server.service.UnitEnergyQuoteInfoService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//import java.util.function.ToDoubleFunction;
//import java.util.stream.Collector;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TestDemo {
//
//    @Autowired
//    private UnitEnergyQuoteInfoService unitEnergyQuoteInfoService;
//
//    @Test
//    public void lambda_01(){
//
//        QueryWrapper<UnitEnergyQuoteInfo> queryWrapper = new QueryWrapper<>();
//        queryWrapper.lambda().eq(UnitEnergyQuoteInfo::getStatus,0 )
//                .eq(UnitEnergyQuoteInfo::getScopeDate, "2020-05-13");
//
//        List<UnitEnergyQuoteInfo> list = unitEnergyQuoteInfoService.list(queryWrapper);
//
//        Double unitAvePrice = list.stream().collect(unitAvePrice(e->e.getSegmentBid(), e->e.getSegmentTerminalCapacity(), e->e.getSegmentInitialCapacity()));
//
//        System.out.println(unitAvePrice);
//
//
//    }
//
//    static <T> Collector<T, ?, Double> unitAvePrice(ToDoubleFunction<T> priceFunction,
//                                                    ToDoubleFunction<T> terminalCapacity,
//                                                    ToDoubleFunction<T> initialCapacity) {
//        class Box {
//            double num = 0;
//            double denom = 0;
//        }
//        return Collector.of(Box::new, (b, e) -> {
//            b.num += priceFunction.applyAsDouble(e) * (terminalCapacity.applyAsDouble(e) - initialCapacity.applyAsDouble(e));
//            b.denom += (terminalCapacity.applyAsDouble(e) - initialCapacity.applyAsDouble(e));
//        }, (b1, b2) -> {
//            b1.num += b2.num;
//            b1.denom += b2.denom;
//            return b1;
//        }, b -> b.num / b.denom);
//    }
//
//}
