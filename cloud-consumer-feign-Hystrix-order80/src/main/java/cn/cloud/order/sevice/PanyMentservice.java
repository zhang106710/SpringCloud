package cn.cloud.order.sevice;

import cn.cloud.order.sevice.impl.PanyMentserviceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName service
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/11 0011 14:57
 * @Version 1.0
 */
@Component
@FeignClient(value ="CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PanyMentserviceImpl.class)
public interface PanyMentservice {
    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
