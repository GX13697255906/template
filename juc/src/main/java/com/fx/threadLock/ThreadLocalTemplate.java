package com.fx.threadLock;

import com.fx.juc.threadpoolexecutor.ThreadPoolExecutorUtils;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author xun.guo
 */
public class ThreadLocalTemplate {

    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public void threadLocalDemo() {
        ThreadPoolExecutor threadPoolExecutor = ThreadPoolExecutorUtils.getThreadPoolExecutor();
        for (int i = 0; i < 3; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {

                    threadLocal.set(Thread.currentThread().getName());
                    System.out.println(threadLocal.get());
                }
            });
        }
    }

    public static void main(String[] args) {
        ThreadLocalTemplate template = new ThreadLocalTemplate();
        template.threadLocalDemo();
        System.out.println(ThreadLocalTemplate.threadLocal.get());

    }


}
