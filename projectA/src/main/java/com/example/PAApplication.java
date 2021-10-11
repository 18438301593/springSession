package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
public class PAApplication {
    public static void main(String[] args) {
        SpringApplication.run(PAApplication.class,args);
    }
}
