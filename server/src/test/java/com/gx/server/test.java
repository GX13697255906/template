package com.gx.server;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.NumberUtil;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Date;

public class test {

    public static void main(String[] args) {

//        System.out.println(DateUtil.format(new Date(), "yyyy-MM"));
//
//        String date = "2020-02";
//
//        System.out.println(DateUtil.format(DateUtil.parse(date, "yyyy-MM"), "yyyy-MM"));
//
//        System.out.println("Str".equals(null));
//
//
//        System.out.println(DateUtil.now());
//        System.out.println(DateUtil.parseDate(DateUtil.now()));
//
//        date = DateUtil.format(DateUtil.parse(date, "yyyy-MM-dd"), "yyyy-MM");
//        System.out.println(date);

        Double powerOutput  = 0D;
        double deviation = powerOutput == 0 ? 0 : NumberUtil.div(2 - powerOutput, powerOutput * 0.01D, 2);
        System.out.println(NumberUtil.round(powerOutput, 2));
        System.out.println(deviation);



    }

}
