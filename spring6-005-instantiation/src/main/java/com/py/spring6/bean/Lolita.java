package com.py.spring6.bean;

/**
 * 工厂方法 - 具体产品
 * @version 1.0
 * @author PengYang
 * */
public class Lolita {
    public Lolita() {
        System.out.println(this.getClass().getSimpleName() + "构造方法执行了");
    }
}
