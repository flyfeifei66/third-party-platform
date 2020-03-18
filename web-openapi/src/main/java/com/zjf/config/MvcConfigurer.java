package com.zjf.config;

import com.zjf.config.validate.ParamsValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * spring-mvc配置
 *
 * @author zhaojufei
 */
@Configuration
public class MvcConfigurer implements WebMvcConfigurer {
    /**
     * 自定义参数校验器
     */
    @Override
    public Validator getValidator() {
        return createValidator();
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {

    }


    /**
     * 自定义参数校验器
     */
    @Bean
    public ParamsValidator createValidator() {
        return new ParamsValidator();
    }


}

