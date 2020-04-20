package cn.nacos.cloud.service;

import cn.cloud.common.entity.CommonResult;
import cn.cloud.common.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/20 0020 18:44
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，------------PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}