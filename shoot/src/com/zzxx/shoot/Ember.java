package com.zzxx.shoot;

import java.awt.image.BufferedImage;

/**
 * 灰烬 飞机被打掉以后的残影
 */
public class Ember {
	private BufferedImage[] images;
	private int index;
	private BufferedImage img;
	private int interval = 10, i; // 用来控制图片切换频率
	private int x, y;

	// 根据死亡的飞行物构造 灰烬对象
	public Ember(FlyingObject object) {
		images = object.ember;
		img = object.getImg();
		x = object.getX();
		y = object.getY();
		index = 0;
		i = 0;
	}

	public boolean burnDown() {
		i++;
		if (i % interval == 0) {
			if (index == images.length) {
				return true;
			}
			img = images[index++];
		}
		return false;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public BufferedImage getImg() {
		return img;
	}
}
