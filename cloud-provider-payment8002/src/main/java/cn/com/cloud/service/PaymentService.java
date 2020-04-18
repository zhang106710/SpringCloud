package cn.com.cloud.service;


import cn.cloud.common.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/31 0031 22:54
 * @Version 1.0
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
