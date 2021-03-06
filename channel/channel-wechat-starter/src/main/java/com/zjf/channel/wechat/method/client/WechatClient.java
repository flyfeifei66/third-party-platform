package com.zjf.channel.wechat.method.client;

import com.zjf.channel.wechat.method.client.bean.request.SdkWechatCreateReq;
import com.zjf.channel.wechat.method.client.bean.request.SdkWechatQueryReq;
import com.zjf.channel.wechat.method.client.bean.response.SdkWechatCreateRes;
import com.zjf.channel.wechat.method.client.bean.response.SdkWechatQueryRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

@Slf4j
public class WechatClient {

    public static final String url = "wechat";


    public SdkWechatQueryRes query(SdkWechatQueryReq sdkWechatQueryReq) {
        log.error("已成功向{}发送：{}", url, sdkWechatQueryReq.toString());
        SdkWechatQueryRes sdkWechatQueryRes = new SdkWechatQueryRes();
        BeanUtils.copyProperties(sdkWechatQueryReq, sdkWechatQueryRes);
        return sdkWechatQueryRes;
    }


    /**
     * @param sdkWechatCreateReq
     * @return
     */
    public SdkWechatCreateRes create(SdkWechatCreateReq sdkWechatCreateReq) {
        log.error("已成功向{}发送：{}", url, sdkWechatCreateReq.toString());
        SdkWechatCreateRes sdkWechatCreateRes = new SdkWechatCreateRes();
        BeanUtils.copyProperties(sdkWechatCreateReq, sdkWechatCreateRes);
        return sdkWechatCreateRes;
    }
}
