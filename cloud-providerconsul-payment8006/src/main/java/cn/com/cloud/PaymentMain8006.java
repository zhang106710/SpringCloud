package cn.com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentMain8004
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/2 0002 22:15
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于想使用consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8006  {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class,args);
    }
}
