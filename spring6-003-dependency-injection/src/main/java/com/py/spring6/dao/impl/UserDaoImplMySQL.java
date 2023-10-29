package com.py.spring6.dao.impl;

import com.py.spring6.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoImplMySQL implements UserDao {

    private final Logger logger = LoggerFactory.getLogger(UserDao.class);
    /**
     *
     */
    @Override
    public void insert() {
        logger.info("调用MySQL执行插入一条用户数据");
    }
}
