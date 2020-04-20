package cn.nacos.cloud.controller;

import cn.cloud.common.entity.CommonResult;
import cn.cloud.common.entity.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/20 0020 18:33
 * @Version 1.0
 */
@RestController
public class PaymentController{
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();
    static {
        hashMap.put(1L,new Payment(1L,"28adsasadsafas5d1as5fad5as31d3as0"));
        hashMap.put(2L,new Payment(2L,"4das5d5asda4dad5asda5s3dasd53das0"));
        hashMap.put(3L,new Payment(3L,"6ads65d351as3d1as53d1a53d3as13as0"));
    }

    @GetMapping("/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult(200, "from mysql ,serverPort: " + serverPort,payment);
        return result;
    }
}

