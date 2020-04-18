package cn.cloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyselfRule
 * @Description 自定义Ribbon 负载均衡规则
 * @Author Administrator
 * @Date 2020/4/3 0003 21:01
 * @Version 1.0
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myrule() {
        return new RandomRule();
    }
}
