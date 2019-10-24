package com.zimug.bootlaunch.service.impl;

import com.zimug.bootlaunch.dao.ArticleJDBCDAO;
import com.zimug.bootlaunch.domain.Article;
import com.zimug.bootlaunch.service.ArticleRestService;
import lombok.extern.slf4j.Slf4j;
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
    private
    ArticleJDBCDAO articleJDBCDAO;

    @Transactional
    public Article saveArticle( Article article) {
        articleJDBCDAO.save(article);
        //int a = 2/0；
        return article;
    }

    public void deleteArticle(Long id){
        articleJDBCDAO.deleteById(id);
    }

    public void updateArticle(Article article){
        articleJDBCDAO.updateById(article);
    }

    public Article getArticle(Long id){
        return articleJDBCDAO.findById(id);
    }

    public List<Article> getAll(){
        return articleJDBCDAO.findAll();
    }

}
