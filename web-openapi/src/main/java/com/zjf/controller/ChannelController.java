package com.zjf.controller;

import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.constant.ChannelEnum;
import com.zjf.channel.base.method.bean.request.BaseRequest;
import com.zjf.channel.base.method.bean.request.CreateRequest;
import com.zjf.channel.base.method.bean.response.BaseResponse;
import com.zjf.channel.base.method.bean.response.CreateResponse;
import com.zjf.channel.base.service.IChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

@RestController
public class ChannelController {

    @Autowired
    private List<IChannelService> serviceList;


    /**
     * 测试请使用这个报文，只有wechat渠道的create方法实现了。
     * {
     * "channel":"wechat"
     * }
     *
     * @param createRequest
     */
    @PostMapping("/channel")
    public CreateResponse create(@RequestBody @Validated CreateRequest createRequest) {
        // 1、首先校验参数中的渠道是否属于渠道枚举类
        ChannelEnum channelEnum = ChannelEnum.valueOf(createRequest.getChannel());

        // 2、找到channelService调用接口
        for (IChannelService iChannelService : serviceList) {
            if (iChannelService.getChannelEnum() == channelEnum) {
                return iChannelService.create(createRequest, null);
            }
        }

        return null;
    }

    @PostMapping("/channel2")
    public CreateResponse create2(@RequestBody @Validated CreateRequest createRequest) {
        return execute(createRequest, cservice -> cservice::create);
    }


    private <Req extends BaseRequest, Res extends BaseResponse> Res execute(Req req, Function<IChannelService,
            BiFunction<Req, BaseConfig, Res>> function) {

        ChannelEnum channelEnum = ChannelEnum.valueOf(req.getChannel());
        IChannelService channelService = null;

        for (IChannelService iChannelService : serviceList) {
            if (iChannelService.getChannelEnum() == channelEnum) {
                channelService = iChannelService;
            }
        }

        return function.apply(channelService).apply(req, null);
    }
}
