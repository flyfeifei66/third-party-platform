package com.zjf.channel.base.service.impl;

import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.constant.ChannelEnum;
import com.zjf.channel.base.method.IBaseMethod;
import com.zjf.channel.base.method.client.factory.AbstractClientBuilder;
import com.zjf.channel.base.method.client.factory.IClientBuilderFactory;
import com.zjf.channel.base.method.impl.AbstractCreateMethod;
import com.zjf.channel.base.method.impl.AbstractQueryMethod;
import com.zjf.channel.base.method.param.request.BaseCreateRequest;
import com.zjf.channel.base.method.param.request.BaseQueryRequest;
import com.zjf.channel.base.method.param.request.BaseRequest;
import com.zjf.channel.base.method.param.response.BaseResponse;
import com.zjf.channel.base.service.IChannelService;

/**
 * @author zhaojufei
 */
public class ChannelServiceImpl<NC> implements IChannelService {

    private ChannelEnum channelEnum;
    private AbstractQueryMethod queryMethod;
    private AbstractCreateMethod createMethod;
    private IClientBuilderFactory<? extends AbstractClientBuilder<NC>> clientBuilderFactory;

    public ChannelServiceImpl(ChannelEnum channelEnum, AbstractQueryMethod queryMethod,
                              AbstractCreateMethod createMethod,
                              IClientBuilderFactory clientBuilderFactory) {
        this.channelEnum = channelEnum;
        this.queryMethod = queryMethod;
        this.createMethod = createMethod;
        this.clientBuilderFactory = clientBuilderFactory;
    }

    /**
     * 查询请求
     *
     * @param queryRequest
     * @param config
     * @return
     */
    @Override
    public <T> T query(BaseQueryRequest queryRequest, BaseConfig config) {
        return (T) this.executeMethod(this.queryMethod, queryRequest, config);
    }

    /**
     * 创建请求
     *
     * @param createRequest
     * @param config
     * @return
     */
    @Override
    public <T> T create(BaseCreateRequest createRequest, BaseConfig config) {
        return (T) this.executeMethod(this.createMethod, createRequest, config);
    }


    /**
     * @param baseMethod
     * @param request
     * @param config
     * @param <Req>
     * @param <Res>
     * @return
     */
    private <Req extends BaseRequest, Res extends BaseResponse> Res executeMethod(IBaseMethod<Req, Res, NC> baseMethod,
                                                                                  Req request,
                                                                                  BaseConfig config) {
        return baseMethod.execute(this.getClient(config), request, config);
    }

    /**
     * @param config
     * @return
     */
    public NC getClient(BaseConfig config) {
        return this.clientBuilderFactory.createBuilder().setConfig(config).build();
    }

    public ChannelEnum getChannelEnum() {
        return channelEnum;
    }


}
