package com.zjf.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zjf.config.validate.ParamsValidator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.TimeZone;

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

    /**
     * 自定义参数校验器
     *
     * @return
     */
    @Bean
    public ParamsValidator createValidator() {
        return new ParamsValidator();
    }


    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {

    }

    @Bean
    @Primary
    @ConditionalOnMissingBean(ObjectMapper.class)
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
        // 自定义日期格式化
        objectMapper.setDateFormat(new DateFormatter());
        // 设置为东八区的时区
        objectMapper.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return objectMapper;
    }

}

