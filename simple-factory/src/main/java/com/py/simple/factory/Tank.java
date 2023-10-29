package com.py.simple.factory;

/**
 * 简单工厂模式 - 具体产品
 * @author PengYang
 * @version 1.0
 * */
public class Tank extends Weapon{

    /**
     * 武器进行攻击的方法
     */
    @Override
    public void attack() {
        System.out.println("坦克开炮...");
    }
}
