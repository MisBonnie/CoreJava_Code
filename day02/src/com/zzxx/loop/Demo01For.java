package com.zzxx.loop;

public class Demo01For {
    public static void main(String[] args) {
        // 求1~100的和
        int sum = 0;
        int i = 1; // 循环的初始值 - 位置可以在for外面
        // i <= 100 循环的条件,可以不写,不写就是死循环
        // i++ 步长, 变化规律
        for (i = 1; i <= 10; i++) {
            // for循环体
            sum += i;
        }
        // 死循环后不能继续写代码
        System.out.println("循环结束, i的值: " + i);
        System.out.println("循环结束, sum的值: " + sum);
    }
}
