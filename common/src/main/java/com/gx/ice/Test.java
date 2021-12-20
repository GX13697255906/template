package com.gx.ice;

/**
 * @author xun.guo
 */
public class Test {
    public static void main(String[] args) {
        int i = 1;
        i++;
        System.out.println("i="+i);
        i = i++;
        System.out.println("i="+i);
        int j = i++;
        System.out.println("i="+i);
        int k = i + ++i * i++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
    }
}
