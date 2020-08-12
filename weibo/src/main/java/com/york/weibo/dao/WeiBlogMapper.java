package com.york.weibo.dao;

import com.york.weibo.entity.WeiBlog;
import org.apache.ibatis.annotations.Insert;

/**
 * @author york
 * @create 2020-08-12 15:26
 **/
public interface WeiBlogMapper {

    @Insert("insert into wei_blog (user_id,content,create_time) values (#{userId},#{content},#{createTime})")
    void insert(WeiBlog weiBlog);
}
