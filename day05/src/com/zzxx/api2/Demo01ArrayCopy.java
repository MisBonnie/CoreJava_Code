package com.zzxx.api2;

import java.util.Arrays;

public class Demo01ArrayCopy {
    public static void main(String[] args) {
        // 需求: 让arr变成 {1,2,3,4,5,6}
        int[] arr = {1,2,3,4,5};
        // 1.数组扩容
        int[] b = new int[arr.length+1];
        // 2.数组复制
        /*
            参数1: 要复制的数组 - 源数组
            参数2: 从要源数组的哪个位置开始复制
            参数3: 要复制到哪个数组中 - 目标数组
            参数4: 要从b数组的哪个位置开始存放值
            参数5: 要复制几个元素
         */
        System.arraycopy(arr, 0, b, 0, arr.length);
        // 3.再最后加一个6
        b[b.length - 1] = 6;
        // 4.将arr替换
        arr = b;
        System.out.println(Arrays.toString(arr));
    }
}
