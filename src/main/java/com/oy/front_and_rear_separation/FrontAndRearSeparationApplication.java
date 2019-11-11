package com.oy.front_and_rear_separation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oy.front_and_rear_separation.dao")
public class FrontAndRearSeparationApplication {

    public static void main(String[] args) {
        System.out.println("启动 Spring Boot...");
        SpringApplication.run(FrontAndRearSeparationApplication.class, args);
    }

}
