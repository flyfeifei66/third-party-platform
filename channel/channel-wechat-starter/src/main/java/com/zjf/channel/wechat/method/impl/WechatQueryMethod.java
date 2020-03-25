package com.zjf.channel.wechat.method.impl;

import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.AbstractMethod;
import com.zjf.channel.base.method.IQueryMethod;
import com.zjf.channel.base.method.bean.request.QueryRequest;
import com.zjf.channel.base.method.bean.response.QueryResponse;
import com.zjf.channel.wechat.method.client.WechatClient;
import com.zjf.channel.wechat.method.client.bean.request.SdkWechatQueryReq;
import com.zjf.channel.wechat.method.client.bean.response.SdkWechatQueryRes;

public class WechatQueryMethod extends AbstractMethod<QueryRequest, QueryResponse, SdkWechatQueryReq,
        SdkWechatQueryRes, WechatClient> implements IQueryMethod<WechatClient> {
    @Override
    protected SdkWechatQueryRes nativeExecute(WechatClient nativeClient, SdkWechatQueryReq nativeRequest) {
        return null;
    }

    @Override
    protected SdkWechatQueryReq convertRequest(QueryRequest request, BaseConfig channelConfig) {
        return null;
    }

    @Override
    protected QueryResponse convertResponse(SdkWechatQueryRes response) {
        return null;
    }
}
