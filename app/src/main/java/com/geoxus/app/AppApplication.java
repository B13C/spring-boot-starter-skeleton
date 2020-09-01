package com.geoxus.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class AppApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AppApplication.class, args);
        Jedis jedis = context.getBean(Jedis.class);
        System.out.println(jedis.get("name"));
    }
}
