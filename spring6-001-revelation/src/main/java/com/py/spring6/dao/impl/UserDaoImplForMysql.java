package com.py.spring6.dao.impl;

import com.py.spring6.dao.UserDao;

public class UserDaoImplForMysql implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("Mysql正在删除用户数据...");
    }
}
