package com.zjf.channel.base.method;

import com.zjf.channel.base.method.param.request.CreateRequest;
import com.zjf.channel.base.method.param.response.CreateResponse;

/**
 * 创建方法，此接口定义主要是明确泛型
 *
 * @author zhaojufei
 */
public interface ICreateMethod<NC> extends IBaseMethod<CreateRequest, CreateResponse, NC> {

}
