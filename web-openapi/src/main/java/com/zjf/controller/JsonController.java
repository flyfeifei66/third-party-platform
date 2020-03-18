package com.zjf.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@RestController
public class JsonController {

    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping("/jsontest")
    public Object test() throws JsonProcessingException {
        User user = new User("小明", new Date());
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        log.error(sf.format(user.getDate()));
        String jsonStr = JSON.toJSONString(user);
        log.error("格式化字符串：{}", jsonStr);
        User user2 = JSON.parseObject(jsonStr, User.class);
        log.error("转回bean:{}", user2.toString());
        log.error(sf.format(user2.getDate()));
        log.error("------------------------------");
        String string2 = objectMapper.writeValueAsString(user);
        log.error(string2);
        return "hehe";
    }


    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @Data
    public static class User {
        private String name;

        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date date;
    }
}
