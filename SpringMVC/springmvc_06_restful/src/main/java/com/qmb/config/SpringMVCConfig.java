package com.qmb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.qmb.controller")
@EnableWebMvc // 功能强大，其一：能自动转json,但在springboot中无需添加,纯springmvc需要添加。
public class SpringMVCConfig {

}
