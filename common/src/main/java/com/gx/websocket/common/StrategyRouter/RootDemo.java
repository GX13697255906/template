package com.gx.websocket.common.StrategyRouter;

import cn.hutool.core.util.NumberUtil;

import java.util.ArrayList;
import java.util.List;

public class RootDemo extends AbstractStrategyRouter<String, Boolean> {

    @Override
    protected StrategyMapper<String, Boolean> registerStrategyMapper() {
        StrategyHandler_01 s01 = new StrategyHandler_01();
        return null;
    }

    public static void main(String[] args) {

        System.out.println("".length());
        System.out.println(" ".length());
        System.out.println();


        List<Double> list = new ArrayList<>();

        Double d = null;


        System.out.println(NumberUtil.round(d, 1).doubleValue());

    }

}
