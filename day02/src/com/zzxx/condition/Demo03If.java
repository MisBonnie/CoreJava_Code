package com.zzxx.condition;

import java.util.Scanner;
public class Demo03If {
    // if 分支结构
    public static void main(String[] args) {
        // 给分数评级
        // 100: A+  95~100: A 90~95: A- 85~90:B+
        // ....
        Scanner console = new Scanner(System.in);

        int score = console.nextInt();
        if (score == 100) {
            System.out.println("A+");
        } else if (score >= 95) {
            System.out.println("A");
        } else if (score >= 90) {
            System.out.println("A-");
        } else if (score >= 85) {
            System.out.println("B+");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 75) {
            System.out.println("B-");
        } else {
            System.out.println("C");
        }
    }
}
