package com.zzxx.b_supplier;

import java.util.function.Supplier;

public class Demo02Test {
    /**
     * 传入一个数组, 获得数组的最大值并返回
     * 还要使用Supplier这个接口
     */
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {98, 23, 16, 34, 72};
        int m = getMax(() -> {
            int max = 0;
            for(int i : arr) {
                if (max < i) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(m);
    }
}
