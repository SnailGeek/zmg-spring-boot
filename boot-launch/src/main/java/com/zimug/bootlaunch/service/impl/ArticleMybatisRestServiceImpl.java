package com.zimug.bootlaunch.service.impl;

import com.zimug.bootlaunch.generator.Article;
import com.zimug.bootlaunch.generator.ArticleDao;
import com.zimug.bootlaunch.service.ArticleRestService;
import com.zimug.bootlaunch.util.DozerUtils;
import com.zimug.bootlaunch.vo.ArticleVO;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

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
public class ArticleMybatisRestServiceImpl implements ArticleRestService {
    @Resource
    protected Mapper dozerMapper;

    @Resource
    private ArticleDao articleDao;


    //新增
    @Override
    public ArticleVO saveArticle(ArticleVO article) {
        Article articlePO = dozerMapper.map(article, Article.class);
        articleDao.insert(articlePO);
        return null;
    }

    //删除
    @Override
    public void deleteArticle(Long id) {
        articleDao.deleteByPrimaryKey(id);
    }

    //更新
    @Override
    public void updateArticle(ArticleVO article) {
        Article articlePO = dozerMapper.map(article,Article.class);
        articleDao.updateByPrimaryKeySelective(articlePO);
    }

    //查询
    @Override
    public ArticleVO getArticle(Long id) {
        return dozerMapper.map(articleDao.selectByPrimaryKey(id),ArticleVO.class);
    }
    //查询所有
    @Override
    public List<ArticleVO> getAll() {
        List<Article> articles = articleDao.selectByExample(null);
        return DozerUtils.mapList(articles,ArticleVO.class);
    }
}
