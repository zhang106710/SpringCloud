package cn.cloud.panyment.controller;

import cn.cloud.panyment.service.PanymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName PanymentController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/10 0010 15:52
 * @Version 1.0
 */
@RestController
@Slf4j
public class PanymentController {
    @Resource
    private PanymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("*****result："+result);
        return result;
    }
    @HystrixCommand(fallbackMethod ="paymentInfo_TimeOutHander",commandProperties = {
            //设置这个线程的超时时间是3s，3s内是正常的业务逻辑，超过3s调用fallbackMethod指定的方法进行处理
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")})
    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        //int i = 10/0;
        String result = paymentService.paymentInfo_Timeout(id);
        log.info("*****result："+result);
        return result;
    }

    public String paymentInfo_TimeOutHander(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   系统繁忙，请稍后再试,id："+id+"\t"+"o(╥﹏╥)o";
    }
    @GetMapping("/panymey/circuit/{id}")
    public String panymentInfo_CircuitBreaker(@PathVariable("id") int id){
        String result = paymentService.panymentInfo_CircuitBreaker(id);
        log.info("***result:"+result);
        return result;
    }
}
