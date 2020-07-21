package com.zzxx.demo2;
/*
    多态表现方面: 成员变量的调用, 子父类中拥有相同的成员变量
                并且都有一对get/set方法
    如果通过引用直接调用成员变量 - f.age, 看左边类型
    通过方法调用成员变量 - f.getAge(), 看右边对象
 */
public class Main1 {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.age); // 10

        // 子类中重写了getAge()方法, 得到20
        // 子类中没有重写getAge()方法, 得到10
        System.out.println(f.getAge()); // 20

        System.out.println(f.num);
        // Fu类中没有声明score变量, 不能直接调用
//        System.out.println(f.score);
        // int a = (int)3.14;   double d = 3;
        // 向下转换类型
        Zi zi = (Zi) f;
        System.out.println(zi.score);

    }
}
