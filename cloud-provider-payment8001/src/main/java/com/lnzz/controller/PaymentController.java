package com.lnzz.controller;

import com.lnzz.entity.Payment;
import com.lnzz.service.PaymentService;
import com.lnzz.utils.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName：PaymentController
 *
 * @Author 冷暖自知
 * @Date 2020/7/11 19:17
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create")
    public JsonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("***插入结果{}", result);
        return result > 0 ? new JsonResult(200, "插入数据成功", result) : new JsonResult(444, "插入数据数据失败", null);
    }

    @GetMapping("/getPaymentById/{id}")
    public JsonResult getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        return result != null ? new JsonResult(200, "查询数据成功", result) : new JsonResult(444, "暂无该数据，查询ID" + id, null);
    }
}
