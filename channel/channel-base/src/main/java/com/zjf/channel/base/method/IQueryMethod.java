package com.zjf.channel.base.method;

import com.zjf.channel.base.method.param.request.BaseQueryRequest;
import com.zjf.channel.base.method.param.response.BaseQueryResponse;

/**
 * 查询方法模式定义
 *
 * @author zhaojufei
 */
public interface IQueryMethod<Req extends BaseQueryRequest, Res extends BaseQueryResponse, NC> extends IBaseMethod<Req, Res, NC> {

}
