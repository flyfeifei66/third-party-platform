package com.zjf.channel.base.api;

import com.zjf.channel.base.request.CreateRequest;
import com.zjf.channel.base.response.CreateResponse;

/**
 * 创建方法模式定时
 *
 * @author zhaojufei
 */
public interface NaviveCreateApi<NC> extends NativeApi<CreateRequest, CreateResponse, NC> {
}
