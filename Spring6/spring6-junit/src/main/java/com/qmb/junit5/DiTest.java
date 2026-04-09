package com.qmb.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//两种方式均可
//方式一
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:bean1.xml")
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = SpringConfig.class)
//方式二
//@SpringJUnitConfig(locations = "classpath:bean1.xml")
//@SpringJUnitConfig(classes = SpringConfig.class)
public class DiTest {
    @Autowired
    private User user;

    @Test
    public void testUser(){
        System.out.println(user);
    }
}
