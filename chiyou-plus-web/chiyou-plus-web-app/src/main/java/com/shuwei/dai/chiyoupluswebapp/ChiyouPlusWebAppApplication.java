package com.shuwei.dai.chiyoupluswebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class ChiyouPlusWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChiyouPlusWebAppApplication.class, args);
    }

}
