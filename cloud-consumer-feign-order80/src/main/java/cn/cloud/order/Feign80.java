package cn.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName Feign80
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/10 0010 14:37
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class Feign80 {
    public static void main(String[] args) {
        SpringApplication.run(Feign80.class,args);
    }
}
