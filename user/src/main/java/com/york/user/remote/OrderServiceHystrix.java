package com.york.user.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author york
 * @create 2020-07-29 18:07
 **/
@Component
public class OrderServiceHystrix implements OrderService {
    private static Logger logger = LoggerFactory.getLogger(OrderServiceHystrix.class);
    @Override
    public Object getOrder() {
        logger.info("进入失败处理");
        return null;
    }
}
