package com.lnzz.service;

import com.lnzz.entity.Payment;
import com.lnzz.utils.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName：PaymentFeignService
 *
 * @Author 冷暖自知
 * @Date 2020/7/21 20:56
 * @Version 1.0
 * @Description
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    /**
     * 根据ID获取payment
     *
     * @param id
     * @return
     */
    @GetMapping("/payment/getPaymentById/{id}")
    public JsonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    /**
     * 超时控制
     *
     * @return
     */
    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout();
}
