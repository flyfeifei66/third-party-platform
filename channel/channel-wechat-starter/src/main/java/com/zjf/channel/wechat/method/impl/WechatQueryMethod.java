package com.zjf.channel.wechat.method.impl;

import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.AbstractMethod;
import com.zjf.channel.base.method.IQueryMethod;
import com.zjf.channel.wechat.method.bean.request.WechatQueryReq;
import com.zjf.channel.wechat.method.bean.response.WechatQueryRes;
import com.zjf.channel.wechat.method.client.WechatClient;
import com.zjf.channel.wechat.method.client.bean.request.SdkWechatQueryReq;
import com.zjf.channel.wechat.method.client.bean.response.SdkWechatQueryRes;

public class WechatQueryMethod extends AbstractMethod<WechatQueryReq, WechatQueryRes, SdkWechatQueryReq,
        SdkWechatQueryRes, WechatClient> implements IQueryMethod<WechatQueryReq, WechatQueryRes, WechatClient> {
    @Override
    protected SdkWechatQueryRes nativeExecute(WechatClient nativeClient, SdkWechatQueryReq nativeRequest) {
        return null;
    }

    @Override
    protected SdkWechatQueryReq convertRequest(WechatQueryReq request, BaseConfig channelConfig) {
        return null;
    }

    @Override
    protected WechatQueryRes convertResponse(SdkWechatQueryRes response) {
        return null;
    }
}
