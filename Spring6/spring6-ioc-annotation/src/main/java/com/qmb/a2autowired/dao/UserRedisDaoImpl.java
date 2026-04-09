package com.qmb.a2autowired.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserRedisDaoImpl implements UserDao{
    @Override
    public void addUser() {
        System.out.println("UserRedisDaoImpl.....");
    }
}
