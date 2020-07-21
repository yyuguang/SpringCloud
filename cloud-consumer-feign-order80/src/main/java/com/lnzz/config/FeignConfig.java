package com.lnzz.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName：FeignConfig
 *
 * @Author 冷暖自知
 * @Date 2020/7/21 21:58
 * @Version 1.0
 * @Description
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
