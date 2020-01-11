package com.xhl.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.xhl.entity.Sys_user2;
import com.xhl.mapper.IUserMapper;
import com.xhl.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * @Author:xianghuilan
 * @Date:2020-1-7上午 9:19
 */
public class UserServiceImpl extends ServiceImpl<IUserMapper, Sys_user2> implements IUserService {
     @Autowired
    private IUserMapper userMapper;

    @Override
    public int getss() {
//        userMapper
        return 0;
    }

    @Override
    public List<Sys_user2> findAll() {
        return   userMapper.selectList(null);
    }
}
