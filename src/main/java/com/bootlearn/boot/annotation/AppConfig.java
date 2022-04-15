package com.bootlearn.boot.annotation;

import com.bootlearn.boot.annotation.domain.Parent;
import com.bootlearn.boot.annotation.domain.Student;
import com.bootlearn.boot.annotation.domain.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther d
 * @Date 2022/4/15 17:48
 * @Describe
 **/

@Configuration
public class AppConfig {

    @Conditional(OsxCondition.class)
    @Bean
    public Student student(){
        return new Student();
    }

    @Conditional(LinuxCondition.class)
    @Bean
    public Teacher teacher(){
        return new Teacher();
    }

    @Conditional(WindowsCondition.class)
    @Bean
    public Parent parent(){
        return new Parent();
    }
}

