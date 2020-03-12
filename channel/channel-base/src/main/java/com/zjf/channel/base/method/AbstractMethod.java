package com.zjf.channel.base.method;


import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.param.request.BaseRequest;
import com.zjf.channel.base.method.param.response.BaseResponse;

/**
 * 底层API抽象实现类
 * Req：对内的客户化、业务化的入参
 * Res：对内返回的统一格式的出参
 * NReq：三方系统需要的入参
 * NRes：三方系统需要的出参
 * NC：对接三方系统的Client
 *
 * @author zhaojufei
 */
public abstract class AbstractMethod<Req extends BaseRequest, Res extends BaseResponse, NReq, NRes, NC>
        implements IBaseMethod<Req, Res, NC> {

    /**
     * 执行调用的方法
     *
     * @param nativeClient 直接对接三方的客户端
     * @param request      入参
     * @param config       额外的配置信息
     * @return
     */
    @Override
    public Res execute(NC nativeClient, Req request, BaseConfig config) {
        NReq nReq = this.convertRequest(request, config);
        NRes nRes = nativeExecute(nativeClient, nReq);
        return this.convertResponse(nRes);
    }

    /**
     * 调用sdk方法
     *
     * @param nativeRequest
     * @param nativeClient
     * @return
     */
    protected abstract NRes nativeExecute(NC nativeClient, NReq nativeRequest);

    /**
     * 将openapi入参转换为三方sdk入参
     *
     * @param request
     * @param channelConfig
     * @return
     */
    protected abstract NReq convertRequest(Req request, BaseConfig channelConfig);

    /**
     * 将三方sdk出参转换为openapi出参
     *
     * @param response
     * @return
     */
    protected abstract Res convertResponse(NRes response);

}


