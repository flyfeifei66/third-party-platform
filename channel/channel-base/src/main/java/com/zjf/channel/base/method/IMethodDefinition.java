package com.zjf.channel.base.method;


import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.request.BaseRequest;
import com.zjf.channel.base.method.response.BaseResponse;

/**
 * 定义方法的模式：
 *
 * @author zhaojufei
 */
public interface IMethodDefinition<Req extends BaseRequest, Res extends BaseResponse, NC> {

    /**
     * 执行调用的方法
     *
     * @param nativeClient 直接对接三方的客户端
     * @param request      入参
     * @param config       额外的配置信息
     * @return
     */
    Res execute(NC nativeClient, Req request, BaseConfig config);
}