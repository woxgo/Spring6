package cn.py.dao.impl;

import cn.py.dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * @author PengYang
 * @version 1.0
 * @className StudentDaoImplForOracle
 * @since 1.0
 **/
@Repository("studentDao")
public class StudentDaoImplForOracle implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("oracle正在删除student。。。。");
    }
}
