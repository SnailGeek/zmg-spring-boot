package com.zimug.bootlaunch.controller;

import com.zimug.bootlaunch.service.LombokPOJOservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: LombokTestController
 * @description:
 * @author: wangf-q
 * @date: 2019-10-15 09:09
 **/
@RestController
public class LombokTestController {

    @Autowired
    private LombokPOJOservice lombokPOJOservice;

    @GetMapping("/lombok")
    public String testLombok() {
        return lombokPOJOservice.testLombok();
    }
}
