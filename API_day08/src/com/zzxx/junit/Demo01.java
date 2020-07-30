package com.zzxx.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo01 {
    @Before  // 在所有@Test之前执行的
    public void before() {
        System.out.println("hello Junit!");
    }
    @After // 在所有@Test之后执行的
    public void after() {
        System.out.println("bye Junit!");
    }
    @Test // 取代主方法的
    public void method01() {
        System.out.println("hello method1");
    }

    @Test
    public void method2() {
        System.out.println("hello method2");
    }
    @Test
    public void method03() {
        System.out.println("hello method3");
    }
    @Test
    public void method04() {
        System.out.println("hello method4");
    }
}
