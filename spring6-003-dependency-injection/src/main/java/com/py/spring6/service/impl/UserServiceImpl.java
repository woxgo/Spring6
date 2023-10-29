package com.py.spring6.service.impl;

import com.py.spring6.dao.UserDao;
import com.py.spring6.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    /**
     *
     */
    @Override
    public void saveUser() {
        userDao.insert();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
