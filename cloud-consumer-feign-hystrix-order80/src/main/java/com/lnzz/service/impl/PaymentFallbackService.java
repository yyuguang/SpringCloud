package com.lnzz.service.impl;

import com.lnzz.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * ClassName：PaymentFallbackService
 *
 * @Author 冷暖自知
 * @Date 2020/7/25 23:28
 * @Version 1.0
 * @Description
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "---- PaymentFallbackService fall back - paymentInfo_OK ---";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "---- PaymentFallbackService fall back - paymentInfo_Timeout ---";
    }
}
