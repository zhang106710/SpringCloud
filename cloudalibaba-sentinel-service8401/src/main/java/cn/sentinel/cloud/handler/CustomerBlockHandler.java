package cn.sentinel.cloud.handler;

import cn.cloud.common.entity.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @ClassName CustomerBlockHandler
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/20 0020 14:19
 * @Version 1.0
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException-----1");
    }
    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException-----2");
    }
}
