package com.york.order.dto;

/**
 * @author york
 * @create 2020-07-27 18:08
 **/
public class OrderVO {

    private Long id;

    private String orderId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
