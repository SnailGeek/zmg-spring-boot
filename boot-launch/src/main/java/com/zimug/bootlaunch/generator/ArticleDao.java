package com.zimug.bootlaunch.generator;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zimug.bootlaunch.generator.Article;
import com.zimug.bootlaunch.generator.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleDao extends BaseMapper<Article> {
    long countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExample(ArticleExample example);

    Article selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}