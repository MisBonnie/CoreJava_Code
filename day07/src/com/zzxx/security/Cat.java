package com.zzxx.security;

public class Cat {
    public int a_public = 10;
    protected int b_protected = 20;
    int c_default = 30;
    private int d_private = 40;
    public Cat() {

    }
    public void method1() {
        System.out.println("a_public: " + a_public);
        System.out.println("b_protected: " + b_protected);
        System.out.println("c_default: " + c_default);
        System.out.println("d_private: " + d_private);
    }
    // 给外部获得 d_private 的方式
    public int getD_private() {
        return this.d_private;
    }
    // 给外部提供一个修改 d_private 的方式
    public void setD_private(int d) {
        this.d_private = d;
    }
}
