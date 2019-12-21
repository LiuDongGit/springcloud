package com.liudong.eurekagoods.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibboConfig {


    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 自定义ribbon负载均衡策略
     * @return
     */
    @Bean
    public IRule myRule(){
        return  new RandomRule(); // 随机
//        return new RoundRobinRule(); //轮询
    }
}
