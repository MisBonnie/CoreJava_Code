package com.zzxx.loop;

import java.util.Scanner;

/*
    猜数字v1.0
    有猜数字游戏，其游戏规则为：程序内置一个 1 到 1000 之间的数字作为猜测的结果，
    由用户猜测此数字。-> 控制台输入 Scanner
    用户每猜测一次，由系统提示猜测结果：大了、小了或者猜对了；-> if
    直到用户猜对结果，则提示游戏结束。-> 当用户没猜对,就继续猜
    用户可以提前退出游戏，即，游戏过程中，如果用户录入数字0，则游戏终止。
 */
public class Demo04Guess {
    public static void main(String[] args) {
        // 随机生成的 1 ~ 1000 的数字
        int num = 333;
        Scanner console = new Scanner(System.in);
        // 通常初始值都会给不影响程序正常运行的数
        int a = -1;
        // 当用户没猜对,就继续猜
        while (a != num) {
            // 1.猜数字
            a = console.nextInt();
            // 1.5 判断是不是0
            if (a == 0) {
                // 提前退出循环
                break;
            }
            // 2.判断结果
            if (a < num) {
                System.out.println("太小了!");
            } else if (a > num) {
                System.out.println("太大了!");
            } else {
                System.out.println("恭喜你,猜对了!");
            }
        }
        // 伪代码
        /*while(当用户没猜对时) {
            // 1.猜数字
            int a = 用户输入的数字;
            // 2.判断大小
            if (a > num) {
                给用户提示 "太大了"
            } else if (a < num) {
                给用户提示 "太小了"
            } else {
                给用户提示 "答对了"
            }
        }*/
    }
}
