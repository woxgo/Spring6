package com.py.spring6.bean;

/**
 * @Description: 这是一个Bean，封装了用户的信息。Spring 可以帮助我们创建User对象吗？
 * @Package: com.py.spring6.bean
 * @ClassName: User
 *
 * @Author: PengYang
 * @Date: 2023/10/28 11:09 AM
 * @Version: v1.0
 **/
public class User {
    //spring是怎么实例化对象的？
    //默认情况下spring会通过反射机制，调用类的无参构造方法来实例化对象。
    //实现原理如下：
    // Class clazz = Class.forName("com.py.spring6.bean.User");
    // Object obj = clazz.newInstance();
    public User() {
        System.out.println("User 的无参构造方法执行了");
    }

    public User(String name) {
        System.out.println("User 的有参构造方法执行了");
    }
}
