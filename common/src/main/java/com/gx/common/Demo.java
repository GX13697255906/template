package com.gx.common;

import cn.hutool.core.util.NumberUtil;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2 = list;
        list2.add(1);
        list.add(2);
        System.out.println(list == (list2));


    }

    public void setList(List<Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
    }

}
