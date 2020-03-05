package com.zjf.channel.base.service;


import com.zjf.channel.base.config.ChannelConfig;
import com.zjf.channel.base.request.QueryRequest;
import com.zjf.channel.base.response.CreateResponse;

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
    QueryRequest query(QueryRequest queryRequest, ChannelConfig config);


    /**
     * 创建请求
     *
     * @param createResponse
     * @param channelConfig
     * @return
     */
    CreateResponse create(CreateResponse createResponse, ChannelConfig channelConfig);

}
