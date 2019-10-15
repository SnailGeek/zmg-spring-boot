package com.zimug.bootlaunch.service.impl;

import com.zimug.bootlaunch.entity.LombokPOJO;
import com.zimug.bootlaunch.service.LombokPOJOservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: LombokPOJOServiceImpl
 * @description:
 * @author: wangf-q
 * @date: 2019-10-15 09:04
 **/
@Service
@Slf4j
public class LombokPOJOServiceImpl implements LombokPOJOservice {

    @Override
    public String testLombok() {
        /**
         * @Builder
         * 注解之后就可以使用这个语法创建一个pojo对象
         **/
        LombokPOJO lombokPOJO = LombokPOJO.builder().name("zhang").age(22).build();

        /**
         * @Data
         **/
        String name = lombokPOJO.getName();
        Integer age = lombokPOJO.getAge();

        /**
         * @ToString
         **/
        String lombokPOJOInfo = lombokPOJO.toString();

        /**
         * @AllArgsConstructor
         **/
        LombokPOJO lombokPOJOAllArgs = new LombokPOJO("testAllargs", 22);
        log.info(lombokPOJOAllArgs.toString());

        /**
         * @NoAargsConstructor
         **/
        log.info(new LombokPOJO().toString());
        return "name: " + name + ", age: " + age + ", info: " + lombokPOJOInfo;
    }
}
