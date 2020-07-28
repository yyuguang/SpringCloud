package com.lnzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * ClassName：ConfigCenterMain3344
 *
 * @Author 冷暖自知
 * @Date 2020/7/28 22:05
 * @Version 1.0
 * @Description
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344
{
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
