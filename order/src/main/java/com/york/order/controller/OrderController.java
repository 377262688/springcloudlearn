package com.york.order.controller;

import com.york.order.dto.OrderVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author york
 * @create 2020-07-27 17:57
 **/
@RequestMapping("order")
@RestController
public class OrderController {

    @GetMapping("getOrder")
    public Object getOrder() {
        OrderVO orderVO = new OrderVO();
        orderVO.setId(1L);
        orderVO.setOrderId("xxxxId");
        return orderVO;
    }
}
