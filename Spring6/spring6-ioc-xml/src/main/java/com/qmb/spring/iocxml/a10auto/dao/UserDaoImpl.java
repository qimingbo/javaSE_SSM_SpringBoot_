package com.qmb.spring.iocxml.a10auto.dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void addUser() {
        System.out.println("UserDao执行了");
    }
}
