package com.zjf.channel.base.method;

import com.zjf.channel.base.method.param.request.CreateRequest;
import com.zjf.channel.base.method.param.response.CreateResponse;

/**
 * 定义一个方法，明确出入参泛型
 *
 * @author zhaojufei
 */
public interface ICreateMethod<NC> extends IBaseMethod<CreateRequest, CreateResponse, NC> {

}
