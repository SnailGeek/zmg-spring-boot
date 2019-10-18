package com.zimug.bootlaunch.domain.yaml;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @program: Friend
 * @description:
 * @author: wangf-q
 * @date: 2019-10-17 08:59
 **/
@Data
public class Friend {
    private String hobby;

    @NotEmpty
    private String sex;
}
