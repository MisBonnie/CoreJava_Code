package com.zzxx.api2;

import java.util.Arrays;

public class Demo04Arrays {
    public static void main(String[] args) {
        int[] a = {8, 3, 1, 7, 2};
        // 在原来的数组上直接修改排序 - 升序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // 字典顺序
        String[] ss = {"lucy","tom","jack","rose"};
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));
    }
}
