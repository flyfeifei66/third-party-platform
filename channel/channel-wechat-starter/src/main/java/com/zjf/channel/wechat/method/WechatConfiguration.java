package com.zjf.channel.wechat.method;

import com.zjf.channel.base.constant.ChannelEnum;
import com.zjf.channel.base.service.IChannelService;
import com.zjf.channel.base.service.impl.ChannelServiceImpl;
import com.zjf.channel.wechat.method.client.WechatClient;
import com.zjf.channel.wechat.method.client.factory.WechatClientBuilderFactory;
import com.zjf.channel.wechat.method.impl.WechatCreateMethod;
import com.zjf.channel.wechat.method.impl.WechatQueryMethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WechatConfiguration {
    @Bean
    IChannelService channelService() {
        IChannelService channelService = new ChannelServiceImpl<WechatClient>(ChannelEnum.WECHAT,
                wechatQueryMethod(), wechatCreateMethod(), wechatClientBuilderFactory());
        return channelService;
    }

    public WechatClientBuilderFactory wechatClientBuilderFactory() {
        return new WechatClientBuilderFactory();
    }

    @Bean
    WechatQueryMethod wechatQueryMethod() {
        return new WechatQueryMethod();
    }

    @Bean
    WechatCreateMethod wechatCreateMethod() {
        return new WechatCreateMethod();
    }
}
