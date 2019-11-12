package com.zimug.bootlaunch.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zimug.bootlaunch.domain.Reader;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @program: ArticleVO
 * @description:
 * @author: wangf-q
 * @date: 2019-10-29 16:03
 **/
@Data
public class ArticleVO {
    //@JsonIgnore //排除属性不作序列化与反序列化
    private Long id;

    //@JsonProperty("auther") //为属性换一个名
    private String author;
    private String title;
    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL) // 排除为空的元素不做序列化反序列化
    private Date createTime;

    private List<Reader> reader;
}



