package com.york.weibo.service;

import com.york.weibo.dao.WeiBlogMapper;
import com.york.weibo.dto.RO.SendWeiBlogRO;
import com.york.weibo.entity.WeiBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author york
 * @create 2020-08-12 15:24
 **/
@Service
public class WeiBlogService {
    @Autowired
    WeiBlogMapper weiBlogMapper;

    public Long sendWeiBlog(Long userId,SendWeiBlogRO ro) {
        WeiBlog weiBlog = new WeiBlog();
        weiBlog.setUserId(userId);
        weiBlog.setContent(ro.getContent());
        weiBlogMapper.insert(weiBlog);
        return weiBlog.getId();
    }
}
