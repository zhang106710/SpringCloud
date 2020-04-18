package cn.com.cloud.controller;


import cn.cloud.common.entity.CommonResult;
import cn.cloud.common.entity.Payment;
import cn.com.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

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
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    //只传给前端CommonResult，不需要前端了解其他的组件
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果->："+result);
        if(result > 0){
            return new CommonResult(200,"插入数据成功.port->"+port,result);
        }else{
            return new CommonResult(444,"插入数据失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);
        if(payment != null){
            return new CommonResult(200,"查询成功,port->"+port,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID："+id,null);
        }
    }
    @GetMapping(value = "/payment/timeout")
    public String timeOut(){
        try {
            TimeUnit.SECONDS.sleep(3);
            return port;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return port;
        }
    }
}
