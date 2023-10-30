package com.py.spring6.bean;

/**
 * 简单工厂 - 具体产品
 * @version 1.0
 * @author PengYang
 * */
public class Star {
    public Star() {
        System.out.println(this.getClass().getSimpleName() + "构造方法执行了");
    }
}
