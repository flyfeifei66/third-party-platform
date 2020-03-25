package com.zjf.channel.base.constant;

/**
 * 渠道枚举
 *
 * @author zhaojufei
 */
public enum ChannelEnum {
    wechat("wechat", "微信"),
    union_pay("union_pay", "银联");

    private String code;
    private String value;

    ChannelEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
