package com.zzxx.shoot;

import com.zzxx.Award;

import java.awt.image.BufferedImage;

public class XXLPlane extends FlyingObject implements Enemy, Award {
    protected XXLPlane(int x, int y, BufferedImage img, int life) {
        super(x, y, img, life);
    }

    @Override
    public int getAwardType() {
        return 0;
    }

    @Override
    public int getScore() {
        return 0;
    }

    @Override
    public void move() {

    }
}
