package com.lnzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName：PaymentMain9002
 *
 * @Author 冷暖自知
 * @Date 2020/8/10 20:59
 * @Version 1.0
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class, args);
    }
}


