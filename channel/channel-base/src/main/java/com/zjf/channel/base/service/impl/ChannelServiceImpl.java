package com.zjf.channel.base.service.impl;

import com.zjf.channel.base.config.ChannelConfig;
import com.zjf.channel.base.request.QueryRequest;
import com.zjf.channel.base.response.CreateResponse;
import com.zjf.channel.base.service.IChannelService;

/**
 * @author zhaojufei
 */
public class ChannelServiceImpl<NC> implements IChannelService{
    /**
     * 查询请求
     *
     * @param queryRequest
     * @param config
     * @return
     */
    @Override
    public QueryRequest query(QueryRequest queryRequest, ChannelConfig config) {
        return null;
    }

    /**
     * 创建请求
     *
     * @param createResponse
     * @param channelConfig
     * @return
     */
    @Override
    public CreateResponse create(CreateResponse createResponse, ChannelConfig channelConfig) {
        return null;
    }
}
