package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author
 * @create 2020-11-05 10:51
 */
@Configuration
public class ApplcationContextConfig {

    @Bean
   // @LoadBalanced //负载均衡
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }
}
