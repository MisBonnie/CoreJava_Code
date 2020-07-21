package com.zzxx.security;

public class Demo01CatTest {
    public void m1() {
        Cat cat = new Cat();
        System.out.println("a_public: " + cat.a_public);
        System.out.println("b_protected: " + cat.b_protected);
        System.out.println("c_default: " + cat.c_default);
        cat.c_default = 30;
        // 同包下不能访问私有的成员
//        System.out.println("d_private: " + cat.d_private);
        // 修改私有的成员变量 正确方式
//        cat.d_private = 30;
        cat.setD_private(30);
        // 访问私有的成员变量 正确方式
        System.out.println(cat.getD_private());
    }
}
