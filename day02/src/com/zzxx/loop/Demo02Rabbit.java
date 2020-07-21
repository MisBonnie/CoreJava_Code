package com.zzxx.loop;

public class Demo02Rabbit {
    public static void main(String[] args) {
        int f1 = 1; // 上上个月
        int f2 = 1; // 上个月
        int sum ;
        for (int i = 3; i <= 10; i++) {
            // 当前这个月的总数,应该是前面两个月的数量和
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            System.out.println("第" + i + "个月的兔子总数是:" + sum);
        }
    }
}
