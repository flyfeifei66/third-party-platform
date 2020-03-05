package com.zjf.channel.base.api;

import com.zjf.channel.base.request.QueryRequest;
import com.zjf.channel.base.response.QueryResponse;

/**
 * 查询方法模式定义
 * @author zhaojufei
 */
public interface NativeQueryApi<NC> extends NativeApi<QueryRequest, QueryResponse, NC> {

}
