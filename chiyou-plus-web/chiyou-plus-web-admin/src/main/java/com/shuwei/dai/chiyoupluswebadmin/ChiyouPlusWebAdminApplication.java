package com.shuwei.dai.chiyoupluswebadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.shuwei.dai.admin.feign", "com.shuwei.dai.collect.feign"})
public class ChiyouPlusWebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChiyouPlusWebAdminApplication.class, args);
    }

}
