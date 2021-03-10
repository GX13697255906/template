package com.gx.common.callable;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author guoxun
 */
public class CallableExample implements Callable {

    @Override
    public Object call() throws Exception {
        Random random = new Random();
        Integer randomInteger = null;
        for (int i = 0; i < 1000; i++) {
            System.out.println("等待两秒");
            Thread.sleep(2000);
            randomInteger = random.nextInt(5);
        }
        return randomInteger;

    }

    public static void main(String[] args) {
        ExecutorService e = Executors.newCachedThreadPool();

        try {
            CallableExample example = new CallableExample();
            FutureTask task = new FutureTask(example);
            Future future = e.submit(new Thread(task));
            Thread.sleep(3000);
            boolean isCancel = future.cancel(true);
            System.out.println(isCancel);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }


    }
}
