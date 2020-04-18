package cn.com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName CloudApplication
 * @Description  支付项目启动类
 * @Author Administrator
 * @Date 2020/3/31 0031 22:26
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PayMentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayMentApplication.class,args);
    }
}

