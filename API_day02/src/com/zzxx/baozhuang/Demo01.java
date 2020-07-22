package com.zzxx.baozhuang;

public class Demo01 {

    public static void main(String[] args) {
        // 1.基本数据类型和包装类型之间可以直接转换
        int i = 1;
        // 2.包装类型比基本数据类型多表示一个null值
        Integer i1 = 2; // null
        // 3.包装类型除了可以直接赋值, 还可以new对象
        i1 = new Integer(2);
        System.out.println(i++);
        System.out.println(i1++);
        // 1.1 int -> Integer 隐藏了自动装箱的操作
        i1 = i; // 等同于: i1 = Integer.valueOf(i);
        // 1.2 Integer -> int 隐藏了自动拆箱的操作
        i = i1; // 等同于: i = i1.intValue();
        // 4.字符串 可以转换成 包装类型
        Integer i3 = Integer.valueOf("12");
        // 将字符串 转换成基本数据类型
        int i4 = Integer.parseInt("ff", 16);
        System.out.println(i3 + 1);
        System.out.println(i4 + 2);

        double d = 3.14;
        Double d1 = 3.4;
        d = d1; // d1.doubleValue()
        d1 = d; // Double.valueOf(d)

        // 5.整数类型, 类中定义了最大值和最小值字段
        System.out.println("int的最大值:" + Integer.MAX_VALUE);
        System.out.println("byte的最小值:" + Byte.MIN_VALUE);
        System.out.println("long的最大值:" + Long.MAX_VALUE);

        System.out.println(Long.MAX_VALUE/1000/60/60/24/365);
    }
}
