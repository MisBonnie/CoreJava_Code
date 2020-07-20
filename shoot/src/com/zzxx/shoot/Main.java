package com.zzxx.shoot;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimerTask;

public class Main extends JPanel {
    public static BufferedImage hero0;
    public static BufferedImage hero1;
    public static BufferedImage bee;
    public static BufferedImage bullet;
    public static BufferedImage airplane;
    public static BufferedImage bigplane;
    static {
        // 一次性读取图片
        try {
            hero0 = ImageIO.read(Main.class.getResourceAsStream("pic/hero0.png"));
            hero1 = ImageIO.read(Main.class.getResourceAsStream("pic/hero1.png"));
            bee = ImageIO.read(Main.class.getResourceAsStream("pic/bee.png"));
            bullet = ImageIO.read(Main.class.getResourceAsStream("pic/bullet.png"));
            airplane = ImageIO.read(Main.class.getResourceAsStream("pic/airplane.png"));
            bigplane = ImageIO.read(Main.class.getResourceAsStream("pic/bigplane.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // 定义所有的飞行物对象 - 包括小蜜蜂\敌机\大敌机
    private ArrayList<FlyingObject> flyings;
    // 定义一个存放所有子弹的列表对象
    private ArrayList<Bullet> bullets;
    // 新增新的数组, 来存放所有的灰烬对象
    private ArrayList<Ember> embers;
    // 固定的四种游戏状态
    public final int START = 0;
    public final int RUNNING = 1;
    public final int PAUSE = 2;
    public final int GAME_OVER = 3;
    // 定义当前的游戏状态
    private int state = START;

    public Main() {
        flyings = new ArrayList<>();
        bullets = new ArrayList<>();
    }
    /*
    游戏开始的方法, 定时且重复的代码 -> 定时器
     */
    // import javax.swing.*;
    private java.util.Timer timer = new java.util.Timer();
    public void action() {
        // TimerTask -> 要重复执行的代码
        // long -> 定时器什么时候开始 (ms)
        // long -> 时间 间隔
        timer.schedule(new TimerTask(){
            public void run() {
                // 游戏状态的判断
                // 1.生成新的飞行物
                creatFlyingObject();
                // 2.飞行物移动
                flyingObjectStep();
                // 3.判断飞行物越界
                outOfBoundsAction();
                hero.move();
                // 4.发射子弹
                shootAction();
                // 5.子弹移动
                bulletStep();
                // 6.判断子弹和飞行物相撞
                bangAction();
                // 7.判断飞行物和英雄机相撞
                shootByAction();
                // 8.添加灰烬移动的方法
                emberAction();

                repaint(); // 重画 -> 重新调用paint方法
            }
        },100, 10);
        MouseAdapter adapter = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // 判断游戏状态, 然后改变游戏状态
                if (state == START) {
                    state = RUNNING;
                } else if (state == GAME_OVER) {
                    state = START;
                }
            }
            public void mouseEntered(MouseEvent e) {

            }
            public void mouseExited(MouseEvent e) {
            }
            public void mouseMoved(MouseEvent e) {
                // 先判断游戏状态
                // 根据鼠标的坐标,改变英雄机的坐标
                int mouse_x = e.getX();
                int mouse_y = e.getY();

                hero.setX(mouse_x - hero.getWidth()/2);
                hero.setY(mouse_y - hero.getHeight()/2);
                repaint(); // 重画
            }
        };
        // 添加鼠标监听
        this.addMouseListener(adapter);
        this.addMouseMotionListener(adapter);
    }
    // 所有的灰烬也要动作 - 即切换图片
    private void emberAction() {
        /*
         循环灰烬列表 for
         每一个灰烬调用burnDown方法
         当burnDown方法 返回true的时候,
         从灰烬列表中移除这个已经爆炸完的灰烬
         */

    }
    // 英雄机被飞行物撞击
    private void shootByAction() {
        for (int i = 0; i < flyings.size(); i++) {
            FlyingObject fly = flyings.get(i);
            if (hero.shootByFlying(fly)){
                hero.minusLife();
                flyings.remove(i);
                i--;
            }
        }
    }

    // 子弹和飞行物相撞
    private void bangAction() {
        for (int i = 0; i < bullets.size(); i++) {
            for (int j = 0; j < flyings.size(); j++) {
                Bullet b = bullets.get(i);
                FlyingObject fly = flyings.get(j);
                if (fly.shootByBullet(b)) {
                    // 碰撞上, 飞行物生命值-1, 子弹消失
                    fly.minusLife();
                    if (fly.getLife() == 0){
                        // 奖励 -> 火力加成, 生命值加成: 小蜜蜂,大敌机
                        // 分数: 小敌机, 大敌机
                        if (fly instanceof Enemy) {
                            Enemy enemy = (Enemy)fly;
                            hero.addScore(enemy.getScore());
                        }
                        if (fly instanceof Award) {
                            // 奖励: 火力加成, 生命值加成
                            Award award = (Award)fly;
                            if (award.getAwardType() == Award.ADD_LIFE)
                                hero.addLife();
                            else {
                                hero.addDoubleFire();
                            }
                        }
                        flyings.remove(j);
                        // 在此使用fly构造对应的Ember对象
                        // Ember ember = new Ember(fly);
                        // 并将创建出来的新对象加入到灰烬列表中
                        // embers.add(ember);
                    }
                    bullets.remove(i);
                    i --;
                    break;
                }
            }
        }
    }
    // 子弹移动
    private void bulletStep() {
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            b.move();
        }
    }

    // 发射子弹的方法
    private int shootIndex = 0;
    private void shootAction() {
        /*
           本身界面中存在n个子弹, 存储子弹需要用到ArrayList
           hero.shoot() - 会得到1个或者2个子弹
           ArrayList.add()
         */
        if (shootIndex++ % 30 == 0) {
            Bullet[] bs = hero.shoot();
            for (int i = 0; i < bs.length; i++) {
                bullets.add(bs[i]);
            }
        }
    }

    // 判断是否越界
    private void outOfBoundsAction() {
        for (int i = 0; i < flyings.size(); i++) {
            FlyingObject fly = flyings.get(i);
            if (fly.getY() >= Main.HEIGHT) {
                // 越界了, 就将这个飞行物移除掉
                flyings.remove(i);
                i --;
            }
        }
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            if (b.getY() <= -b.getHeight()) {
                bullets.remove(i);
                i--;
            }
        }
    }

    // 移动所有的飞行物
    private void flyingObjectStep() {
        for (int i = 0; i < flyings.size(); i++) {
            FlyingObject fly = flyings.get(i);
            fly.move();
        }
    }

    // 生成新的飞行物 (小蜜蜂,敌机,大敌机)
    private int flyingIndex = 0; // 控制生成频率
    private void creatFlyingObject() {
        flyingIndex++;
        if (flyingIndex % 40 == 0) {
            int ran = (int) (Math.random() * 20);
            FlyingObject fly ;
            if (ran == 0) {
                fly = new Bee();
            } else if (ran == 1 || ran == 2) {
                fly = new BigPlane();
            } else {
                fly = new Airplane();
            }
            flyings.add(fly);
        }

    }
    private Hero hero = new Hero();
    @Override
    public void paint(Graphics g) {
        // 清除绘画内容
        super.paint(g);
        // 画一个英雄机
        g.drawImage(hero.getImg(), hero.getX(), hero.getY(), this);
        // 画所有的小蜜蜂,敌机,大敌机 flyings
        paintFlyingObjects(g);
        // 画所有的子弹
        paintBullets(g);
        // 画状态
        // 画分数和生命值
        paintScore(g);

        // 添加画所有灰烬的方法
        paintEmber(g);
    }
    // 画所有灰烬
    private void paintEmber(Graphics g) {
        // 遍历灰烬列表, 并画出对应灰烬
    }
    // 画分数
    private void paintScore(Graphics g) {
        g.drawString("分数:" + hero.getScore(), 5, 20);
        g.drawString("生命值:" + hero.getLife(), 5, 40);
    }
    // 画所有子弹
    private void paintBullets(Graphics g) {
        for (int i = 0; i < bullets.size(); i++) {
            Bullet b = bullets.get(i);
            g.drawImage(b.getImg(), b.getX(), b.getY(), this);
        }
    }
    // 画所有飞行物
    private void paintFlyingObjects(Graphics g) {
        for (int i = 0; i < flyings.size(); i++) {
            FlyingObject fly = flyings.get(i);
            g.drawImage(fly.getImg(), fly.getX(), fly.getY(), this);
        }
    }
    public static final int WIDTH = 400;
    public static final int HEIGHT = 650;
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(WIDTH, HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 调用父类的无参构造器, 调用Main的无参构造器
        Main panel = new Main();
        window.add(panel);
        // 尽快调用paint方法
        window.setVisible(true);

        // 调用游戏开始的方法
        panel.action();

        // 添加鼠标事件
        // this.addMouseListener();

    }
}
