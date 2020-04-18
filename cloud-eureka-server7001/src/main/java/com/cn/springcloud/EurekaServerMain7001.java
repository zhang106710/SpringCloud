package com.cn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaServerMain
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/1 0001 22:34
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer     //代表服务注册中心
public class EurekaServerMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMain7001.class,args);
    }
}
