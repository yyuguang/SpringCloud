package com.lnzz.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName：ApplicationContextConfig
 *
 * @Author 冷暖自知
 * @Date 2020/7/11 22:39
 * @Version 1.0
 * @Description
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced //RestTemplate负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
