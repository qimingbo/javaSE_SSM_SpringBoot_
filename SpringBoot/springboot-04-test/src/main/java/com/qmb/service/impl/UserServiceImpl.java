package com.qmb.service.impl;

import com.qmb.entity.User;
import com.qmb.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Override
    public List<User> selectAll() {
        System.out.println("selectAll.....");
        return null;
    }
}
