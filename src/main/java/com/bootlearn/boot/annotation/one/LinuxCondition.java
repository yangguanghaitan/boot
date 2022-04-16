package com.bootlearn.boot.annotation.one;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Auther d
 * @Date 2022/4/15 17:46
 * @Describe
 **/

public class LinuxCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取系统环境的属性
        String systemName = context.getEnvironment().getProperty("os.name");
        if(systemName.contains("Linux")){
            return true;
        }
        return false;
    }
}

//自定义一个判断条件
 class WindowsCondition implements Condition {

    /*
     * ConditionContext context: spring容器上下文环境
     * AnnotatedTypeMetadata metadata ：@Conditional修饰类型信息
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        String systemName = context.getEnvironment().getProperty("os.name");
        if(systemName.contains("Windows")){
            return true;
        }
        return false;
    }

}

 class OsxCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String property = context.getEnvironment().getProperty("os.name");
        if(property.equals("Mac OS X")){
            return true;
        }
        return false;
    }
}

