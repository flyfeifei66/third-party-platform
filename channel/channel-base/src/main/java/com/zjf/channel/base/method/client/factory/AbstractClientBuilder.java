package com.zjf.channel.base.method.client.factory;

/**
 * 客户端构造者
 *
 * @author zhaojufei
 */
public abstract class AbstractClientBuilder<NC> {

    /**
     * 构造client
     *
     * @return
     */
    public abstract NC build();

}
