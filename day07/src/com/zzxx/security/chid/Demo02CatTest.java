package com.zzxx.security.chid;

import com.zzxx.security.Cat;

public class Demo02CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("a_public: " + cat.a_public);
        // 没有任何关系的不同包的其他类中, 只能访问到public的成员
//        System.out.println("b_protected: " + cat.b_protected);
//        System.out.println("c_default: " + cat.c_default);
//        System.out.println("d_private: " + cat.d_private);
    }
}
