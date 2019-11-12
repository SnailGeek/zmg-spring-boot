package com.zimug.bootlaunch.service;

import com.zimug.bootlaunch.vo.ArticleVO;

import java.util.List;

/**
 * @program: ArticleRestService
 * @description:
 * @author: wangf-q
 * @date: 2019-10-17 07:25
 **/
public interface ArticleRestService {


    ArticleVO saveArticle(ArticleVO article);

    void deleteArticle(Long id);

    void updateArticle(ArticleVO article);

    ArticleVO getArticle(Long id);

    List<ArticleVO> getAll();
}
