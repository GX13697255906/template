package com.gx.websocket.common.InterfaceAndAbstract.Abstract;

public abstract class AbstractService {

    public String name = AbstractService.class.getSimpleName();

    public void print() {
        System.out.println(name);
    }

    abstract void print01();

    abstract void  pring02();


}
