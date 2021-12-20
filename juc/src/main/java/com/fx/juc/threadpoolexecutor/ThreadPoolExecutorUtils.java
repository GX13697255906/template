package com.fx.juc.threadpoolexecutor;

import com.fx.juc.threadpoolexecutor.threadfactory.FxThreadFactory;

import java.util.concurrent.*;

/**
 * 线程池工具
 *
 * @author guoxun
 */
public class ThreadPoolExecutorUtils {

    private ThreadPoolExecutorUtils() {
    }

    /**
     * 执行周期、延迟任务线程池
     */
    private static final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(
            Runtime.getRuntime().availableProcessors(),
            new ThreadPoolExecutor.AbortPolicy());

    /**
     * 线程池
     * corePoolSize 核心线程数
     * 但若调用了allowCoreThreadTimeOut(boolean)方法，并且传入了参
     * 数true，则keepAliveTime参数所设置的Idle超时策略也将被应用于核心
     * 线程。
     */
    private static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            Runtime.getRuntime().availableProcessors(),
            2 * Runtime.getRuntime().availableProcessors() + 5,
            10,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(500),
//            new FxThreadFactory("dms_task_thread"),
            new ThreadPoolExecutor.AbortPolicy()) {
        @Override
        public boolean allowsCoreThreadTimeOut() {
            return false;
        }
    };

    public static ThreadPoolExecutor getThreadPoolExecutor() {
        return threadPoolExecutor;
    }

    public static ScheduledThreadPoolExecutor getScheduledExecutorService() {
        return scheduledThreadPoolExecutor;
    }
}
