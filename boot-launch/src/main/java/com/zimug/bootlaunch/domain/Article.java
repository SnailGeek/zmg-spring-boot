package com.zimug.bootlaunch.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @program: Article
 * @description:
 * @author: wangf-q
 * @date: 2019-10-16 08:39
 **/
@Data
@Builder
public class Article {
    private Long id;
    private String author;
    private String title;
    private String content;
    private Date createTime;
    private List<Reader> reader;
}
