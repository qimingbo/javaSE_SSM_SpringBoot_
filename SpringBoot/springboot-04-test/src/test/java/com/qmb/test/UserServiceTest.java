package com.qmb.test;

import com.qmb.Springboot04TestApplication;
import com.qmb.service.UserService;
// junit4的Test
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

// junit4的方式
@RunWith(SpringRunner.class)
// 如果当前测试类在启动类扫描的包下，可以不写class属性
@SpringBootTest(classes = Springboot04TestApplication.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testUserService()
    {
        userService.selectAll();
    }
}
