package com.qmb.config;

import com.qmb.controller.interceptor.MyInterceptor;
import com.qmb.controller.interceptor.MyInterceptor1;
import com.qmb.controller.interceptor.MyInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.qmb.controller")
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor myInterceptor;
    @Autowired
    private MyInterceptor1 myInterceptor1;
    @Autowired
    private MyInterceptor2 myInterceptor2;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //当访问/pages/????时候，从/pages目录下查找内容
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/books/**");
        registry.addInterceptor(myInterceptor1).addPathPatterns("/books/**");
        registry.addInterceptor(myInterceptor2).addPathPatterns("/books/**");

    }
}
