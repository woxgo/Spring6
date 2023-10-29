package com.py.simple.factory;

/**
 * 简单工厂模式 - 工厂类
 * @author PengYang
 * @version 1.0
 * */
public class WeaponFactory {

    /**
     * 根据不同的武器类型生产武器
     * @param weaponType 武器类型
     * @return 武器对象
     */
    public static Weapon getWeapon(String weaponName){

        switch(weaponName){
            case "Tank":
                return new Tank();
            case "Fighter":
                return new Fighter();
            case "Dagger":
                return new Dagger();
        }

        return null;
    }
}
