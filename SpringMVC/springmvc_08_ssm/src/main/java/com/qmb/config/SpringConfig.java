package com.qmb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.qmb.service")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
