package cn.cloud.order.controller;


import cn.cloud.common.entity.CommonResult;
import cn.cloud.common.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName PayMentController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/31 0031 23:01
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderController{

    @Resource
    private DiscoveryClient discoveryClient;

   /* private static final String PAYMENT_URL="http://localhost:8001";*/
   private static final String PAYMENT_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/zk", CommonResult.class);
    }


}
