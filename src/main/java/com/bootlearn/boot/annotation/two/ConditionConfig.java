package com.bootlearn.boot.annotation.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @Auther d
 * @Date 2022/4/16 11:41
 * @Describe
 **/
@Configuration
public class ConditionConfig {


    @Bean
    @ConditionalOnLinux(environment = "linux")
    public Environment linuxEnvironment() {
        return new LinuxEnvironment();
    }
}
