package com.zjf.channel.base.method;

import com.zjf.channel.base.method.param.request.QueryRequest;
import com.zjf.channel.base.method.param.response.QueryResponse;

/**
 * 创建方法，此接口定义主要是明确泛型
 *
 * @author zhaojufei
 */
public interface IQueryMethod<NC> extends IBaseMethod<QueryRequest, QueryResponse, NC> {

}
