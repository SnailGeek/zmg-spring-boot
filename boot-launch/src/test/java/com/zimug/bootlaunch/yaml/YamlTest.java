package com.zimug.bootlaunch.yaml;

import com.zimug.bootlaunch.domain.yaml.Family;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: YamlTest
 * @description:
 * @author: wangf-q
 * @date: 2019-10-17 09:06
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class YamlTest {

    @Autowired
    Family family;

    @Test
    public void testFamily(){
        System.out.println(family.toString());
    }
}
