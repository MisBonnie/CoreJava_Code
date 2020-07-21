package com.zzxx.math;

public class Demo01Math {
    public static void main(String[] args) {
        // 求绝对值
        int abs = Math.abs(1);
        System.out.println("abs: " + abs);

        // ceil: 向上取整 -> 比现在这个数大
        double ceil = Math.ceil(-3.01);
        System.out.println("ceil: " + ceil);

        // floor: 向下取整 -> 比参数要小
        double floor = Math.floor(-3.9999999);
        System.out.println("floor: " + floor);

        // round: 四舍五入 -> 参数 + 0.5 再floor
        double round = Math.round(3.51);
        System.out.println("round: " + round);

        // sqrt: 求开方
        double sqrt = Math.sqrt(2);
        System.out.println("sqrt: " + sqrt);
    }
}
