package com.gx.algorithm;

/**
 * @author guoxun
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{45, 89, 12, 0, 32, 78, 1};

        array = InsertSort.asc(array);

        for (Integer integer : array) {
            System.out.println(integer);
        }
    }


    public static Integer[] asc(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    Integer tempValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempValue;
                }
            }
        }
        return array;
    }


    /**
     * 递减
     *
     * @return
     */
    public static Integer[] desc(Integer[] array) {

        return null;
    }

}
