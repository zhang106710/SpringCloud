package cn.seata.cloud.service;

import cn.seata.cloud.domain.Order;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/21 0021 16:18
 * @Version 1.0
 */
public interface OrderService {
    void create(Order order);

}
