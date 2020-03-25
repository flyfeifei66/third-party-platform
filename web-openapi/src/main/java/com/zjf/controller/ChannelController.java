package com.zjf.controller;

import com.zjf.channel.base.constant.ChannelEnum;
import com.zjf.channel.base.method.bean.request.CreateRequest;
import com.zjf.channel.base.service.IChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChannelController {

    @Autowired
    private List<IChannelService> channelService;

    @PostMapping("/channel")
    public void create(@RequestBody @Validated CreateRequest createRequest) {

        // 1、首先校验参数中的渠道是否属于渠道枚举类
        ChannelEnum channelEnum = ChannelEnum.valueOf(createRequest.getChannel());

        // 2、找到channelService调用接口
        for (IChannelService iChannelService : channelService) {
            if (iChannelService.getChannelEnum() == channelEnum) {
                iChannelService.create(createRequest,null);
            }
            break;
        }
    }


}
