package com.york.order.controller;

import com.york.order.dto.OrderVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author york
 * @create 2020-07-27 17:57
 **/
@RequestMapping("order")
@RestController
public class OrderController {

    private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @GetMapping("getOrder")
    public Object getOrder() {
        logger.info("获取订单{}",System.currentTimeMillis());
        OrderVO orderVO = new OrderVO();
        orderVO.setId(1L);
        orderVO.setOrderId("xxxxId");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return orderVO;
    }
}
