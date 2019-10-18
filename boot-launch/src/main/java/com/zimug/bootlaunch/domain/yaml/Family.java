package com.zimug.bootlaunch.domain.yaml;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: Family
 * @description:
 * @author: wangf-q
 * @date: 2019-10-17 08:53
 **/
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "family")
public class Family {

//    @Value("${family.family-name}")
    private String familyName;

    private Father father;

    private Mother mother;

    private Child child;

}
