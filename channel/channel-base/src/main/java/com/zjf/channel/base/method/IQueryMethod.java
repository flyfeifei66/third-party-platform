package com.zjf.channel.base.method;

import com.zjf.channel.base.method.param.request.QueryRequest;
import com.zjf.channel.base.method.param.response.QueryResponse;

/**
 * 定义一个方法，明确出入参泛型
 *
 * @author zhaojufei
 */
public interface IQueryMethod<NC> extends IBaseMethod<QueryRequest, QueryResponse, NC> {

}
