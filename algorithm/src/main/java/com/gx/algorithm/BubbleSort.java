package com.gx.algorithm;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        Integer[] ars = new Integer[]{45, 89, 12, 0, 32, 78, 1, 90};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.desc(ars);
        for (Integer integer : ars) {
            System.out.println(integer);
        }

    }

    //    递增排序
    public void aes(Integer[] ars) {
        for (int n = 0; n < ars.length - 1; n++) {
            for (int i = 0; i < ars.length - 1 - n; i++) {
//              比较两个数字的大小
                if (ars[i] > ars[i + 1]) {
//                将大的数字和小的数字进行交换位置
                    Integer tempValue = ars[i + 1];
                    ars[i + 1] = ars[i];
                    ars[i] = tempValue;
                }
            }
        }
    }

    //    递减排序
    public void desc(Integer[] ars) {
        for (int n = 0; n < ars.length - 1; n++) {
            for (int i = 0; i < ars.length - 1 - n; i++) {
//              比较两个数字的大小
                if (ars[i] < ars[i + 1]) {
//                将小的数字和大的数字进行交换位置
                    Integer tempValue = ars[i];
                    ars[i] = ars[i + 1];
                    ars[i + 1] = tempValue;
                }
            }
        }
    }


}
