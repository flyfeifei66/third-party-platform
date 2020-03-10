package com.zjf.channel.base.service;


import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.param.request.BaseCreateRequest;
import com.zjf.channel.base.method.param.request.BaseQueryRequest;

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
    <T> T query(BaseQueryRequest queryRequest, BaseConfig config);


    /**
     * 创建请求
     *
     * @param createRequest
     * @param config
     * @return
     */
    <T> T create(BaseCreateRequest createRequest, BaseConfig config);

}
