package com.shuwei.dai.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shuwei.dai")
public class ChiyouPlusScheduleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChiyouPlusScheduleApplication.class, args);
    }
}
