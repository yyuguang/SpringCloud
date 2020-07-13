package com.lnzz.service;


import com.lnzz.entity.Payment;

/**
 * ClassName：PaymentService
 *
 * @Author 冷暖自知
 * @Date 2020/7/13 22:41
 * @Version 1.0
 * @Description
 */
public interface PaymentService {

    /**
     * 新增
     *
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据id获取
     *
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
