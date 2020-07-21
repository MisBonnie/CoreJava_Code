package com.zzxx.condition;

import java.util.Scanner;

public class Demo01If {
    // if 分支结构
    public static void main(String[] args) {
        // 控制台输入数值 - JDK提供的类库
        Scanner console = new Scanner(System.in);

        // 如果你考满分，就给你买遥控汽车
        int score = console.nextInt();
        if (score == 100) {
            System.out.println("遥控汽车买到了!");
            System.out.println("再买个电池!");
        }
    }
}