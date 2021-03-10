package com.gx.websocket.ratelimiter.ratelimiter;

import com.google.common.util.concurrent.RateLimiter;

/**
 *
 */
public class Demo {

    public static void main(String[] args) throws Exception {

        RateLimiter rateLimiter = RateLimiter.create(5000);

        Thread.sleep(4000);
        System.out.println(rateLimiter.acquire());

        for (int i = 0; i < 10; i++) {
            boolean acquire = rateLimiter.tryAcquire();
            System.out.println("acquire = " + acquire);
        }
        System.out.println(1);


    }

}
