package com.zimug.bootlaunch.jpa.testdb;

import org.springframework.data.jpa.repository.JpaRepository;

//这个可以根据Article创建表，如果数据库中没有该表自动创建该表
public interface ArticleRepository extends JpaRepository<Article,Long> {
    Article findByAuthor(String zimug);
}