package com.zjf.channel.base.method;

import com.zjf.channel.base.method.param.request.BaseCreateRequest;
import com.zjf.channel.base.method.param.response.BaseCreateResponse;

/**
 * 创建方法模式定时
 *
 * @author zhaojufei
 */
public interface ICreateMethod<Req extends BaseCreateRequest, Res extends BaseCreateResponse, NC> extends IBaseMethod<Req, Res, NC> {

}
