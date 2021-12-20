package com.fx.juc.callable;

import java.util.concurrent.Callable;

public class CallableTemplate implements Callable<String> {

    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName();
    }

}
