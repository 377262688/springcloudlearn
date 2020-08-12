package com.york.weibo.controller;

import com.york.weibo.dto.RO.SendWeiBlogRO;
import com.york.weibo.service.WeiBlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    private Logger logger = LoggerFactory.getLogger(WeiBlogController.class);
    @Autowired
    WeiBlogService weiBlogService;
    @PostMapping("sendWeiBlog")
    public Long sendWeiBlog(@RequestBody SendWeiBlogRO sendWeiBlogRO) {
        logger.info("发送微博{}",sendWeiBlogRO);
        Long id = weiBlogService.sendWeiBlog(0L,sendWeiBlogRO);
        return id;
    }
}
