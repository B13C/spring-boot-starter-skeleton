package com.geoxus.app;

import com.brt.EnableGeoxus;
import com.brt.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableGeoxus
public class AppApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AppApplication.class, args);
        HelloService bean = context.getBean(HelloService.class);
        System.out.println(bean.sayHello("欢迎您"));
    }
}
