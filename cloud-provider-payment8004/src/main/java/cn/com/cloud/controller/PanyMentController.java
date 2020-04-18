package cn.com.cloud.controller;

import cn.cloud.common.entity.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName PanyMentController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/2 0002 22:16
 * @Version 1.0
 */
@RestController
public class PanyMentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public CommonResult paymentzk(){
        CommonResult result =new CommonResult();
        result.setCode(200);
        result.setMessage("springcloud with zookeeper："+serverPort+"\t"+ UUID.randomUUID().toString());
        return result;
    }

}
