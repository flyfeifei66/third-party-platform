package com.zjf.controller;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
public class JsonTest {

    @GetMapping("/jsontest")
    public Object test() {
        Date date = new Date();
        User xiaoming = new User("小明", date);

        String jsonStr = JSON.toJSONString(xiaoming);
        log.error("格式化字符串：{}", jsonStr);

        User user2 = JSON.parseObject(jsonStr, User.class);
        log.error("转回bean:{}", user2.toString());

        return "hehe";
    }


    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public static class User {
        private String name;
        private Date date;
    }
}
