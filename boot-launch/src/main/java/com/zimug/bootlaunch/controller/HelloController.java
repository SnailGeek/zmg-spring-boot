package com.zimug.bootlaunch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: HelloController
 * @description:
 * @author: wangf-q
 * @date: 2019-10-15 08:51
 **/
@RestController
public class HelloController {

    @GetMapping("/hi")
    public String hello(@RequestParam("name") String name){
        return "hello world, " + name;
    }
}
