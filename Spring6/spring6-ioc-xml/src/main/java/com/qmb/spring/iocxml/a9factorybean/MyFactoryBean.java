package com.qmb.spring.iocxml.a9factorybean;

import org.springframework.beans.factory.FactoryBean;

import javax.sound.midi.Soundbank;

public class MyFactoryBean  implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        System.out.println("执行这个方法");
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
