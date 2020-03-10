package com.zjf.channel.base.service;


import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.param.request.CreateRequest;
import com.zjf.channel.base.method.param.request.QueryRequest;
import com.zjf.channel.base.method.param.response.CreateResponse;
import com.zjf.channel.base.method.param.response.QueryResponse;

/**
 * @author maxh
 * @since 3.0 , 2018/3/26 11:15.
 */
public interface IChannelService {
    /**
     * 查询请求
     *
     * @param queryRequest
     * @param config
     * @return
     */
    QueryResponse query(QueryRequest queryRequest, BaseConfig config);


    /**
     * 创建请求
     *
     * @param createRequest
     * @param config
     * @return
     */
    CreateResponse create(CreateRequest createRequest, BaseConfig config);

}
