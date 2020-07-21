// 包的声明
package com.zzxx.condition;
// 声明类的引入
import java.util.Scanner;
// Demo05的全名: com.zzxx.condition.Demo05
public class Demo05 {
    public static void main(String[] args) {
//		java.util.Scanner console = new java.util.Scanner(System.in);
        Scanner console = new Scanner(System.in);
        int month = console.nextInt();
		// 判断每个月都多少天，输出天数
        /*if (month == 1 || month == 3 || month == 5
                || month == 7 || month == 8
                || month == 10 || month == 12) {
            System.out.println(month + "月，一共有31天");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(month + "月，一共有30天");
        } else if (month == 2) {
            System.out.println(month + "月，一共有28天");
        } else {
            System.out.println(month + "月不存在");
        }*/
        // switch后面接的是要判断的变量
        switch (month) {
            // case 后接的是要对比的值
            // case 是具有穿透性的，除非遇到break
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月，一共有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月，一共有30天");
                break;
            case 2:
                System.out.println(month + "月，一共有28天");
                break;
            default:
                System.out.println(month + "月不存在");
                break;
        }
    }
}