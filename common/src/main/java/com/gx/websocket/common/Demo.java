package com.gx.websocket.common;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
public class Demo {

    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        list.add(null);
        list.add(1D);
        System.out.println(list.stream().collect(Collectors.summingDouble(Double::doubleValue)));


        List<User> userList = new ArrayList<>();
        User user = new Demo().new User();
        user.setHour(1);
        user.setUnitType(1);
        user.setIndexValue(null);
        userList.add(user);

        Stream<User> stream = userList.parallelStream().filter(e -> e.getIndexValue() != null && e.getUnitType() == 1);
        System.out.println(stream.collect(Collectors.toList()));

//        Stream<User> stream1 = userList.parallelStream().filter(e ->e.getUnitType() != null &&  1 != e.getUnitType() && e.getIndexValue() != null);
//        System.out.println(stream1.collect(Collectors.toList()));
//

    }

    static boolean isEmpty(Stream<?> stream) {
        Boolean result = false;

        try {
            stream.collect(Collectors.toList());
        } catch (Exception e) {
            result = true;
        }
        return result;
    }

    class User {

        private Integer hour;

        private Double indexValue;

        private Integer unitType;

        public Double getIndexValue() {
            return indexValue;
        }

        public void setIndexValue(Double indexValue) {
            this.indexValue = indexValue;
        }

        public Integer getUnitType() {
            return unitType;
        }

        public void setUnitType(Integer unitType) {
            this.unitType = unitType;
        }

        public Integer getHour() {
            return hour;
        }

        public void setHour(Integer hour) {
            this.hour = hour;
        }
    }

    public void setList(List<Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

}
