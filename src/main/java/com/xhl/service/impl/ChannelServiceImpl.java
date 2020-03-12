package com.xhl.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhl.entity.Channel;
import com.xhl.mapper.ChannelMapper;
import com.xhl.service.ChannelService;
import org.springframework.stereotype.Service;

/**
 * @Author:xianghuilan
 * @Date:2020/02/1813:28
 */
@Service
public class ChannelServiceImpl extends ServiceImpl<ChannelMapper, Channel> implements ChannelService{
}
