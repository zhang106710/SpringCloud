package cn.center.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ConfigCenterMain3344
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/16 0016 14:13
 * @Version 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class  ConfigClientMain3344{
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3344.class,args);
    }
}
