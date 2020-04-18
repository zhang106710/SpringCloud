package cn.cloud.panyment.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName PanymentService
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/10 0010 15:51
 * @Version 1.0
 */
@Service
public class PanymentService {
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_OK,id："+id+"\t"+"O(∩_∩)O哈哈~";
    }

    public String paymentInfo_Timeout(Integer id){
        int timeNumber =3;
        try{
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_Timeout,id："+id+"\t"+"O(∩_∩)O哈哈~"+"   耗时(秒)："+timeNumber;
    }

    @HystrixCommand(fallbackMethod ="panymentInfo_CircuitBreaker_back",commandProperties = {
                @HystrixProperty(name ="circuitBreaker.enabled",value = "true"),//是否开启断路器
                @HystrixProperty(name ="circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
                @HystrixProperty(name ="circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
                @HystrixProperty(name ="circuitBreaker.errorThresholdPercentage",value = "60"),//失败率
    })
    public String panymentInfo_CircuitBreaker(int id){
        if (id<0){

            throw  new RuntimeException("id不能为负数！");
        }
        UUID uuid = UUID.randomUUID();
        return Thread.currentThread().getName()+"\t"+"调用成功！ 流水号为 ："+uuid;
    }

    public String  panymentInfo_CircuitBreaker_back(int id){
        return "id 不能为负数 请稍候再试  (┬＿┬)  ";
    }
}
