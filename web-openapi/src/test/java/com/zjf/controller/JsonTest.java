package com.zjf.controller;

import com.zjf.App;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class, MockServletContext.class})
@AutoConfigureMockMvc
@Slf4j
public class JsonTest {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testDeleteAllHistory() {
        try {
            MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/jsontest"))
                    .andReturn();
            log.error("返回数据"+mvcResult.getResponse().getContentAsString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
