package com.py.spring6.service.impl;

import com.py.spring6.dao.UserDao;
import com.py.spring6.dao.impl.UserDaoImplForMysql;
import com.py.spring6.dao.impl.UserDaoImplForOracle;
import com.py.spring6.service.UserService;

public class UserServiceImpl implements UserService {
    // private UserDao userDao = new UserDaoImplForMysql();
    //修改为
    private UserDao userDao = new UserDaoImplForOracle();
    @Override
    public void deleteUser() {
        userDao.deleteById();
    }
}
