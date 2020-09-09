package com.gx.server;

import cn.hutool.core.date.DateUtil;

public class Test {

    public static void main(String[] args) {

        String disclosureTime = "20191118_114015";
        String parse = DateUtil.format(DateUtil.parse(disclosureTime.substring(9, 15), "HHmmss"), "HH:mm:ss");
        System.out.println(parse);

    }

}
//
//    private static String numberComplement(Integer number) {
//        return number < 10 ? "0" + number.toString() : number.toString();
//    }
//
//    public static void main(String[] args) {
//
//        Map<String, Integer> map = new TreeMap<>();
//        for(int i = 0;i<24;i++){
//            String hour = numberComplement(i)+ ":";
//            String hour0 = hour+"00";
//            String hour15 = hour+15;
//            String hour30 = hour+30;
//            String hour45 = hour+45;
//            map.put(hour0, i);
//            map.put(hour15, i);
//            map.put(hour30, i);
//            map.put(hour45, i);
//        }
//
//
//        UnitEnergyQuoteInfo unitEnergyQuoteInfo = new UnitEnergyQuoteInfo();
//
//        try {
//            Field field = UnitEnergyQuoteInfo.class.getDeclaredField("powerPlantCode");
//            field.setAccessible(true);
//            System.out.println(   (field.get(unitEnergyQuoteInfo) == null?0D:(Double)field.get(unitEnergyQuoteInfo)) + 1    );
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("===============================");
//
//        Double d1 = 1D;
//
//        Double d2 = NumberUtil.add(null, 1).doubleValue();
//
////        Double d3 = NumberUtil.div(null, 2, 2).doubleValue();
//
//
//        System.out.println("d2 = " + d2);
//
//
//        List<Double> list = new ArrayList<>();
//        list.add(0D);
//        list.add(1D);
//        list.add(2D);
//        list.add(3D);
//        list.add(4D);
//        list.add(5D);
//
//        System.out.println(list.subList(1,3));
//        list.removeAll(Collections.singleton(null));
//        System.out.println(list.stream().collect(Collectors.averagingDouble(Double::doubleValue)));
//        System.out.println(list.stream().collect(Collectors.maxBy(Double::compareTo)).get());
//
//
//
//
//
//
//    }
//
//
//}
