package com.zzxx.api2;

import java.util.Arrays;

public class Demo02ArrayCopy2 {
    public static void main(String[] args) {
        // 需求: 让arr变成 {1,2,3,4,5,6}
        int[] arr = {1,2,3,4,5};
        // 参数1: 要复制的数组 -> 源数组
        // 参数2: 要生成的新数组的长度
        // 返回值: 生成的新数组
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = 6;
    }
}
