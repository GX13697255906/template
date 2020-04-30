package com.gx.common.ThreadPoolExecutorTemplate;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTemplate {
    //  该线程池中核心线程数最大值
    public static int coreThreadSize = 8;
    //  该线程池中线程总数最大值
    public static int maxThreadSize = 20;
    //  该线程池中非核心线程闲置超时时长
    public static int keepAliveTime = 5000;

    public ThreadPoolExecutor threadPoolExecutor;


    public void init() {
        threadPoolExecutor = new ThreadPoolExecutor(coreThreadSize, maxThreadSize, keepAliveTime, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
    }

    public void test(String threadName, int time) {
        threadPoolExecutor.execute(new CustomRunnable(threadName, time));
    }

    public static void main(String[] args) {
        ThreadPoolExecutorTemplate template = new ThreadPoolExecutorTemplate();
        template.init();
        template.test("A", 2000);
        template.test("B", 1500);
        template.test("C", 1000);
        template.test("D", 500);
        template.test("E", 500);


    }

}
