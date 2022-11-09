package com.example.ecr2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ecr2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ecr2Application.class, args);
    }

}
