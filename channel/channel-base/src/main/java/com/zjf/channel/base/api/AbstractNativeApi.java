package com.zjf.channel.base.api;


import com.zjf.channel.base.request.BaseRequest;
import com.zjf.channel.base.response.BaseResponse;

/**
 * 底层API抽象实现类
 * CReq：客户化、业务化的请求
 * @author zhaojufei
 */
public abstract class AbstractNativeApi<CReq, Req extends BaseRequest, CRes, Res extends BaseResponse, NC> implements NativeApi<Req, Res, NC> {


}


