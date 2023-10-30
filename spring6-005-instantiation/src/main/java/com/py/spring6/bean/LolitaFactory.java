package com.py.spring6.bean;

/**
 * 工厂方法 - 具体产品工厂
 * @version 1.0
 * @author PeengYang
 * */
public class LolitaFactory {

    public Lolita get(){
        return new Lolita();
    }
}
