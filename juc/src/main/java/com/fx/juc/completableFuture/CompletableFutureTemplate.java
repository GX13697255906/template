package com.fx.juc.completableFuture;

import com.fx.juc.threadpoolexecutor.ThreadPoolExecutorUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

public class CompletableFutureTemplate {

    public ThreadPoolExecutor threadPoolExecutor = null;
    public CompletableFuture<Integer> completableFuture = null;

    public CompletableFutureTemplate() {
        threadPoolExecutor = ThreadPoolExecutorUtils.getThreadPoolExecutor();
        completableFuture = new CompletableFuture<>();

    }

    public void test() throws ExecutionException, InterruptedException {
        completableFuture = CompletableFuture.supplyAsync(() -> {
            return 1;
        }, threadPoolExecutor);
        int result = completableFuture.get();
        System.out.println("result = " + result);
    }


    public static void main(String[] args) {

    }


}
