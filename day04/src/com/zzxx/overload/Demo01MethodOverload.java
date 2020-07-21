package com.zzxx.overload;

public class Demo01MethodOverload {
    public static void main(String[] args) {
        Demo01MethodOverload demo1 = new Demo01MethodOverload();
        // 调用方法: 需要方法名(传参)
        String s = demo1.打(2.0);
        System.out.println(s);

        demo1.打(2);

        demo1.打("伞");
    }
    // String 表示伞
    void 打(String san) {
        System.out.println("撑起来");
    }
    // int 代表车
    void 打(int 车) {
        System.out.println("打开APP");
        System.out.println("输入目的地");
        System.out.println("开始叫车");
        System.out.println("有人接单了");
        System.out.println("车来了");
        System.out.println("走起");
    }
    // double 代表糯米
    String 打(double 糯米) {
        System.out.println("不停的锤");
        return "糯米糍吧";
    }
}
