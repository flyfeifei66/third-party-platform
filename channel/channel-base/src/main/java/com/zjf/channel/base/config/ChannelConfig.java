package com.zjf.channel.base.config;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhaojufei
 */
@Getter
@Slf4j
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
