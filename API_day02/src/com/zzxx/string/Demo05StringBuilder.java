package com.zzxx.string;

public class Demo05StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 字符串拼接 - 末尾追加
        sb.append("haha");
        sb.append("heihei");
        System.out.println(sb); // hahaheihei
        // 在指定位置插入字符串
        sb.insert(4, "xixi");
        System.out.println(sb); // hahaxixiheihei

        // 将start 和end 中间的字符串替换成指定字符串
        sb.replace(0, 4, "hehe");
        System.out.println(sb); // hehexixiheihei

        // 删除start 到 end之间的字符串内容
        sb.delete(0, 4);
        System.out.println(sb); // xixiheihei

        // 字符串反转
        sb.reverse();
        System.out.println(sb);
        // 将StringBuilder变成String
        String str = sb.toString();
    }
}
