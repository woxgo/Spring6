package com.py.spring6.service.impl;

import com.py.spring6.service.OrderService;
import com.py.spring6.dao.OrderDao;

public class OrderServiceImpl implements OrderService {

    OrderDao dao;
    /**
     *
     */
    @Override
    public void order() {
        dao.insert();
    }

    public OrderDao getDao() {
        return dao;
    }

    public void setAaa(OrderDao dao) {
        this.dao = dao;
    }
}
