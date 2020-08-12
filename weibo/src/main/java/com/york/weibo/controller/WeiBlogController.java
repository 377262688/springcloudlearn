package com.york.weibo.controller;

import com.york.weibo.dto.RO.SendWeiBlogRO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author york
 * @create 2020-08-12 15:21
 **/
@RestController
@RequestMapping("weiBlog")
public class WeiBlogController {


    @PostMapping("sendWeiBlog")
    public void sendWeiBlog(@RequestBody SendWeiBlogRO sendWeiBlogRO) {

    }
}
