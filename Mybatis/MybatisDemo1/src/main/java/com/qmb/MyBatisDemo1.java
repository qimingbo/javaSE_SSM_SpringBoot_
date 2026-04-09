package com.qmb;

import com.qmb.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisDemo1 {
    @Test
    public void testDemo1() throws IOException {
       // 1，加载Mybatis的核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取sqlSession对象，用来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 3.执行sql
        List<User> users = sqlSession.selectList("selectAll");
        System.out.println(users);
        // 4.释放资源
        sqlSession.close();
    }
}
