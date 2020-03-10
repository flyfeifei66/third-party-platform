package com.zjf.channel.base.service.impl;

import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.constant.ChannelEnum;
import com.zjf.channel.base.method.IBaseMethod;
import com.zjf.channel.base.method.ICreateMethod;
import com.zjf.channel.base.method.IQueryMethod;
import com.zjf.channel.base.method.client.factory.AbstractClientBuilder;
import com.zjf.channel.base.method.client.factory.IClientBuilderFactory;
import com.zjf.channel.base.method.param.request.CreateRequest;
import com.zjf.channel.base.method.param.request.QueryRequest;
import com.zjf.channel.base.method.param.request.BaseRequest;
import com.zjf.channel.base.method.param.response.CreateResponse;
import com.zjf.channel.base.method.param.response.QueryResponse;
import com.zjf.channel.base.method.param.response.BaseResponse;
import com.zjf.channel.base.service.IChannelService;

/**
 * @author zhaojufei
 */
public class ChannelServiceImpl<NC> implements IChannelService {

    private ChannelEnum channelEnum;
    private IQueryMethod<NC> queryMethod;
    private ICreateMethod<NC> createMethod;
    private IClientBuilderFactory<? extends AbstractClientBuilder<NC>> clientBuilderFactory;

    public ChannelServiceImpl(ChannelEnum channelEnum, IQueryMethod queryMethod,
                              ICreateMethod createMethod,
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
    public QueryResponse query(QueryRequest queryRequest, BaseConfig config) {
        return this.executeMethod(this.queryMethod, queryRequest, config);
    }

    /**
     * 创建请求
     *
     * @param createRequest
     * @param config
     * @return
     */
    @Override
    public CreateResponse create(CreateRequest createRequest, BaseConfig config) {
        return this.executeMethod(this.createMethod, createRequest, config);
    }


    /**
     * @param baseMethod
     * @param request
     * @param config
     * @param <Req>
     * @param <Res>
     * @return
     */
    protected <Req extends BaseRequest, Res extends BaseResponse> Res executeMethod(IBaseMethod<Req, Res, NC> baseMethod,
                                                                                    Req request,
                                                                                    BaseConfig config) {
        Res execute = baseMethod.execute(this.getClient(config), request, config);
        return execute;
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
