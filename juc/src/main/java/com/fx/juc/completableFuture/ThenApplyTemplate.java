package com.fx.juc.completableFuture;

import com.fx.juc.threadpoolexecutor.ThreadPoolExecutorUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Function;
import java.util.function.Supplier;

public class ThenApplyTemplate {

    public static ThreadPoolExecutor threadPoolExecutor = ThreadPoolExecutorUtils.getThreadPoolExecutor();


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThenApplyTemplate template = new ThenApplyTemplate();
        template.thenApply();

    }

    public void thenApply() throws ExecutionException, InterruptedException {
//        CompletableFuture<Long> completableFuture0 = CompletableFuture.supplyAsync(new Supplier<Long>() {
//            @Override
//            public Long get() {
//                return null;
//            }
//        }, threadPoolExecutor);

        CompletableFuture<Long> completableFuture = CompletableFuture.supplyAsync(() -> {
            return "null";
        }, threadPoolExecutor).thenApply(new Function<String, Long>() {
            @Override
            public Long apply(String s) {
                if (s.equals("null")) {
                    return 2L;
                }
                return 1L;
            }
        });
        System.out.println("result = " + completableFuture.get());
    }


}
