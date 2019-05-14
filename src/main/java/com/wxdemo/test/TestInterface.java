package com.wxdemo.test;

public abstract class TestInterface {

    public int a = 1;

    public void method1() {
        System.out.println("abstract method1");
    }

    public void method2(){
        System.out.println("abstract method2");
    }

    public abstract void method3();
}
