package com.zzxx.window;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class JPanelDemoImage {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        // 3.创建子类对象
        MyPanel10 p = new MyPanel10();
        // 4.将画板对象添加到窗口对象中
        window.add(p);
        window.setSize(400, 600);
        window.setVisible(true);
    }
}

// 1.自定义类, 来继承JPanel
class MyPanel10 extends JPanel {
    // 2.重写自定义绘画方法
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 以下是绘画的自定义增强
        paintAirplane(g);
    }
    // 将绘画方法拆解 - 便于维护
    private void paintAirplane(Graphics g) {
        // background.png 和 MyPanel10 同包/同文件夹
        BufferedImage img = null;
        try {
            img = ImageIO.read(
                    MyPanel10.class.getResourceAsStream
                            ("background.png"));
            // 继续读取其他图片
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 按照图片原来大小显示
        g.drawImage(img, 0, 0, this);
    }

}