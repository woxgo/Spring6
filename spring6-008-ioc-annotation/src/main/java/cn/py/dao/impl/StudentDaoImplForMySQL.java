package cn.py.dao.impl;

import cn.py.dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * @author PengYang
 * @version 1.0
 * @className StudentDaoImplForMySQL
 * @since 1.0
 **/
//@Repository("studentDaoImplForMySQL")
@Repository("studentDao1")
public class StudentDaoImplForMySQL implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("mysql数据库正在删除学生信息");
    }
}
