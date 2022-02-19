package com.bootlearn.boot.aop.test01;

/**
 * @Auther d
 * @Date 2022/2/19 14:37
 * @Describe
 **/
public class TaskImpl implements Task{
    @Override
    public void execute(String name) {
        System.out.println("execute方法执行了");
    }
}
