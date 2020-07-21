package com.zzxx.method;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 猜字母游戏:
 * 1.生成5个随机字母 -> 字符数组
 * 2.猜字母 -> 控制台输入字符串, 转换成了字符数组
 * 3.比较两个字符数组, 得到字符正确个数, 位置正确个数
 * 4.如果没猜对, 继续重复2和3步
 */
public class Demo03GuessGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // 1.生成5个随机字母
        char[] arrChar = randomChars();
        System.out.println(Arrays.toString(arrChar));
        while (true) {
            // 2.猜字母 -> 输入字符串
            String s = console.next();
            char[] guess = parseChar(s);
            // 3.比较 arrChar 和 guess
            int[] res = compare(arrChar, guess);
            System.out.print("字母正确个数: " + res[0]);
            System.out.println(", 其中位置正确个数: " + res[1]);
            // 4.结束条件
            if (res[1] == 5) {
                break;
            }
        }
    }
    /**
     * 目的: 比较两个字符数组
     * 返回两个结果, 分别是 字母正确个数和位置正确个数
     * 两个结果放在一个变量中返回, 所以确定返回值类型是int[]
     */
    public static int[] compare(char[] answer, char[] guess) {
        int[] result = new int[2];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < guess.length; j++) {
                if (answer[i] == guess[j]) {
                    // 说明字母对了, 字母正确个数 +1
                    result[0] ++;
                    // 判断位置对不对
                    if (i == j) {
                        // 说明位置对了, 位置正确个数 +1
                        result[1] ++;
                    }
                }
            }
        }
        return result;
    }

    /**
     * 目的: 得到一个长度为5的字符数组
     * 随机的五个字母, 不重复
     */
    public static char[] randomChars() {
        char[] chars = new char[5];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (Math.random() * 26 + 'A');
            // i 的位置和 i 前面每一个位置判断一下有没有重复
            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    i--; // 让程序还在原来位置重复生成字母
                    break;
                }
            }
        }
        return chars;
    }

    /**
     * 目的: 为了将指定字符串转换成字符数组,并返回
     */
    public static char[] parseChar(String str) {
        char[] arrChar = new char[5];
        // 将字符串切割成每个字符
        for (int i = 0; i < arrChar.length; i++) {
            arrChar[i] = str.charAt(i);
        }
        return arrChar;
    }
}
