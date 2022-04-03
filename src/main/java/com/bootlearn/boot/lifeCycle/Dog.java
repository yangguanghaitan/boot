package com.bootlearn.boot.lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Dog implements BeanFactoryAware, BeanNameAware,
        InitializingBean, DisposableBean {

    private String sex;
    private String age;
    private String color;

    private BeanFactory beanFactory;
    private String beanName;

    public Dog() {
        System.out.println("【构造器】调用Dog的构造器实例化");
    }

    public String getSex() {
        System.out.println("【注入属性】注入属性Sex");
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        System.out.println("【注入属性】注入属性Age");
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println("【注入属性】注入属性color");
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    // 这是BeanFactoryAware接口方法
    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        System.out
                .println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
        this.beanFactory = arg0;
    }

    // 这是BeanNameAware接口方法
    @Override
    public void setBeanName(String arg0) {
        System.out.println("【BeanNameAware接口】调用BeanNameAware.setBeanName()");
        this.beanName = arg0;
    }

    // 这是InitializingBean接口方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");
    }

    // 这是DiposibleBean接口方法
    @Override
        public void destroy() throws Exception {
        System.out.println("【DiposibleBean接口】调用DiposibleBean.destory()");
    }

    // 通过<bean>的init-method属性指定的初始化方法
    // 此方法与InitializingBean接口afterPropertiesSet()方法属于同一生命周期
    public void myInit() {
        System.out.println("【init-method】调用<bean>的init-method属性指定的初始化方法");
    }

    // 通过<bean>的destroy-method属性指定的初始化方法
    public void myDestory() {
        System.out.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
    }
}