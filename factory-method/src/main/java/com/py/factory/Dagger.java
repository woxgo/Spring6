package com.py.factory;

/**
 * 具体产品
 * @version 1.0
 * @author PengYang
 * */
public class Dagger extends Weapon{
    /**
     * 武器进行攻击的方法
     */
    @Override
    public void attack() {
        System.out.println("砍它丫的...");
    }
}
