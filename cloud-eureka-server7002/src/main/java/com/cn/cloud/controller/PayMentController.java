package com.cn.cloud.controller;


import cn.cloud.common.entity.CommonResult;
import cn.cloud.common.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName PayMentController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/31 0031 23:01
 * @Version 1.0
 */
@RestController
@Slf4j
public class PayMentController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/payment/get")
    public String getPaymentById(){
        return "springcloud with consul："+port+"\t"+ UUID.randomUUID().toString();

    }

}
