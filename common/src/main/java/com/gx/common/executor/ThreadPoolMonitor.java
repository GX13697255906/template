package com.gx.common.executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author guoxun
 * 监控线程池
 */
public class ThreadPoolMonitor {

    private static final ThreadPoolExecutor threadPoolExecutor =
            new ThreadPoolExecutor(5, 50, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(50), new ThreadPoolExecutor.AbortPolicy());

    public static ThreadPoolExecutor getThreadPoolExecutor(){
        return threadPoolExecutor;
    }

    public static void shutdown(){
//        shutdown不再接受新的线程，并执行完之前提交的线程后关闭
//        shutdownnow 直接关闭活跃的线程，并返回等待中的线程
        threadPoolExecutor.shutdown();
    }




    public static void main(String[] args) {
        threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {
                boolean flag = true;
                while (flag){
                    try {
                        Thread.sleep(2*1000);
                        flag = false;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
//         getActionCount获取正在执行任务的线程
        System.out.println(threadPoolExecutor.getActiveCount());
//        getCompletedTaskCount
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadPoolExecutor.getActiveCount());
    }



}
