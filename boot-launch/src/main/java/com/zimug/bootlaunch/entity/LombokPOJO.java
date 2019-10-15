package com.zimug.bootlaunch.entity;

import lombok.*;

/**
 * @program: LombokPOJOservice
 * @description:
 * @author: wangf-q
 * @date: 2019-10-15 09:02
 **/
@Data
@ToString
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class LombokPOJO {
    private String name;
    private Integer age;
}
