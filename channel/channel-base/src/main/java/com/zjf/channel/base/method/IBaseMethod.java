package com.zjf.channel.base.method;


import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.param.request.BaseRequest;
import com.zjf.channel.base.method.param.response.BaseResponse;

/**
 * 定义方法的模式：拿着一个入参request和配置信息，得到一个response。
 *
 * @author zhaojufei
 */
public interface IBaseMethod<Req extends BaseRequest, Res extends BaseResponse, NC> {

    /**
     * 执行调用的方法
     *
     * @param nativeClient 对接三方的客户端
     * @param request      本系统使用入参
     * @param config       额外的配置信息
     * @return Res         本系统返回出参
     */
    Res execute(NC nativeClient, Req request, BaseConfig config);
}