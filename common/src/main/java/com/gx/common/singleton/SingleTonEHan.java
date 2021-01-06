package com.gx.common.singleton;

public class SingleTonEHan {

    private static SingleTonEHan singleTon = new SingleTonEHan();

    private SingleTonEHan() {
    }

    public static SingleTonEHan getInstance() {
        return singleTon;
    }

}
