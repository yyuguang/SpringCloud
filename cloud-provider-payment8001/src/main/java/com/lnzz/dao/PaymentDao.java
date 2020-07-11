package com.lnzz.dao;

import com.lnzz.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName：PaymentDao
 *
 * @Author 冷暖自知
 * @Date 2020/7/11 18:56
 * @Version 1.0
 * @Description
 */
@Mapper
public interface PaymentDao {

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
    Payment getPaymentById(@Param("id") Long id);
}
