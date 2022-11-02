package com.shuwei.dai.chiyouplusfinanceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shuwei.dai")
public class ChiyouPlusFinanceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChiyouPlusFinanceApplication.class, args);
    }
}
