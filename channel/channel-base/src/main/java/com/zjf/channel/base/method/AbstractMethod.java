package com.zjf.channel.base.method;


import com.zjf.channel.base.config.BaseConfig;
import com.zjf.channel.base.method.convert.IArgsConverter;
import com.zjf.channel.base.method.param.request.BaseRequest;
import com.zjf.channel.base.method.param.response.BaseResponse;

/**
 * 底层API抽象实现类
 * Req：对内的客户化、业务化的入参
 * Res：对内返回的统一格式的出参
 * NReq：三方系统需要的入参
 * NRes：三方系统需要的出参
 * NC：对接三方系统的Client
 *
 * @author zhaojufei
 */
public abstract class AbstractMethod<Req extends BaseRequest, Res extends BaseResponse, NReq, NRes, NC,
                                                    CV extends IArgsConverter<Req, Res, NReq, NRes>>
        implements IBaseMethod<Req, Res, NC> {

    /**
     * openapi参数与渠道sdk api参数转换器
     */
    private CV apiArgsConverter;

    /**
     * 构造方法
     *
     * @param apiArgsConverter
     */
    public AbstractMethod(CV apiArgsConverter) {
        this.apiArgsConverter = apiArgsConverter;
    }

    /**
     * 执行调用的方法
     *
     * @param nativeClient 直接对接三方的客户端
     * @param request      入参
     * @param config       额外的配置信息
     * @return
     */
    @Override
    public Res execute(NC nativeClient, Req request, BaseConfig config) {
        NReq nReq = apiArgsConverter.convertRequest(request, config);
        NRes nRes = nativeExecute(nativeClient, nReq);
        return apiArgsConverter.convertResponse(nRes);
    }

    /**
     * 调用sdk方法
     *
     * @param nativeRequest
     * @param nativeClient
     * @return
     */
    protected abstract NRes nativeExecute(NC nativeClient, NReq nativeRequest);


    public CV getApiArgsConverter() {
        return apiArgsConverter;
    }

    public void setApiArgsConverter(CV apiArgsConverter) {
        this.apiArgsConverter = apiArgsConverter;
    }
}


