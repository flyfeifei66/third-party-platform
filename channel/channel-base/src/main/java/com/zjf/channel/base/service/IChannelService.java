package com.zjf.channel.base.service;


import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.request.BaseQueryRequest;
import com.zjf.channel.base.method.response.BaseCreateResponse;

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
    BaseQueryRequest query(BaseQueryRequest queryRequest, BaseConfig config);


    /**
     * 创建请求
     *
     * @param createResponse
     * @param channelConfig
     * @return
     */
    BaseCreateResponse create(BaseCreateResponse createResponse, BaseConfig channelConfig);

}
