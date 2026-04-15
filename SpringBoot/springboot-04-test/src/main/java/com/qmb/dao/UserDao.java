package com.qmb.dao;

import com.qmb.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
    public List<User> selectAll();
}
