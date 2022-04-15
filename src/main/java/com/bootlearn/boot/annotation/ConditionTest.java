package com.bootlearn.boot.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther d
 * @Date 2022/4/15 17:48
 * @Describe
 **/

public class ConditionTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for(String name : names){
            System.out.println("name = " + name);
        }
    }
}

