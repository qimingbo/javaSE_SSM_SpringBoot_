package com.qmb.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.security.PublicKey;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class DiTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 添加、修改、删除
    @Test
    public void testDemo1()
    {
        // 添加
//        String sql = "insert into t_emp values(null,?,?,?)";
//        int result = jdbcTemplate.update(sql, "王五", 25, "男");
//        System.out.println(result);
        // 修改
//        String sql = "update t_emp set name = ? where id = ?";
//        int result = jdbcTemplate.update(sql, "张三1", 1);
//        System.out.println(result);
        // 删除
//        String sql = "delete from t_emp where id = ?";
//        int result = jdbcTemplate.update(sql, 3);
//        System.out.println(result);
    }

    // 查询 返回对象
    @Test
    public void testDemo2() {
        String sql = "select * from t_emp where id=?";
        // 自己实现接口
//        Emp employee = jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
//            Emp emp = new Emp();
//            emp.setId(rs.getInt("id"));
//            emp.setName(rs.getString("name"));
//            emp.setAge(rs.getInt("age"));
//            emp.setSex(rs.getString("sex"));
//            return emp;
//        }, 1);
        // 使用封装好的
        Emp employee = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(employee);
    }

    // 查询 返回集合
    @Test
    public void testDemo3() {
        String sql = "select * from t_emp";
        List<Emp> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(query);
    }

    // 查询 返回数字
    @Test
    public void testDemo4() {
        String sql = "select count(id) from t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }

    }
