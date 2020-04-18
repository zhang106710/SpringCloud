package cn.client.cloud.controler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClientController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/16 0016 15:03
 * @Version 1.0
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${confg.info}")
    private String configInfo;  //要访问的3344上的信息

    @GetMapping("/configInfo")	//请求地址
    public String getConfigInfo(){
        return configInfo;
    }

}
