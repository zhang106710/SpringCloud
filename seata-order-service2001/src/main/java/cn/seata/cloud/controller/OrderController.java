package cn.seata.cloud.controller;

import cn.seata.cloud.service.OrderService;
import cn.seata.cloud.domain.CommonResult;
import cn.seata.cloud.domain.Order;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/21 0021 16:16
 * @Version 1.0
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}

