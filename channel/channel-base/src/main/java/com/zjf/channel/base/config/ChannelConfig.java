package com.zjf.channel.base.config;

import lombok.Getter;

/**
 * @author zhaojufei
 */
@Getter
public class ChannelConfig {

    /**
     * 手机号码
     */
    private String tele;

    /**
     * 银行账户
     */
    private String bankaccount;

    /**
     * 税率
     */
    private Double taxRate;

    /**
     * 商品编码
     */
    private String itemCode;

    /**
     * 商品名称
     */
    private String itemName;
}
