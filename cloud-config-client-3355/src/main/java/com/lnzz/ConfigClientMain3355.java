package com.lnzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ClassName：ConfigClientMain3355
 *
 * @Author 冷暖自知
 * @Date 2020/7/28 22:37
 * @Version 1.0
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class,args);
    }
}

