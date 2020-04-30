package com.gx.common.ThreadPoolExecutorTemplate;

public class CustomRunnable implements Runnable{

    private String threadName;
    private int sleepTime;

    public CustomRunnable(String threadName, int sleepTime){
        this.threadName = threadName;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(sleepTime);
            System.out.println("ThreadName = "+threadName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
