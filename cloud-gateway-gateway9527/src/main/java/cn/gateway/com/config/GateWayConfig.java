package cn.gateway.com.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GateWayConfig
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/15 0015 12:43
 * @Version 1.0
 */
@Configuration
public class GateWayConfig {

    /**
     * 配置一个id为route-name的路由规则，
     * 当访问地址http://localhost:9527/guonei时会自动转发到地址：http://news.baidu.com/guonei
     *
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("test1", r -> r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .route("test2", r -> r.path("/guoji").uri("http://news.baidu.com/guoji"));
        return routes.build();
    }
}
