package com.zjf.channel.base.method.convert;

import com.zjf.channel.base.method.param.request.QueryRequest;
import com.zjf.channel.base.method.param.response.QueryResponse;

/**
 * 查询方法参数转换器
 *
 * @author zhaojufei
 */
public interface IQueryArgsConverter<NReq, NRes> extends IArgsConverter<QueryRequest, QueryResponse, NReq,
        NRes> {
}
