package cn.cloud.order.sevice.impl;

import cn.cloud.order.sevice.PanyMentservice;
import org.springframework.stereotype.Component;

/**
 * @ClassName PanyMentserviceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/11 0011 20:09
 * @Version 1.0
 */
@Component
public class PanyMentserviceImpl implements PanyMentservice {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
