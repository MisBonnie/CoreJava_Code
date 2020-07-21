package com.zzxx.api.Object;

import java.util.Objects;

public class EqualsDemo {
    public static void main(String[] args) {
        ZiEquals zi1 = new ZiEquals("张三", 18);
        ZiEquals zi2 = new ZiEquals("张三", 18);

        boolean b = zi1.equals(zi2);
        System.out.println(b);

        /**
         * 1.先判断空值
         * 2.再调用对象的equals方法比较 zi1.equals(zi2)
         */
        boolean b2 = Objects.equals(zi1, zi2);
        System.out.println(b2);
    }
}
