package com.lnzz.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * ClassName：LoadBalancer
 *
 * @Author 冷暖自知
 * @Date 2020/7/19 19:38
 * @Version 1.0
 * @Description
 */
public interface LoadBalancer {
    /**
     * instances
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
