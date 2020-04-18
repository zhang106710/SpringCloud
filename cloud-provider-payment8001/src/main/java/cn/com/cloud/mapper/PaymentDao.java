package cn.com.cloud.mapper;


import cn.cloud.common.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName panMent
 * @Description TODO
 * @Author Administrator
 * @Date 2020/3/31 0031 22:53
 * @Version 1.0
 */
@Mapper
public interface PaymentDao  {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
