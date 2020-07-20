package com.zzxx.window;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class JPanelDemo {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        // 3.创建子类对象
        MyPanel p = new MyPanel();
        // 4.将画板对象添加到窗口对象中
        window.add(p);
        window.setSize(400, 600);
        window.setVisible(true);
    }
}
// 1.自定义类, 来继承JPanel
class MyPanel extends JPanel {
    // 2.重写自定义绘画方法
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 以下是绘画的自定义增强
        // 设置 g -> 画笔 的字体属性
        Font font = new Font("Microsoft YaHei", Font.BOLD, 20);
        g.setFont(font);
        // 设置 画笔 颜色
        /*Color c = new Color(255, 0, 0);
        g.setColor(c);*/
        // 英文可译的颜色, 在Color中直接定义好了静态常量
        g.setColor(Color.BLACK);

        g.drawString("HelloWorld", 20, 50);
        paintAirplane(g);
    }
    // 将绘画方法拆解 - 便于维护
    private void paintAirplane(Graphics g) {
        BufferedImage img = null;
        // 按照图片原来大小显示
        g.drawImage(img, 100, 200, this);
        // 按照规定宽高来显示图片, 缩放
        g.drawImage(img, 100, 200, 50, 50, this);
    }

}