package com.zzxx.a_properties;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DemoProperties {
    @Test
    public void test01() throws IOException {
        // 1.创建属性集对象
        Properties pro = new Properties();
        // "root" "root"
        // 2.通过流加载属性集
        /*String path = DemoProperties.class.getClassLoader().getResource("config.properties").getPath();
        pro.load(new FileInputStream(path));*/
        InputStream is = DemoProperties.class.getClassLoader().getResourceAsStream("config.properties");
        pro.load(is);

        // 3.获得属性集中的value值
        String name = pro.getProperty("name");
        System.out.println(name);

        // 4.直接给属性集设置属性
        pro.setProperty("url", "http://www.baidu.com");

        String url = pro.getProperty("url");
        System.out.println(url);

        String username = pro.getProperty("username");
        System.out.println(username);
        /*username = new String(username.getBytes("ISO8859-1"), "UTF-8");
        System.out.println(username);*/
    }
}
