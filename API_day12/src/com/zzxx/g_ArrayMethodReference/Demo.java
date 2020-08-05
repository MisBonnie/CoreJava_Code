package com.zzxx.g_ArrayMethodReference;

public class Demo {
    public static int[] builder(int n, ArrayBuilder arrBuild) {
        return arrBuild.builderArray(n);
    }

    public static void main(String[] args) {
//        int[] array = builder(10, n -> new int[n]);
        int[] array = builder(10, int[]::new);
        System.out.println(array.length);
    }
}
