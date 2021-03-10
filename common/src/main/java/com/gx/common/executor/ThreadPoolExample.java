package com.gx.common.executor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author guoxun
 */
public class ThreadPoolExample {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        ExecutorService executorService1 = Executors.newCachedThreadPool();


        Integer i1 = 1;
        Integer i2 = 1;

        Integer i3 = new Integer(1);

        Integer i4 = 128;
        Integer i5 = 128;

        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i4 == i5);

        String s1 = "s";
        String s2 = "s";
        String s3 = new String("s");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        Map map = new HashMap<String, Object>();


    }

}
