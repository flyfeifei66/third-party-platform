package com.zjf.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.util.TimeZone;

@Configuration
public class JackJsonConfig {
    @Bean
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        // 实例化objectMapper
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
        // 自定义日期格式化，它能支持更多日期格式
        objectMapper.setDateFormat(new DateFormatter());
        // 设置时区，也可以在spring配置文件配置
        objectMapper.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return objectMapper;
    }
}
