package com.qmb.a2autowired.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void addUser() {
        System.out.println("UserDaoImpl......");
    }
}
