package com.qmb.spring.iocxml.a6jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {
    // 测试引用外部配置文件中的属性
    @Test
    public void testDemo1()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-jdbc.xml");
        DruidDataSource dds = context.getBean(DruidDataSource.class);
        System.out.println(dds.getUrl());
    }

}
