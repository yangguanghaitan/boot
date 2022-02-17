package com.bootlearn.boot.lifeCycle;


import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author d
 * @date 2022/2/16 10:52
 * @Describe   spring bean的生命周期
 *             1，{@link BeanFactoryPostProcessor}:插手bean工厂的容器启动最后阶段,当有多个时，实现
 *             {@link org.springframework.core.Ordered},指定bean工厂后置处理器的执行顺序，
 *
 *             常用的实现类 {@link org.springframework.context.support.PropertySourcesPlaceholderConfigurer}和
 *             {@link org.springframework.beans.factory.config.PropertyOverrideConfigurer}和
 *             {@link org.springframework.beans.factory.config.CustomEditorConfigurer};
 *
 *             2，
 *
 **/
public class BeanLifeCycle {

    public static void main(String[] args) {

        System.out.println("现在开始初始化容器");

        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("容器初始化成功");
        //得到Preson，并使用
        Person person =   factory.getBean("person", Person.class);
        System.out.println(person);

        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext)factory).registerShutdownHook();
    }
}
