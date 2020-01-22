package com.xhl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhl.entity.Sys_user2;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:xianghuilan
 * @Date:2020-1-6下午 2:23
 */
@Repository
public interface  IUserMapper extends BaseMapper<Sys_user2> {
//    public List<User> findByStrtegy()
    public Sys_user2 selectById(Serializable Id);
}
