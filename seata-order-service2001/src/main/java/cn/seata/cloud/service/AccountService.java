package cn.seata.cloud.service;

import cn.seata.cloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @ClassName AccountService
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/21 0021 16:18
 * @Version 1.0
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("count") BigDecimal money);
}
