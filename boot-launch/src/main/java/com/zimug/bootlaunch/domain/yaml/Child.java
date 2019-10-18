package com.zimug.bootlaunch.domain.yaml;

import lombok.Data;

import java.util.List;

/**
 * @program: Child
 * @description:
 * @author: wangf-q
 * @date: 2019-10-17 08:55
 **/
@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friends;
}
