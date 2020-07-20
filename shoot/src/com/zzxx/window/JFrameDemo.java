package com.zzxx.window;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.*;

public class JFrameDemo {
    public static void main(String[] args) {
//        Arrays.toString(new int[]{});
//        Scanner console = new Scanner(System.in);
        // 空参构造方法 -> 创建一个原始的很小的窗口
        JFrame window = new JFrame();
        window.setTitle("飞机大战");
        // 有参构造方法 -> 参数:窗口标题
//        JFrame window = new JFrame("飞机大战");
        // 设置窗口大小
        window.setSize(400, 650);
        // 设置窗口的默认关闭选项 0~3
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口居中
        window.setLocationRelativeTo(null);
        // 设置置顶
        window.setAlwaysOnTop(true);
        // 设置窗口没有外边框
        window.setUndecorated(true);
        // 显示窗口
        window.setVisible(true);
    }
}
