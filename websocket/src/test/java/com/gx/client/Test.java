package com.gx.client;

public class Test {

    public static void main(String[] args) {

        String date = "2020-05-13 00:00";

        System.out.println(date.substring(0, 10));
        System.out.println(date.substring(11, 16).replace(":", ""));

    }

}
