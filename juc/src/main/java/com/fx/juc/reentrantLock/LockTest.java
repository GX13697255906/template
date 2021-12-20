package com.fx.juc.reentrantLock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    //  独占锁测试
    public void tesReentrantLock() {
        final int TURNS = 1000;
        final int THREADS = 10;

        ExecutorService pool = Executors.newFixedThreadPool(THREADS);
        Lock lock = new ReentrantLock();
        CountDownLatch countDownLatch = new CountDownLatch(THREADS);
        long start = System.currentTimeMillis();
        for (int i = 0; i < THREADS; i++) {
            pool.submit(() -> {
                try {
                    for (int j = 0; j < TURNS; j++) {
                        IncrementData.lockAndFastIncrease(lock);
                    }
                    System.out.println("本线程执行累加完成");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        float time = (System.currentTimeMillis() - start) / 1000F;
        System.out.println("运行的时长为" + time);
        System.out.println("累加结果为" + IncrementData.sum);

    }

    public static void main(String[] args) {
        LockTest test = new LockTest();
        test.tesReentrantLock();
    }

}
