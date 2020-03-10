package com.zjf.channel.base.method.convert;

import com.zjf.channel.base.method.param.request.BaseCreateRequest;
import com.zjf.channel.base.method.param.response.BaseCreateResponse;

/**
 * @author zhaojufei
 */
public interface ICreateArgsConverter<Req extends BaseCreateRequest, Res extends BaseCreateResponse, NReq, NRes> extends ArgsConverter<Req, Res, NReq, NRes> {
}
