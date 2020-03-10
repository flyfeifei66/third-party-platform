package com.zjf.channel.base.method.convert;

import com.zjf.channel.base.method.param.request.CreateRequest;
import com.zjf.channel.base.method.param.response.CreateResponse;

/**
 * @author zhaojufei
 */
public interface ICreateArgsConverter<NReq, NRes> extends IArgsConverter<CreateRequest, CreateResponse, NReq,
        NRes> {

}
