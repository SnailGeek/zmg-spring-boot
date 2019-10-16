package com.zimug.bootlaunch.domain;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @program: Article
 * @description:
 * @author: wangf-q
 * @date: 2019-10-16 08:39
 **/
@Data
@ToString
public class Article {
    private int id;
    private String author;
    private String title;
    private String content;
    private String createTime;
    private List<Reader> reader;
}
