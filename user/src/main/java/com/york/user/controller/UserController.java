package com.york.user.controller;

import com.york.user.dto.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("getUser")
    public Object getUser(Long userId, HttpServletRequest request) {
//        Enumeration<String> headers = request.getHeaderNames();
//        HashMap<String,String> map = new HashMap<>();
//        while (headers.hasMoreElements()) {
//            map.put(headers.nextElement(),request.getHeader(headers.nextElement()));
//        }
//        logger.info("headers:{}",map);
        logger.info("收到请求");
        UserVO userVO = new UserVO();
        userVO.setUserId(userId);
        userVO.setUserName("xxx" + userId);
        return userVO;
    }
}
