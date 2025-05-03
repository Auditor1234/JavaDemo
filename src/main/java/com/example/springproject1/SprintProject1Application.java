package com.example.springproject1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.*.mapper")
public class SprintProject1Application {

    public static void main(String[] args) {
        SpringApplication.run(SprintProject1Application.class, args);
    }

}
