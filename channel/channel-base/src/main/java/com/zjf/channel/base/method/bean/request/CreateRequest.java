package com.zjf.channel.base.method.bean.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 创建请求
 *
 * @author zhaojufei
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CreateRequest extends BaseRequest {

    /**
     * 渠道
     */
    private String channel;
}
