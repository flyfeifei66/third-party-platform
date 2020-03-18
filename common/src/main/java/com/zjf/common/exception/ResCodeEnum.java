package com.zjf.common.exception;


/**
 * 返回Code枚举，建议统一在此处定义全局唯一异常码
 * 码的使用除了200代表成功，其他码应该尽量避开HTTP状态码，防止歧义。
 * 建议2XX代表警告，5XX代表错误
 *
 * @author zhaojufei
 */
public enum ResCodeEnum {
    /**
     * SUCCESS
     */
    SUCCESS("200", "SUCCESS"),


    AUTH_NOT_PASS("520", "非法访问"),

    PARAM_ERROR("521", "参数错误"),

    SYSTEM_ERROR("522", "系统错误"),

    BUSINESS_ERROR("523", "业务异常");


    /**
     * 状态码
     */
    private final String code;
    /**
     * 描述信息
     */
    private final String desc;

    ResCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
    }
