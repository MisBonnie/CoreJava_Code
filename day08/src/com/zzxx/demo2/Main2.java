package com.zzxx.demo2;

/*
    多态的表现方面: 成员方法的调用
    最终调用的是哪个方法:优先调用子类重写过的,
            子类中如果没有重写, 就调用父类的方法
 */
public class Main2 {
    public static void main(String[] args) {
        Fu f = new Zi();
        f.m1();
        // m3没有在Fu中声明, 所以不能直接调用
//        f.m3();
        // 如果想用子类自己的方法, 需要强制转换
        Zi zi = (Zi) f;
        zi.m3();
    }
}
