package com.xhl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhl.entity.Sys_user2;

import java.util.List;

/**
 * @Author:xianghuilan
 * @Date:2020-1-7上午 9:17
 */
public interface IUserService extends IService<Sys_user2> {
   public int getss();
   public List<Sys_user2> findAll();
}
