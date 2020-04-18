package cn.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @ClassName OrderAppllication
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/1 0001 21:19
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderZkApplication.class,args);
    }
}
