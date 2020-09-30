package com.gx.common.CollectionTemplate;

import com.google.common.collect.Lists;
import com.zhuozhengsoft.pageoffice.zoomseal.User;

import java.util.*;

public class CollectionTemplate {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Lists.newArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(4);
        list = Collections.unmodifiableList(list);
        list.add(6);
        Integer index = Collections.binarySearch(list, 5);
        System.out.println(list.indexOf(4));
        System.out.println(index);
        System.out.println(Collections.emptyList());
    }

}
