package com.lnzz.service;


import com.lnzz.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName：PaymentService
 *
 * @Author 冷暖自知
 * @Date 2020/7/11 19:11
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
