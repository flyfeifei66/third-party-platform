package method.impl;

import com.zjf.channel.base.method.IQueryMethod;
import com.zjf.channel.base.method.convert.IQueryArgsConverter;
import com.zjf.channel.base.method.impl.AbstractQueryMethod;

/**
 * @author zhaojufei
 */
public class WechatQueryMethod extends AbstractQueryMethod implements IQueryMethod {
    /**
     * 构造方法
     *
     * @param apiArgsConverter
     */
    public WechatQueryMethod(IQueryArgsConverter apiArgsConverter) {
        super(apiArgsConverter);
    }

    /**
     * 调用sdk方法
     *
     * @param nativeRequest
     * @param nativeClient
     * @return
     */
    @Override
    protected Object nativeExecute(Object nativeRequest, Object nativeClient) {
        return null;
    }
}
