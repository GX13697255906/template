package com.gx.common.lock.reentrylock;

import javax.management.monitor.Monitor;

/**
 * @author guoxun
 * <p>
 * synchronized重入锁
 */
public class ReentryLockSynchronizedDemo extends SuperReentryLockSynchronizedDemo {

    public static void main(String[] args) {

        ReentryLockSynchronizedDemo demo = new ReentryLockSynchronizedDemo();
        demo.doSomeThing();

    }

    @Override
    public synchronized void doSomeThing() {
        System.out.println("child.doSomeThing" + Thread.currentThread().getName());
        doAnotherThing();
        System.out.println("chile.doAnotherThing" + Thread.currentThread().getName());
    }

    public synchronized void doAnotherThing() {
        super.doSomeThing();
    }

}

class SuperReentryLockSynchronizedDemo {

    Object object = new Object();
    public synchronized void doSomeThing() {
        System.out.println("father.doSomeThing" + Thread.currentThread().getName());
    }
}
