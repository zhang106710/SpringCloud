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
   private static final String PAYMENT_URL = "http://CLOUD-PROVIDER-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("***service->"+service);
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            for (ServiceInstance instance : instances) {
                log.info("***"+instance.getServiceId()+"***");
                log.info("***"+instance.getHost()+"***");
                log.info("***"+instance.getPort()+"***");
                log.info("***"+instance.getUri()+"***");
            }
        }
        return this.discoveryClient;
    }

    @GetMapping("/consumer/panyment/zipkin")
    public String getZipkin(){
        return restTemplate.getForObject(PAYMENT_URL+"/panyment/zipkin",String.class);
    }
}
