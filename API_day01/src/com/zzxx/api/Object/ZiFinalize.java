package com.zzxx.api.Object;

public class ZiFinalize {
    // JDK9开始 过时了, 不推荐使用
    protected void finalize() throws Throwable {
        System.out.println("我要走了!");
    }
}
