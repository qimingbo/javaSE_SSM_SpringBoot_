package com.qmb.spring.iocxml.a10auto.service;

import com.qmb.spring.iocxml.a10auto.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    @Override
    public void addUser() {
        System.out.println("UserService执行了");
        userDao.addUser();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
