package com.zzxx.sort;

import java.util.Arrays;

public class Demo01ArraySort {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 7, 1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序: 比较相邻元素,小的放前面,大的放后面
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序: 每一轮找最大值放后面
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = 0; // 记录最大值坐标的
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[index]) {
                    index = j;
                }
            }
            // 交换index和length-1-i位置的值
            int temp = arr[index];
            arr[index] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
