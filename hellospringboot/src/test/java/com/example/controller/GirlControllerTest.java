package com.example.controller;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/6/17 14:08
 * @修改者:
 * @修改时间:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GirlControllerTest extends TestCase {

    @Autowired
    private MockMvc mockMvc;//用来模拟postman发送"带参数请求"以测试Controller方法
    @Test
    public void testGilrList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/girls"))
                .andExpect(MockMvcResultMatchers.status().isOk());
//        .andExpect(MockMvcResultMatchers.content().string("abc"));
    }
    //如果想让所有的单元测试用例自动运行，可以执行命令 mvn clean package
    //如果不想让单元测试用例自动运行，可以 运行指令 mvn clean package -Dmaven.test.skip=true
}