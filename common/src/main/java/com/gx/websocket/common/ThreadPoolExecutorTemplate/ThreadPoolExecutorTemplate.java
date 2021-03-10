package com.gx.websocket.common.ThreadPoolExecutorTemplate;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTemplate {
    //  该线程池中核心线程数最大值
    public static int coreThreadSize = 4;
    //  该线程池中线程总数最大值
    public static int maxThreadSize = 10;
    //  该线程池中非核心线程闲置超时时长
    public static int keepAliveTime = 5000;

    public ThreadPoolExecutor threadPoolExecutor;

    public void init() {
        threadPoolExecutor = new ThreadPoolExecutor(coreThreadSize, maxThreadSize, keepAliveTime, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), new ThreadPoolExecutor.AbortPolicy());
    }

    public void destory() {
        threadPoolExecutor.shutdown();
    }

    public void test(String threadName, int time) {
        threadPoolExecutor.execute(new CustomRunnable(threadName, time));
    }

    public static void main(String[] args) {
        ThreadPoolExecutorTemplate template = new ThreadPoolExecutorTemplate();
        template.init();
        for (int i = 0; i < 100; i++) {
            template.test(String.valueOf(i), 2000);
        }
        template.destory();
    }

}
