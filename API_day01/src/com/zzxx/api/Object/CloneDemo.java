package com.zzxx.api.Object;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ZiClone zi = new ZiClone();
        zi.setName("lucy");
        ZiClone clone = (ZiClone)zi.clone();

        ZiClone clone2 = zi; // 引用的赋值 -> 浅克隆

        // 默认的clone方法, 是复制一份全新的, 属性内容一致的对象 -> 深克隆
        System.out.println(clone.getName());
        System.out.println(zi == clone);
    }
}
