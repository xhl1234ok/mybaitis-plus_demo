package com.xhl.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xhl.entity.Channel;
import com.xhl.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:xianghuilan
 * @Date:2020/02/1813:15
 */
@Controller
@RequestMapping("/channel")
public class ChannelController {
    @Autowired
    private ChannelService channelService;


    @RequestMapping(value = "/qryChannelInfo", produces =
            {MediaType.APPLICATION_JSON_UTF8_VALUE, },
            method = RequestMethod.POST)
    public String qryChannelInfo(String channelNbr) {
        try {
            LambdaQueryWrapper<Channel> queryWrapper=new LambdaQueryWrapper<Channel>();
            queryWrapper.eq(Channel::getChannelNbr,channelNbr);
            Channel channel= channelService.getOne(queryWrapper);
            System.out.println(channel);
            return "ok";
        } catch (Exception e) {

        }
        return "ok";
    }
}
