package com.shuwei.dai.chiyouplusanalyzeserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Knife4jConfiguration {

    @Bean(value = "dockerBean")
    public Docket dockerBean() {
        //指定使用Swagger2规范
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        //描述字段支持Markdown语法
                        .description("# Analyze模块")
                        .termsOfServiceUrl("https://doc.xiaominfo.com/")
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("analyze-server")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.shuwei.dai.chiyouplusanalyzeserver.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}