package com.zjf.config.constant;

/**
 * 切面顺序常量类：值越小，切面会先执行。定义切面，不要在切面之间耦合逻辑。
 * 通过定义切面的order，控制切面的执行顺序，建议自定义的切面都指定order。
 * 如果order值不够用，可以重新定义切面order，但是不要改变order之间的先后顺序。
 *
 * @author zhaojufei
 */
public class AdviceOrder {
    /**
     * controller层打印日志
     */
    public static final int WEBLOG = 1;

    /**
     * 参数校验
     */
    public static final int PARAM_VALIDATE = 2;

    /**
     * 防重复提交
     */
    public static final int UN_REPEAT_SUBMIT = 11;

    /**
     * 分布式锁
     */
    public static final int DIST_LOCK = 98;

    /**
     * 数据库事务
     */
    public static final int DB_TRANSACTION = 99;

    /**
     * 版本控制
     */
    public static final int VCLOCK = 100;

    /**
     * 最后一个(为了强制都使用这里的常量，不要使用 MAX_VALUE，因为默认值是最大，写了会报警告)
     */
    public static final int LAST = Integer.MAX_VALUE - 1;

}
