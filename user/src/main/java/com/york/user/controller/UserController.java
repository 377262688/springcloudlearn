package com.york.user.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.york.user.dto.UserVO;
import com.york.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author york
 * @create 2020-07-28 11:18
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser")
    public UserVO getUser(Long userId, HttpServletRequest request) {
        return userService.getUser(userId);
    }


}
