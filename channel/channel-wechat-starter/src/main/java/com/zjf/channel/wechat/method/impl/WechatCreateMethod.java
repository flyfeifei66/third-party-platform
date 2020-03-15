package com.zjf.channel.wechat.method.impl;

import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.AbstractMethod;
import com.zjf.channel.base.method.ICreateMethod;
import com.zjf.channel.wechat.method.bean.request.WechatCreateReq;
import com.zjf.channel.wechat.method.bean.response.WechatCreateRes;
import com.zjf.channel.wechat.method.client.WechatClient;
import com.zjf.channel.wechat.method.client.bean.request.SdkWechatCreateReq;
import com.zjf.channel.wechat.method.client.bean.response.SdkWechatCreateRes;

public class WechatCreateMethod extends AbstractMethod<WechatCreateReq, WechatCreateRes, SdkWechatCreateReq,
        SdkWechatCreateRes, WechatClient> implements ICreateMethod<WechatCreateReq, WechatCreateRes, WechatClient> {


    @Override
    protected SdkWechatCreateRes nativeExecute(WechatClient nativeClient, SdkWechatCreateReq nativeRequest) {
        return null;
    }

    @Override
    protected SdkWechatCreateReq convertRequest(WechatCreateReq request, BaseConfig channelConfig) {
        return null;
    }

    @Override
    protected WechatCreateRes convertResponse(SdkWechatCreateRes response) {
        return null;
    }
}
