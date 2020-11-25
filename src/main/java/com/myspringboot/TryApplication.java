package com.myspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.myspringboot.mapper")
public class TryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TryApplication.class, args);
    }

}
