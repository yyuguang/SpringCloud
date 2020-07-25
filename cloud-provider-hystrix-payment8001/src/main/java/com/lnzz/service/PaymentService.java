package com.lnzz.service;

/**
 * ClassName：PaymentService
 *
 * @Author 冷暖自知
 * @Date 2020/7/22 21:05
 * @Version 1.0
 * @Description
 */
public interface PaymentService {
    /**
     * 正常访问一切ok
     *
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id);

    /**
     * 超时
     *
     * @param id
     * @return
     */
    public String paymentInfo_Timeout(Integer id);

    /**
     * @param id
     * @return
     */
    public String paymentInfo_TimeOutHandler(Integer id);
}
