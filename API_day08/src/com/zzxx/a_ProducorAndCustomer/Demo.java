package com.zzxx.a_ProducorAndCustomer;

public class Demo {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        BaoZiPU pu = new BaoZiPU(baoZi);
        ChiHuo chi = new ChiHuo(baoZi, "张三");
        ChiHuo2 chi2 = new ChiHuo2(baoZi, "李四");

        pu.start();
        chi.start();
        chi2.start();
    }
}
