package com.py.factory;

/**
 * 消费者
 * @author PengYang
 * @version 1.0
 * */
public class Main {
    /**
     * 工厂方法模式的优点：
     * ●
     * 一个调用者想创建一个对象，只要知道其名称就可以了。
     * ●
     * 扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
     * ●
     * 屏蔽产品的具体实现，调用者只关心产品的接口。
     * 工厂方法模式的缺点：
     * ●
     * 每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
     */
    public static void main(String[] args) {

        WeaponFactory daggerFactory = new DaggerFactory();
        WeaponFactory gunFactory = new GunFactory();

        Weapon dagger = daggerFactory.getWeapon();
        Weapon gun = gunFactory.getWeapon();

        dagger.attack();
        gun.attack();
    }
}
