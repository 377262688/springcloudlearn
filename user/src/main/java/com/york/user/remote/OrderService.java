package com.york.user.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author york
 * @create 2020-07-29 15:41
 **/
@FeignClient(name = "order")
public interface OrderService {

    @GetMapping("order/getOrder")
    Object getOrder();
}
