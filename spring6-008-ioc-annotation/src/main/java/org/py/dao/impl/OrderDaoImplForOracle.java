package org.py.dao.impl;

import org.py.dao.OrderDao;

/**
 * @author PengYang
 * @version 1.0
 * @className OrderDaoImplForOracle
 * @since 1.0
 **/
//@Repository("orderDaoImplForOracle")
public class OrderDaoImplForOracle implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Oracle数据库正在保存订单信息...");
    }
}
