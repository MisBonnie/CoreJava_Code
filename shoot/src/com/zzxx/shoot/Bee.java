package com.zzxx.shoot;

import com.zzxx.Award;

/*
小蜜蜂类
 */
public class Bee extends FlyingObject implements Award {
    private int x_speed;
    private int y_speed;
    private int awardType;
    public Bee() {
        super((int) (Math.random() * (Main.WIDTH-Main.bee.getWidth())),
                - Main.bee.getHeight(),
                Main.bee, 1);
        x_speed = 1;
        y_speed = 2;
        awardType = (int) (Math.random() * 2);
    }

    @Override
    public void move() {
        // 先x变大, y变大,
        // x到最大值, x减小, y变大,
        setY(getY() + y_speed);
        setX(getX() + x_speed);
        // 判断x坐标的临界值
        if (getX() == Main.WIDTH - getWidth()) {
            x_speed = -1;
        } else if(getX() == 0) {
            x_speed = 1;
        }
    }

    @Override
    public int getAwardType() {
        return awardType;
    }
}
