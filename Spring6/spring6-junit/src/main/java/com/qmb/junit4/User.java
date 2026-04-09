package com.qmb.junit4;

import org.springframework.stereotype.Component;

@Component
public class User {
    public User() {
        System.out.println("run user");
    }
}
