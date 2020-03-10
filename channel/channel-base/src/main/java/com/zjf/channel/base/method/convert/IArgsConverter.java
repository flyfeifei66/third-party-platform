package com.zjf.channel.base.method.convert;

import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.param.request.BaseRequest;
import com.zjf.channel.base.method.param.response.BaseResponse;

/**
 * @author zhaojufei
 */
public interface IArgsConverter<Req extends BaseRequest, Res extends BaseResponse, NReq, NRes>  {
    /**
     * 将openapi入参转换为三方sdk入参
     *
     * @param request
     * @param channelConfig
     * @return
     */
    NReq convertRequest(Req request, BaseConfig channelConfig);

    /**
     * 将三方sdk出参转换为openapi出参
     *
     * @param response
     * @return
     */
    Res convertResponse(NRes response);
}
