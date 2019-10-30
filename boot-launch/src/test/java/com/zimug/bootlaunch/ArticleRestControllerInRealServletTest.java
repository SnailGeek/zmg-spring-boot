package com.zimug.bootlaunch;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zimug.bootlaunch.service.ArticleRestService;
import com.zimug.bootlaunch.vo.ArticleVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @program: ArticleRestControllerTest
 * @description:
 * @author: wangf-q
 * @date: 2019-10-16 09:24
 **/
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class ArticleRestControllerInRealServletTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ArticleRestService articleRestService;

    @Test
    public void saveArticle() throws Exception{
        String article = "{\n" +
                "    \"id\": 1,\n" +
                "    \"author\": \"zimug\",\n" +
                "    \"title\": \"手摸手教你开发spring boot\",\n" +
                "    \"content\": \"c\",\n" +
//                "    \"createTime\": \"2017-07-16 05:23:34\",\n" +
                "    \"reader\":[{\"name\":\"zimug\",\"age\":18},{\"name\":\"kobe\",\"age\":37}]\n" +
                "}";

        ObjectMapper objectMapper = new ObjectMapper();
        ArticleVO articleObj = objectMapper.readValue(article, ArticleVO.class);

        when(articleRestService.saveArticle(articleObj)).thenReturn(articleObj);

        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.request(HttpMethod.POST, "/rest/article")
                        .contentType("application/json").content(article))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.author").value("zimug"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.reader[0].age").value(18))
                .andDo(print())
                .andReturn();

        log.info(result.getResponse().getContentAsString());
    }
}
