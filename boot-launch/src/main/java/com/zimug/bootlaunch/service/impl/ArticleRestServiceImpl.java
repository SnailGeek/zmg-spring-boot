package com.zimug.bootlaunch.service.impl;

import com.zimug.bootlaunch.domain.Article;
import com.zimug.bootlaunch.service.ArticleRestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: ArticleRestServiceImpl
 * @description:
 * @author: wangf-q
 * @date: 2019-10-17 07:26
 **/
@Service
@Slf4j
public class ArticleRestServiceImpl implements ArticleRestService {
    @Override
    public String saveArticle(Article article) {
        log.info(article.toString());
        return article.toString();
    }
}
