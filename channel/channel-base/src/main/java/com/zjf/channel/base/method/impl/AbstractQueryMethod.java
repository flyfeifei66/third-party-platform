package com.zjf.channel.base.method.impl;

import com.zjf.channel.base.method.request.BaseQueryRequest;
import com.zjf.channel.base.method.response.BaseQueryResponse;
import com.zjf.channel.base.method.IQueryMethod;
import com.zjf.channel.base.method.convert.IQueryArgsConverter;

/**
 * @author zhaojufei
 */
public abstract class AbstractQueryMethod<Req extends BaseQueryRequest, Res extends BaseQueryResponse,
        CV extends IQueryArgsConverter<Req, Res, NReq, NRes>, NReq, NRes, NC>
        extends AbstractMethod<Req, Res, CV, NReq, NRes, NC> implements IQueryMethod<Req, Res, NC> {


    /**
     * 构造方法
     *
     * @param apiArgsConverter
     */
    public AbstractQueryMethod(CV apiArgsConverter) {
        super(apiArgsConverter);
    }
}
