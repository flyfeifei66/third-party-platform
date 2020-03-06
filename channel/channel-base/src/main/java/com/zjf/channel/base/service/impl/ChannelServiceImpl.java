package com.zjf.channel.base.service.impl;

import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.constant.ChannelEnum;
import com.zjf.channel.base.method.ICreateMethod;
import com.zjf.channel.base.method.IQueryMethod;
import com.zjf.channel.base.method.request.BaseQueryRequest;
import com.zjf.channel.base.method.response.BaseCreateResponse;
import com.zjf.channel.base.service.IChannelService;

/**
 * @author zhaojufei
 */
public class ChannelServiceImpl implements IChannelService {
    private ChannelEnum channelEnum;
    private IQueryMethod queryMethod;
    private ICreateMethod createMethod;

    public ChannelServiceImpl(ChannelEnum channelEnum, IQueryMethod queryMethod, ICreateMethod createMethod) {
        this.channelEnum = channelEnum;
        this.queryMethod = queryMethod;
        this.createMethod = createMethod;
    }

    /**
     * 查询请求
     *
     * @param queryRequest
     * @param config
     * @return
     */
    @Override
    public BaseQueryRequest query(BaseQueryRequest queryRequest, BaseConfig config) {
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
    public BaseCreateResponse create(BaseCreateResponse createResponse, BaseConfig channelConfig) {
        return null;
    }


}
