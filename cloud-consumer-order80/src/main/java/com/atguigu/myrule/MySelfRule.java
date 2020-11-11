package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @create 2020-11-06 18:03
 */
@Configuration
public class MySelfRule {


    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }
}
