package com.zjf.channel.wechat.method.impl;

import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.AbstractMethod;
import com.zjf.channel.base.method.ICreateMethod;
import com.zjf.channel.base.method.bean.request.CreateRequest;
import com.zjf.channel.base.method.bean.response.CreateResponse;
import com.zjf.channel.wechat.method.client.WechatClient;
import com.zjf.channel.wechat.method.client.bean.request.SdkWechatCreateReq;
import com.zjf.channel.wechat.method.client.bean.response.SdkWechatCreateRes;
import org.springframework.beans.BeanUtils;

public class WechatCreateMethod extends AbstractMethod<CreateRequest, CreateResponse, SdkWechatCreateReq,
        SdkWechatCreateRes, WechatClient> implements ICreateMethod<WechatClient> {


    @Override
    protected SdkWechatCreateRes nativeExecute(WechatClient nativeClient, SdkWechatCreateReq nativeRequest) {
        return nativeClient.create(nativeRequest);
    }

    @Override
    protected SdkWechatCreateReq convertRequest(CreateRequest request, BaseConfig channelConfig) {
        SdkWechatCreateReq sdkWechatCreateReq = new SdkWechatCreateReq();
        BeanUtils.copyProperties(request, sdkWechatCreateReq);
        return new SdkWechatCreateReq();
    }

    @Override
    protected CreateResponse convertResponse(SdkWechatCreateRes response) {
        CreateResponse wechatCreateRes = new CreateResponse();
        BeanUtils.copyProperties(response, wechatCreateRes);
        return wechatCreateRes;
    }
}
