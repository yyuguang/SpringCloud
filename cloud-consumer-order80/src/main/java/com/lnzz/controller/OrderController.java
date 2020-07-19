package com.lnzz.controller;

import com.lnzz.entity.Payment;
import com.lnzz.lb.LoadBalancer;
import com.lnzz.utils.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * ClassName：OrderController
 *
 * @Author 冷暖自知
 * @Date 2020/7/11 22:37
 * @Version 1.0
 * @Description
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    public static final String PAYMENT_SRV = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancer loadBalancer;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/consumer/payment/create")
    public JsonResult<Payment> create(Payment payment) {
        log.info("调用了create方法。。。");
        return restTemplate.postForObject(PAYMENT_SRV + "/payment/create", payment, JsonResult.class);
    }

    @GetMapping("/consumer/payment/getPaymentById/{id}")
    public JsonResult<Payment> getPayment(@PathVariable("id") Long id) {
        log.info("调用了getPaymentById方法。。。");
        return restTemplate.getForObject(PAYMENT_SRV + "/payment/getPaymentById/" + id, JsonResult.class);
    }

    @GetMapping("/consumer/payment/lb")
    public String getPaymentLB() {
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (instances == null || instances.size() <= 0) {
            return null;
        }

        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri + "/payment/lb", String.class);
    }
}
