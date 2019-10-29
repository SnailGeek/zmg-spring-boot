package com.zimug.bootlaunch.service.impl;


import com.zimug.bootlaunch.dao.ArticleJDBCDAO;
import com.zimug.bootlaunch.domain.Article;
import com.zimug.bootlaunch.service.ArticleRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: ArticleRestServiceImpl
 * @description:
 * @author: wangf-q
 * @date: 2019-10-17 07:26
 **/
@Service
@Slf4j
public class ArticleRestServiceImpl implements ArticleRestService {
    @Resource
    private ArticleJDBCDAO articleJDBCDAO;



    @Resource
    private JdbcTemplate primaryJdbcTemplate;

    @Resource
    private JdbcTemplate secondaryJdbcTemplate;

    @Transactional //如果只用这个注解一旦出错，还是有数据库里的数据会被修改，此例中secondaryJdbcTemplate中的数据被修改，因为是面向切面编程，先打开的后关闭
    public Article saveArticle(Article article) {
        articleJDBCDAO.save(article, primaryJdbcTemplate);
        articleJDBCDAO.save(article, secondaryJdbcTemplate);
//        int a = 2/0;
        return article;
    }

    public void deleteArticle(Long id) {
        articleJDBCDAO.deleteById(id, primaryJdbcTemplate);
    }

    public void updateArticle(Article article) {
        articleJDBCDAO.updateById(article, primaryJdbcTemplate);
    }

    public Article getArticle(Long id) {
        return articleJDBCDAO.findById(id, primaryJdbcTemplate);
    }

    public List<Article> getAll() {
        return articleJDBCDAO.findAll(primaryJdbcTemplate);
    }

}
