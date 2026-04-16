package com.qmb;

import com.entity.User;
import com.qmb.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import redis.clients.jedis.Jedis;

@SpringBootApplication
// @import的四种用法：
//@Import(UserService.class)
//@Import(UserConfig.class)
//@Import(MyImportSelector.class)
@Import(MyImportBeanDefinitionRegistrar.class)
public class Springboot06EnableApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Springboot06EnableApplication.class, args);
//        Object user = context.getBean("user");
//        System.out.println(user);


        Jedis jedis1 = (Jedis) context.getBean("jedis");
        System.out.println(jedis1.getClass());
        System.out.println(jedis1);

//        Object userService = context.getBean(UserService.class);
//        System.out.println(userService);
//
//        User user1 = context.getBean(User.class);
//        System.out.println(user1);

//        UserService userService = context.getBean(UserService.class);
//        System.out.println(userService);

        Object user1 = context.getBean("user1");
        System.out.println(user1);
    }

//    @Bean
    public Jedis jedis()
    {
        return new Jedis();
    }
}
