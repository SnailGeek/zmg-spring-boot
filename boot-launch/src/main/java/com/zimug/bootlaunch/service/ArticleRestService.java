package com.zimug.bootlaunch.service;

import com.zimug.bootlaunch.domain.Article;

import java.util.List;

/**
 * @program: ArticleRestService
 * @description:
 * @author: wangf-q
 * @date: 2019-10-17 07:25
 **/
public interface ArticleRestService {

    public Article saveArticle(Article article);

    public void deleteArticle(Long id);

    public void updateArticle(Article article);

    public Article getArticle(Long id);

    public List<Article> getAll();
}
