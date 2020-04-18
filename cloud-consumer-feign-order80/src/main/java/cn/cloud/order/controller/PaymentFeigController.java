package cn.cloud.order.controller;

import cn.cloud.common.entity.CommonResult;
import cn.cloud.common.entity.Payment;
import cn.cloud.order.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName PaymentFeigController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/10 0010 14:42
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentFeigController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
    @GetMapping(value = "/consumer/payment/timeout")
    public String timeOut(){
       return paymentFeignService.timeOut();
    }
}
