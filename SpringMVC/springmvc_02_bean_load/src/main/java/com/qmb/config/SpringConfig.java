package com.qmb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.qmb.dao","com.qmb.service"})
public class SpringConfig {

}
