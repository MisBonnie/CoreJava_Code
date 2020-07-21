package com.zzxx.array;

import java.util.Scanner;

/**
 * 数组遍历/迭代, 挨个访问
 */
public class Demo02ArrayIterator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
//            arr[i] = console.nextInt();
            arr[i] = (i+1) * 10;
            System.out.println(arr[i]);
        }

        System.out.println(arr);
        int[] arr2 = arr;
        System.out.println(arr2);
    }
}

