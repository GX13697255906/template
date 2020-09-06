package com.gx.common.InterfaceAndAbstract.Interface;

import java.util.List;

public interface InterfaceService<T> {

    public String name = InterfaceService.class.getSimpleName();

    default void print() {
        System.out.println("InterfaceDomo");
    }

    static void print2() {
        System.out.println(name);
    }

    void print3(List<T> list);

}
