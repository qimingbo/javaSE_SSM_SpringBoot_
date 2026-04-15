package com.qmb.service.impl;

import com.qmb.dao.UserDao;
import com.qmb.entity.User;
import com.qmb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> selectAll() {
        System.out.println("selectAll.....");
        return userDao.selectAll();
    }
}
