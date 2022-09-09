package com.shuwei.dai.chiyouplusadminserver.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: mybatis-plus分页配置
 * @author: daiyifan
 * @create: 2022/9/9 18:59
 */
@Configuration
public class mybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
