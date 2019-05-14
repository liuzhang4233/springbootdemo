package com.wxdemo.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Test1 extends TestInterface {
    @Override
    public void method3() {

    }

    @Override
    public void method2() {
        super.method2();
        System.out.println("class method2");
    }
    @Autowired
    int a = 4;

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.method2();
        System.out.println(t.a);
    }
}
