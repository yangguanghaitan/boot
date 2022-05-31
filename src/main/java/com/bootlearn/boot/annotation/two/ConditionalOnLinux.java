package com.bootlearn.boot.annotation.two;


import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Conditional(LINUXCondition.class)
public @interface ConditionalOnLinux {
    //标注是哪个环境
    String environment() default "";
}
