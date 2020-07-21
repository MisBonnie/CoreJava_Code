package com.zzxx.homework;

import java.util.Arrays;
import java.util.Random;

public class DoubleBall {
    /**
     *  5个 1~33 的随机数
     *  数组排序
     *  1个 1~16 的随机数
     *  添加到数组末尾
     */
    public static void main(String[] args) {
        // 0.创建一个随机数对象
        Random ran = new Random();
        // 1.定义一个数组, 用来存储5个红球
        int[] red = new int[5];
        // 2.生成 5个 1~33 的随机数, 并且存入数组
        for (int i = 0; i < red.length; i++) {
            red[i] = ran.nextInt(33) + 1;
            // 判断重复
            for (int j = 0; j < i; j++) {
                if (red[i] == red[j]) {
                    i--;
                    break;
                }
            }
        }
        // 3.给红球数组排序
        Arrays.sort(red);
        // 4.生成1个 1~16 的随机数
        int blue = ran.nextInt(16) + 1;
        // 5.red数组扩容1位, 将蓝色球, 加到red数组的末尾
        int[] ball = new int[red.length + 1];
        System.arraycopy(red, 0, ball, 0, red.length);
        ball[ball.length - 1] = blue;

        System.out.println(Arrays.toString(ball));
    }
}
