package com.york.weibo.service;

import com.york.weibo.dto.RO.SendWeiBlogRO;
import com.york.weibo.entity.WeiBlog;
import org.springframework.stereotype.Service;

/**
 * @author york
 * @create 2020-08-12 15:24
 **/
@Service
public class WeiBlogService {

    public void sendWeiBlog(Long userId,SendWeiBlogRO ro) {
        WeiBlog weiBlog = new WeiBlog();
        weiBlog.setUserId(userId);
        weiBlog.setContent(ro.getContent());

    }
}
