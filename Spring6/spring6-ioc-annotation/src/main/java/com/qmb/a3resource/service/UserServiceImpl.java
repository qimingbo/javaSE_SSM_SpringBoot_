package com.qmb.a3resource.service;


import com.qmb.a2autowired.dao.UserDao;
import com.qmb.a2autowired.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("myUserService")
public class UserServiceImpl implements UserService {
    @Resource(name = "myUserDao")
    private UserDao userDao;

    @Override
    public void addUser() {
        System.out.println("UserService......");
        userDao.addUser();
    }
}
