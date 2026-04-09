package com.qmb.junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:bean2.xml")
@ContextConfiguration(classes = SpringConfig.class)
public class DiTest {
    @Autowired
    private User user;

    @Test
    public void testUser(){
        System.out.println(user);
    }
}
