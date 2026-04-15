package com.qmb.springboot04test;

import com.qmb.service.UserService;
// junit5的Test
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
// junit5 只需要写一个@SpringBootTest，该注解内部使用了@ExtendWith({SpringExtension.class})，和原生junit5是一样的。
@SpringBootTest
public class Springboot04TestApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void testUserService()
    {
        userService.selectAll();
    }
}
