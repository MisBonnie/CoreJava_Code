package com.zzxx.api.Object;

public class ToStringDemo {
    public static void main(String[] args) {
        ZiToString zi = new ZiToString("张三", 28);
        // com.zzxx.api.Object.ZiToString@5fe5c6f
        System.out.println(zi);
        System.out.println(zi + "");
        System.out.println(zi.toString());

        // 想要打印对象时, 显示对象的属性内容 -- 重写toString方法
        System.out.println(zi);


        String str = "haha";
        // java.lang.String@abdcef
        System.out.println(str);

        System.out.println(str.hashCode());
    }
}
