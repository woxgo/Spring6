package com.py.factory;

/**
 * 具体工厂
 * @version 1.0
 * @author PengYang
 * */
public class GunFactory extends WeaponFactory{
    /**
     * 获取武器产品的方法
     */
    @Override
    public Weapon getWeapon() {
        return new Gun();
    }
}
