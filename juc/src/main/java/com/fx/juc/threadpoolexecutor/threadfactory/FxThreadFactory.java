package com.fx.juc.threadpoolexecutor.threadfactory;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * 自定义线程工厂
 */
@Slf4j
@Data
public class FxThreadFactory implements ThreadFactory {

    private String threadName;

    public FxThreadFactory(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public Thread newThread(Runnable r) {

        Executors.defaultThreadFactory();

        Thread thread = new Thread(r, threadName);
        return thread;
    }
}
