package com.zzxx.b_supplier;

import java.util.function.Supplier;

public class Demo01 {
    /*
    为了使用Lambda表达式, 所以将Supplier作为方法参数使用
    方法的目的: 为了返回一个字符串对象
     */
    public static String getInstance(Supplier<String> sup) {
        // 调用Supplier 的get方法
        return sup.get();
    }
    public static void main(String[] args) {
        // 调用getInstance方法, 需要传递一个Supplier接口实现类
        // 又因为Supplier接口是函数式接口, 所以可以使用Lambda表达式
        String str = getInstance(() -> {
            // 这是生产字符串的过程
            return "hello";});
        System.out.println(str);
    }
}
