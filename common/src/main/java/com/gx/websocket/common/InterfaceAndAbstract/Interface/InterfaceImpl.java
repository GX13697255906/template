package com.gx.websocket.common.InterfaceAndAbstract.Interface;

import java.util.List;

public class InterfaceImpl implements InterfaceService<String> {

    @Override
    public void print3(List list) {
        list.add(1);
    }
}
