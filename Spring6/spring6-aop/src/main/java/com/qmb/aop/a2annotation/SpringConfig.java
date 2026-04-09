package com.qmb.aop.a2annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.qmb.aop")
public class SpringConfig {
    // 也可以在xml中配置
}
