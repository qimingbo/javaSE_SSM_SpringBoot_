package com.qmb.a2autowired.service;


import com.qmb.a2autowired.controller.UserController;
import com.qmb.a2autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    @Qualifier("userRedisDaoImpl")
    private UserDao userDao;

    @Override
    public void addUser() {
        System.out.println("UserService......");
        userDao.addUser();
    }
}
