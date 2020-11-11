package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

/**
 * @author
 * @create 2020-11-09 10:52
 */
@Configuration
public class FeignConfig {

    @Bean
    feign.Logger.Level feignLoggerLevel(){
        return feign.Logger.Level.FULL;
    }
}
