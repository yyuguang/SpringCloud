package com.lnzz.service.service.impl;

import com.lnzz.dao.PaymentDao;
import com.lnzz.entity.Payment;
import com.lnzz.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName：PaymentImpl
 *
 * @Author 冷暖自知
 * @Date 2020/7/13 22:41
 * @Version 1.0
 * @Description
 */
@Service
public class PaymentImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
