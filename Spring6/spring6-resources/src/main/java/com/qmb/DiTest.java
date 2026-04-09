package com.qmb;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStreamReader;

public class DiTest {
    @Test
    public void testDemo1() throws IOException {
        System.out.println("当前工作目录: " + System.getProperty("user.dir"));
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Resource r1 = context.getResource("file:../resource.txt");
        InputStreamReader isr = new InputStreamReader(r1.getInputStream());
        char[] read = new char[1024*2];
        int len;
        if ((len = isr.read(read)) != -1) {
            for (int i = 0; i < len; i++) {
                System.out.print(read[i]);
            }
        }
        System.out.println(r1.getFilename());
    }

    @Test
    public void testDemo2() throws IOException {
        // 当前工作目录在字母块中，如果是main函数是在根目录中
        System.out.println("当前工作目录: " + System.getProperty("user.dir"));
        ApplicationContext context = new FileSystemXmlApplicationContext();
        Resource r1 = context.getResource("../resource.txt");
        InputStreamReader isr = new InputStreamReader(r1.getInputStream());
        char[] read = new char[1024*2];
        int len;
        if ((len = isr.read(read)) != -1) {
            for (int i = 0; i < len; i++) {
                System.out.print(read[i]);
            }
        }
        System.out.println(r1.getFilename());
    }

    // 测试ResourceLoaderAware接口
    @Test
    public void testDemo3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        TestResourceLoaderAware testResourceLoaderAware = context.getBean("testResourceLoaderAware", TestResourceLoaderAware.class);
        System.out.println(context == testResourceLoaderAware.getResourceLoader());
    }

    // 测试ResourceLoaderAware接口
    @Test
    public void testDemo4() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        ResourceBean resourceBean = context.getBean("resourceBean", ResourceBean.class);
        resourceBean.res();

    }
}
