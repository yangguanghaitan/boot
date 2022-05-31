package com.bootlearn.boot.annotation;

import com.bootlearn.boot.annotation.one.AppConfig;
import com.bootlearn.boot.annotation.two.ConditionConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Conditional;

/**
 * @Auther d
 * @Date 2022/4/15 17:48
 * @Describe 本包 {@link com.bootlearn.boot.annotation.one}测试 {@link Conditional}注解
 * @Describe 本包 {@link com.bootlearn.boot.annotation.two}测试 {@link Conditional}的派生注解
 **/

public class ConditionTest {

    public static void main(String[] args) {
        //@Conditional注解
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for(String name : names){
            System.out.println("name = " + name);
        }
        //@Conditional的派生注解
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(ConditionConfig.class);
        String[] names2 = context2.getBeanDefinitionNames();
        for(String name : names2){
            System.out.println("name = " + name);
        }
    }
}

