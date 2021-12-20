package com.fx.juc.completableFuture;

import java.util.concurrent.ExecutionException;

public class CompletableFutureTemplateTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFutureTemplate template = new CompletableFutureTemplate();
        template.test();
    }

}
