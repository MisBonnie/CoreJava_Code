package com.zzxx.exception;

// 使用自定义异常
public class Demo06 {
    public static void main(String[] args) {
        // 模拟用户登录的过程
        try {
            login("lucy", "1234");
            System.out.println("lucy欢迎你登录成功! - 页面跳转");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("页面不跳转, 重新登录");
        }
    }
    public static int login(String name, String password) throws MyException {
        // 模拟登录业务逻辑处理
        if ("lucy".equals(name) && "123".equals(password)) {
            return 0;
        } else {
            // throw 抛出异常, 等同于return 方法结束
            // 方法如果需要返回值, 相当于将异常返回
            throw new MyException("用户名/密码错误");
        }
    }
}
