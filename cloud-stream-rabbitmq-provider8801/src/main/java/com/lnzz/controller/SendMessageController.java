package com.lnzz.controller;

import com.lnzz.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName：SendMessageController
 *
 * @Author 冷暖自知
 * @Date 2020/8/2 16:12
 * @Version 1.0
 * @Description
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }
}

