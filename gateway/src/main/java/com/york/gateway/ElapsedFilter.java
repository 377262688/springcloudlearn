package com.york.gateway;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 自定义过滤器，收集请求时间
 *
 * @author york
 * @create 2020-07-28 16:30
 **/
public class ElapsedFilter implements GatewayFilter, Ordered {

    private static final Log log = LogFactory.getLog(GatewayFilter.class);
    private static final String ELAPSED_TIME_BEGIN = "elapsedTimeBegin";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        Long startTime = System.currentTimeMillis();
        log.info(startTime);
        Mono<Void> mono = chain.filter(exchange);
        Long endTime = System.currentTimeMillis();
        log.info(endTime);
        log.info("耗时：" + (endTime - startTime) + "ms");
        return mono;
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
