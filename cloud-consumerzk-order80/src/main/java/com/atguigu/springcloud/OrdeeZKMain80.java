package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author
 * @create 2020-11-06 14:52
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrdeeZKMain80 {


    public static void main(String[] args) {
        SpringApplication.run(OrdeeZKMain80.class,args);
    }

}
