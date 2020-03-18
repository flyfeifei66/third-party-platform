package com.zjf;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@AutoConfigureMockMvc
@Slf4j
public class JsonTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void TestXXX() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/jsontest")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .param("xxx", "xxx"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        log.error("返回数据：{}",result.getResponse().getContentAsString());
    }
}
