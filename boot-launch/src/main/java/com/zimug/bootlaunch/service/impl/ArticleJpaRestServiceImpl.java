package com.zimug.bootlaunch.service.impl;

import com.zimug.bootlaunch.jpa.testdb.Article;
import com.zimug.bootlaunch.jpa.testdb.ArticleRepository;
import com.zimug.bootlaunch.jpa.testdb2.Message;
import com.zimug.bootlaunch.jpa.testdb2.MessageRepository;
import com.zimug.bootlaunch.service.ArticleRestService;
import com.zimug.bootlaunch.util.DozerUtils;
import com.zimug.bootlaunch.vo.ArticleVO;
import lombok.extern.slf4j.Slf4j;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @program: ArticleRestServiceImpl
 * @description:
 * @author: wangf-q
 * @date: 2019-10-17 07:26
 **/
@Service
@Slf4j
public class ArticleJpaRestServiceImpl implements ArticleRestService {
    //将JPA仓库对象注入
    @Resource
    private ArticleRepository articleRepository;

    @Resource
    private MessageRepository messageRepository;

    @Resource
    private DozerBeanMapper dozerMapper;

    public ArticleVO saveArticle(ArticleVO article) {

        Article articlePO = dozerMapper.map(article,Article.class);
        articleRepository.save(articlePO);    //保存一个对象到数据库，insert
        messageRepository.save(new Message(null, "zimug", "gogogo"));


        return  article;
    }

    @Override
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);   //根据id删除1条数据库记录
    }

    @Override
    public void updateArticle(ArticleVO article) {
        Article articlePO = dozerMapper.map(article,Article.class);
        articleRepository.save(articlePO);   //更新一个对象到数据库，仍然使用save方法
    }

    @Override
    public ArticleVO getArticle(Long id) {
        Optional<Article> article = articleRepository.findById(id);  //根据id查找一条数据
        return dozerMapper.map(article.get(),ArticleVO.class);
    }

    @Override
    public List<ArticleVO> getAll() {
        List<Article> articleLis = articleRepository.findAll();  //查询article表的所有数据
        return DozerUtils.mapList(articleLis,ArticleVO.class);
    }
}
