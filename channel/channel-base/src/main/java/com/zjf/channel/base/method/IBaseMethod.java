package com.zjf.channel.base.method;


import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.param.request.BaseRequest;
import com.zjf.channel.base.method.param.response.BaseResponse;

/**
 * 定义方法的模式：
 *
 * @author zhaojufei
 */
public interface IBaseMethod<Req extends BaseRequest, Res extends BaseResponse, NC> {

    /**
     * 执行调用的方法
     *
     * @param nativeClient 直接对接三方的客户端
     * @param request      业务系统的入参
     * @param config       额外的配置信息
     * @return Res 对内部业务系统返回的出参
     */
    Res execute(NC nativeClient, Req request, BaseConfig config);
}