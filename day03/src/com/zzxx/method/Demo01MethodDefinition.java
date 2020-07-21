package com.zzxx.method;

/**
 * 方法的定义/声明, 和方法的调用/使用
 */
public class Demo01MethodDefinition {
    public static void main(String[] args) {
        // 调用方法
        洗衣服();
        System.out.println("-----------");
        // 调用做饭方法, 得到一个返回值, 并且赋值给'饭'这个变量
        String 饭 = 做饭();
        System.out.println(饭);
        System.out.println("-----------");
        String b = "拖鞋";
        // 将变量b 传入方法中
        男女混合双打(b);
    }

    public static void 洗衣服() {
        System.out.println("打开洗衣机");
        System.out.println("将脏衣服塞到洗衣机里");
        System.out.println("关上洗衣机");
        System.out.println("倒入洗衣液");
        System.out.println("打开开关");
        System.out.println("全自动洗衣机");
        System.out.println("打开洗衣机");
        System.out.println("取出衣服");
        System.out.println("晾衣服");
        return;
    }

    /**
     * 返回值: 方法调用者可以得到的结果
     */
    public static String 做饭() {
        System.out.println("开油烟机");
        System.out.println("开煤气灶");
        System.out.println("切菜");
        System.out.println("开始炒饭");
        System.out.println("倒调料");
        System.out.println("盛出饭");

        // return 将返回值返回给调用者
        return "蛋炒饭";
    }

    /**
     * 参数: 调用方法的时候, 需要提供什么数据
     *      在方法中, 可以将参数作为已知量直接使用
     */
    public static void 男女混合双打(String 工具) {
        System.out.println("骂一阵");
        System.out.println("抄起" + 工具);
        System.out.println("满屋追着打");
        System.out.println("结束了, 喘口气");
    }

}
