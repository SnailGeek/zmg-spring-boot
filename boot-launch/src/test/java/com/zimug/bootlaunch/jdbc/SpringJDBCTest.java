package com.zimug.bootlaunch.jdbc;

import com.zimug.bootlaunch.dao.ArticleJDBCDAO;
import com.zimug.bootlaunch.domain.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @program: SpringJDBCTest
 * @description:
 * @author: wangf-q
 * @date: 2019-10-25 09:17
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJDBCTest {

    @Resource
    private ArticleJDBCDAO articleJDBCDAO;
    @Resource
    private JdbcTemplate primaryJdbcTemplate;
    @Resource
    private JdbcTemplate secondaryJdbcTemplate;


    @Test
    public void testJdbc() {
        articleJDBCDAO.save(Article.builder().author("zimug").title("primaryJdbcTemplate").content("ceshi").createTime(new Date()).build(),
                primaryJdbcTemplate);
        articleJDBCDAO.save(Article.builder().author("zimug").title("secondaryJdbcTemplate").content("ceshi").createTime(new Date()).build(),
                secondaryJdbcTemplate);
    }
}
