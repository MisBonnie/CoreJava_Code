package com.zzxx.finalDemo;

public class Demo03FinalMethod {
    public void method_normal() {
        System.out.println("Demo03FinalMethod method_normal");
    }
    // final 最终的方法, 不能被重写了
    public final void method_final() {
        System.out.println("Demo03FinalMethod method_final");
    }

    public static void main(String[] args) {
        Demo03FinalMethod demo3 = new Demo03FinalMethod();
        demo3.method_final();
    }
}
