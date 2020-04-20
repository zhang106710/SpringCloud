package cn.sentinel.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.apache.commons.lang3.ThreadUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName FlowLimitController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/20 0020 12:11
 * @Version 1.0
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
//        try {
//
//            Thread.sleep(800);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "--------testA";
    }
    @GetMapping("/testB")
    public String testB(){
        return "--------testB";
    }

    @GetMapping("/testD")
    public String testD(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
        }
        return "--------testB";
    }
    @GetMapping("/testlim")
    @SentinelResource(value = "testlim",blockHandler = "testLim_bk")
    public String testLim(@RequestParam(required = false) String a,
                          @RequestParam(required =false)String b){
        return "--->testLim";
    }
    public String testLim_bk(@RequestParam(required = false) String a,
                          @RequestParam(required =false)String b){
        return "--->testLim_bk:(┬＿┬)";
    }
}
