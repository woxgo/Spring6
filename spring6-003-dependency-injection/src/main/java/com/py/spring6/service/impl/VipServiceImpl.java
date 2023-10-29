package com.py.spring6.service.impl;

import com.py.spring6.dao.VipDao;
import com.py.spring6.service.VipService;

public class VipServiceImpl implements VipService {

    private VipDao vipDao;
    /**
     *
     */
    @Override
    public void saveVip() {
        vipDao.insert();
    }

    public VipDao getVipDao() {
        return vipDao;
    }

    public void setAbc(VipDao vipDao) {
        this.vipDao = vipDao;
    }
}
