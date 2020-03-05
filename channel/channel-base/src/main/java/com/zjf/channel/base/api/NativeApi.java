package com.zjf.channel.base.api;


import com.zjf.channel.base.config.ChannelConfig;
import com.zjf.channel.base.request.BaseRequest;
import com.zjf.channel.base.response.BaseResponse;

/**
 * 此类定义了我们对接三方接口时，必须使用的模式。
 * 使用nativeClient（客户端）把request传入，得到一个response，鉴于调用三方接口都需要一些额外的信息，
 * 如密钥等，再加一个config参数。
 *
 * @author zhaojufei
 */
public interface NativeApi<Req extends BaseRequest, Res extends BaseResponse, NC> {

    /**
     * 执行调用的方法
     *
     * @param nativeClient 直接对接三方的客户端
     * @param request      入参
     * @param config       额外的配置信息
     * @return
     */
    Res execute(NC nativeClient, Req request, ChannelConfig config);
}