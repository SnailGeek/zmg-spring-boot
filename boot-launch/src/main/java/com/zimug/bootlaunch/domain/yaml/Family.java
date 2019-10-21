package com.zimug.bootlaunch.domain.yaml;

import com.zimug.bootlaunch.config.MixPropertySourceFactory;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

/**
 * @program: Family
 * @description:
 * @author: wangf-q
 * @date: 2019-10-17 08:53
 **/
@Data
@ToString
@Component
/**
 * 关于@Validated 的注意事项
 * 1、完成属性装配过程中的校验
 * 2、可以嵌套，如在Friend中可以添加对性别的不能为空的校验
 * 3、如果使用@Value进行属性的注入则不能使用属性校验
 **/
@Validated
@ConfigurationProperties(prefix = "family")
@PropertySource(value = {"classpath:family.yml"}, factory = MixPropertySourceFactory.class)
//@PropertySource(value = {"classpath:family.properties"} 如果加载外部的配置文件是properties，不需要重写配置类，只加这句即可
public class Family {

//    @Value("${family.family-name}")
    @NotEmpty
    private String familyName;

    private Father father;

    private Mother mother;

    private Child child;

}
