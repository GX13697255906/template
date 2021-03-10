package com.gx.websocket.common.singleton;

public class SingleTonLanHan {

    private  SingleTonLanHan(){}

    private static SingleTonLanHan singleTon;

    public static SingleTonLanHan getInstance(){
        if(null == singleTon){
            singleTon = new SingleTonLanHan();
        }
        return singleTon;
    }

}
