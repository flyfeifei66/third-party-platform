package com.zjf.channel.base.method.client.factory;

/**
 * 客户端builder工厂，方便builder处理特殊参数
 * client的构造过程可能比较复杂，所以定义此工厂类创建客户端builder，由builder去构建client。
 *
 * @author zhaojufei
 */
public interface IClientBuilderFactory<B extends AbstractClientBuilder> {

    /**
     * 创建一个clientBuilder
     *
     * @return
     */
    B createBuilder();
}
