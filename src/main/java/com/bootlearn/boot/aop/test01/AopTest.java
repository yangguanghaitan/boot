package com.bootlearn.boot.aop.test01;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

/**
 * @Auther d
 * @Date 2022/2/19 14:35
 * @Describe 测试aop功能
 **/
public class AopTest {
    public static void main(String[] args) {
        //目标类
        TaskImpl task = new TaskImpl();
        //代理工厂，织入器weaver
        ProxyFactory proxyFactory=new ProxyFactory();
        //目标类
        proxyFactory.setTarget(task);
        //目标类实现的接口
        proxyFactory.setInterfaces(new Class[]{Task.class});
        //切面aspect
        NameMatchMethodPointcutAdvisor advisor=new NameMatchMethodPointcutAdvisor();
        //切点，pointcut
        advisor.setMappedName("execute");
        //通知
        advisor.setAdvice(new TaskMethodIntecepter());

        proxyFactory.addAdvisor(advisor);

        Task proxy = (Task) proxyFactory.getProxy();
        proxy.execute("小明");
    }

}
