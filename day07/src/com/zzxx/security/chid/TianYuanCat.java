package com.zzxx.security.chid;

import com.zzxx.security.Cat;

public class TianYuanCat extends Cat {
    public void method02() {
        System.out.println("a_public: " + a_public);
        System.out.println("b_protected: " + b_protected);
        // 不同包的父子类中, 不能访问私有的和默认的成员
//        System.out.println("c_default: " + c_default);
//        System.out.println("d_private: " + d_private);
    }
}
