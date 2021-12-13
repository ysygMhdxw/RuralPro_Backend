package com.example.ruralrevitalization;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ruralrevitalization.dao")
public class RuralRevitalizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(RuralRevitalizationApplication.class, args);
    }

}
