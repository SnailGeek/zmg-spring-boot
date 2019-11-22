package com.zimug.bootlaunch.controller;

import com.zimug.bootlaunch.service.ArticleRestService;
import com.zimug.bootlaunch.util.AjaxResponse;
import com.zimug.bootlaunch.vo.ArticleVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @program: ArticleRestController
 * @description:
 * @author: wangf-q
 * @date: 2019-10-16 08:58
 **/
@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    @Autowired
    ArticleRestService articleRestService;

    @RequestMapping(value = "/article", method = POST, produces = "application/json")
    public AjaxResponse saveArticle(@RequestBody ArticleVO article) {
        articleRestService.saveArticle(article);
        log.info("saveArticle：{}", article);
        return AjaxResponse.success(article);
    }

    @RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    public AjaxResponse deleteArticle(@PathVariable Long id) {
        articleRestService.deleteArticle(id);
        log.info("deleteArticle：{}", id);
        return AjaxResponse.success(id);
    }

    @RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody ArticleVO article) {
        article.setId(id);
        articleRestService.updateArticle(article);
        log.info("updateArticle：{}", article);
        return AjaxResponse.success(article);
    }

    @RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    public AjaxResponse getArticle(@PathVariable Long id) {
        return AjaxResponse.success(articleRestService.getArticle(id));
    }

    @RequestMapping(value = "/articles", method = GET, produces = "application/json")
    public AjaxResponse getAll(@PathVariable Long id) {
        return AjaxResponse.success(articleRestService.getAll());
    }
}
