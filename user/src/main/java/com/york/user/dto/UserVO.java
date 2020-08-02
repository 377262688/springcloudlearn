package com.york.user.dto;

/**
 * @author york
 * @create 2020-07-28 11:19
 **/
public class UserVO {

    private Long userId;

    private String userName;

    private Object order;

    public Object getOrder() {
        return order;
    }

    public void setOrder(Object order) {
        this.order = order;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
