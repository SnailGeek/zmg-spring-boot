package com.zimug.bootlaunch.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
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
@NoArgsConstructor
@AllArgsConstructor
public class Article implements Serializable {

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
