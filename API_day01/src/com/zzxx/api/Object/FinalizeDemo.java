package com.zzxx.api.Object;

public class FinalizeDemo {
    public static void main(String[] args) {
        ZiFinalize zi = new ZiFinalize();
        zi = null;

        System.gc(); // 手动调用垃圾回收方法
        // new ZiFinalize()对象被回收, 自动调用finalize方法
    }
}
