package com.zjf.channel.wechat.method.client.factory;

import com.zjf.channel.base.method.client.factory.AbstractClientBuilder;
import com.zjf.channel.wechat.method.client.WechatClient;

public class WechatClientBuilder extends AbstractClientBuilder<WechatClient> {

    @Override
    public WechatClient build() {
        return new WechatClient();
    }
}
