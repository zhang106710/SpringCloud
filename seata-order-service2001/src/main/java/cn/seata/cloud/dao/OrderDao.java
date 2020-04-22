package cn.seata.cloud.dao;

import cn.seata.cloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/21 0021 16:20
 * @Version 1.0
 */
@Mapper
public interface OrderDao {
    //1 新建订单
    void createOrder(Order order);

    //2 修改订单状态 从0改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
