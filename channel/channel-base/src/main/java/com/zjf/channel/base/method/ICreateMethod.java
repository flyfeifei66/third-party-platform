package com.zjf.channel.base.method;

import com.zjf.channel.base.method.request.BaseCreateRequest;
import com.zjf.channel.base.method.response.BaseCreateResponse;

/**
 * 创建方法模式定时
 *
 * @author zhaojufei
 */
public interface ICreateMethod<Req extends BaseCreateRequest, Res extends BaseCreateResponse, NC> extends IMethodDefinition<Req, Res, NC> {

}
