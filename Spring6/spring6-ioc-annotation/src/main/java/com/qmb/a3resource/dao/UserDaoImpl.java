package com.qmb.a3resource.dao;

import com.qmb.a2autowired.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("myUserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("UserDaoImpl......");
    }
}
