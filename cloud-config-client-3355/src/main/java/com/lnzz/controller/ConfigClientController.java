package com.lnzz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName：ConfigClientController
 *
 * @Author 冷暖自知
 * @Date 2020/7/28 22:37
 * @Version 1.0
 * @Description
 */
@RestController
@RefreshScope
public class ConfigClientController {

    /**
     * 因为config仓库以rest形式暴露，所以所有客户端都可以通过config服务端访问到github上对应的文件信息
     */
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}

