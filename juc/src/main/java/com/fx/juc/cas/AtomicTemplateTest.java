package com.fx.juc.cas;

import com.fx.juc.threadpoolexecutor.ThreadPoolExecutorUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xun.guo
 */
@Slf4j
public class AtomicTemplateTest {

    public static AtomicInteger atomicInteger = new AtomicInteger(0);

    public void atomicIntegerTest() {

        int num = 500;

        ThreadPoolExecutor threadPoolExecutor = ThreadPoolExecutorUtils.getThreadPoolExecutor();
        for (int i = 0; i < num; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    int intValue = atomicInteger.incrementAndGet();
                    log.info("intValue = {}", intValue);
                }
            });
        }
        threadPoolExecutor.shutdown();
        log.info("线程池使用完毕，关闭线程池");

    }

    public static void main(String[] args) {
        AtomicTemplateTest test = new AtomicTemplateTest();
        test.atomicIntegerTest();
    }


}
