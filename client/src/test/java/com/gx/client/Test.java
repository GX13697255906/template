package com.gx.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list.stream().distinct().collect(Collectors.toList()).size());

    }

}
