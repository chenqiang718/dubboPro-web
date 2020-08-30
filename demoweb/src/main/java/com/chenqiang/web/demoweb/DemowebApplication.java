package com.chenqiang.web.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring/*.xml")
public class DemowebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemowebApplication.class, args);
    }

}
