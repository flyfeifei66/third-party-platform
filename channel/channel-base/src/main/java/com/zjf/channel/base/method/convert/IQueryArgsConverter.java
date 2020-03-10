package com.zjf.channel.base.method.convert;

import com.zjf.channel.base.method.param.request.BaseQueryRequest;
import com.zjf.channel.base.method.param.response.BaseQueryResponse;

/**
 * 查询方法参数转换器
 *
 * @author zhaojufei
 */
public interface IQueryArgsConverter<Req extends BaseQueryRequest, Res extends BaseQueryResponse, NReq, NRes> extends ArgsConverter<Req, Res, NReq, NRes> {
}
