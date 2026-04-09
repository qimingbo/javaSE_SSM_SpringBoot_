package com.qmb.i18n.springi18n;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

public class DiTest {
    @Test
    public void testDemo1()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //传递动态参数，使用数组形式对应{0} {1}顺序
        Object[] objs = new Object[]{"atguigu",new Date().toString()};
        String str = context.getMessage("com.qmb", objs, Locale.CHINA);
        System.out.println(str);
    }
}
