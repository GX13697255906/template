package com.gx.common.singleton;

public class SingleDoubleCheck {

    private static volatile SingleDoubleCheck singleDoubleCheck = null;

    private SingleDoubleCheck() {
    }

    /**
     * 双重检查  防止多线程访问中第一个singleDoubleCheck == null 后有多个线程创建实例  但是仍会出现线程安全问题
     * 因此需要在 private static SingleDoubleCheck singleDoubleCheck = null; 添加volatile关键字
     *
     * jdk1.5之前没有volatile关键字
     * @return
     */
    private static SingleDoubleCheck getInstance() {
        if (singleDoubleCheck == null) {
            synchronized (SingleDoubleCheck.class) {
                if (singleDoubleCheck == null) {
                    singleDoubleCheck = new SingleDoubleCheck();
                }
            }
        }
        return singleDoubleCheck;
    }

}
