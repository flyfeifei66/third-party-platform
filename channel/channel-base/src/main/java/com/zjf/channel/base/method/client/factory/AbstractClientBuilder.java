package com.zjf.channel.base.method.client.factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zjf.channel.base.config.BaseConfig;

/**
 * 客户端构造者
 *
 * @author zhaojufei
 */
public abstract class AbstractClientBuilder<NC> {

    protected ObjectMapper objectMapper;

    protected BaseConfig config;

    /**
     * 构造client
     *
     * @return
     */
    public abstract NC build();

    public AbstractClientBuilder<NC> setConfig(BaseConfig config) {
        this.config = config;
        return this;
    }

    public AbstractClientBuilder<NC> setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        return this;
    }
}
