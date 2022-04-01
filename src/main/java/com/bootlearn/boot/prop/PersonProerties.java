package com.bootlearn.boot.prop;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther d
 * @Date 2022/4/1 16:34
 * @Describe
 **/
@ConfigurationProperties(prefix = "person")
@Configuration
@Data
public class PersonProerties {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
