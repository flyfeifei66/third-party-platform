package com.zjf.channel.base.method.impl;

import com.zjf.channel.base.method.request.BaseCreateRequest;
import com.zjf.channel.base.method.response.BaseCreateResponse;
import com.zjf.channel.base.method.ICreateMethod;
import com.zjf.channel.base.method.convert.ICreateArgsConverter;

/**
 * @author zhaojufei
 */
public abstract class AbstractCreateMethod<Req extends BaseCreateRequest, Res extends BaseCreateResponse,
        CV extends ICreateArgsConverter<Req, Res, NReq, NRes>, NReq, NRes, NC>
        extends AbstractMethod<Req, Res, CV, NReq, NRes, NC> implements ICreateMethod<Req, Res, NC> {

    /**
     * 构造方法
     *
     * @param apiArgsConverter
     */
    public AbstractCreateMethod(CV apiArgsConverter) {
        super(apiArgsConverter);
    }
}
