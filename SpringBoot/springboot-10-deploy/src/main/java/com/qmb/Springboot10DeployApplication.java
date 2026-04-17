package com.qmb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//SpringBoot 打war包的注意事项：
// 1.继承SpringBootServletInitializer重写configure,把启动类字节码文件放进去
// 2.pom中改<packaging>war</packaging>
// 3.改tomcat的scope为provided
@SpringBootApplication
public class Springboot10DeployApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Springboot10DeployApplication.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Springboot10DeployApplication.class);
    }
}
