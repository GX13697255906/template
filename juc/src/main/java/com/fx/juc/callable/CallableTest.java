package com.fx.juc.callable;

import com.fx.juc.threadpoolexecutor.ThreadPoolExecutorUtils;
import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author xun.guo
 */
public class CallableTest {

    @Test
    public void test() throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "futureTask";
            }
        });
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTest test  = new CallableTest();
        test.test();
        ThreadPoolExecutor threadPoolExecutor = ThreadPoolExecutorUtils.getThreadPoolExecutor();
        for (int i = 0; i < 1; i++) {
            Future<String> future = threadPoolExecutor.submit(new CallableTemplate());
            System.out.println(future.get());
        }
    }
}
