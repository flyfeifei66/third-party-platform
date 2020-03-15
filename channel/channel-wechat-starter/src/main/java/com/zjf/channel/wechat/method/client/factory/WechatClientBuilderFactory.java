package com.zjf.channel.wechat.method.client.factory;

import com.zjf.channel.base.method.client.factory.IClientBuilderFactory;

public class WechatClientBuilderFactory implements IClientBuilderFactory<WechatClientBuilder> {
    @Override
    public WechatClientBuilder createBuilder() {
        return new WechatClientBuilder();
    }
}
