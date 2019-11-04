package com.zimug.bootlaunch.jpa;

import com.zimug.bootlaunch.jpa.testdb.Article;
import com.zimug.bootlaunch.jpa.testdb.ArticleRepository;
import com.zimug.bootlaunch.jpa.testdb2.Message;
import com.zimug.bootlaunch.jpa.testdb2.MessageRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: JPAMultiDataSourceTest
 * @description:
 * @author: wangf-q
 * @date: 2019-11-04 08:35
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class JPAMultiDataSourceTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private MessageRepository messageRepository;


    @Test
    public void testSave() {
        Article articleObj = new Article(1l, "zimug", "title", "content", null);
        articleRepository.save(articleObj);
        Message message = new Message(1l, "name", "content");
        messageRepository.save(message);
    }

}
