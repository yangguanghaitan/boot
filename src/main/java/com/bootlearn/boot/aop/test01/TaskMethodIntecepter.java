package com.bootlearn.boot.aop.test01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @Auther d
 * @Date 2022/2/19 14:39
 * @Describe 接口是@aroundadvice功能
 **/
public class TaskMethodIntecepter implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("执行前");
        try {
            Object proceed = invocation.proceed();
            Method method = invocation.getMethod();
            System.out.println("拦截的方法名:"+method.getName());
            System.out.println("执行后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            System.out.println("最后finally执行了");
        }
        return null;
    }
}
