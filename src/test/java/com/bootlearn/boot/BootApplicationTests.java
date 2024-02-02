/*
package com.bootlearn.boot;

import com.bootlearn.boot.demo.TestController;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@DisplayName("测试类")
@SpringBootTest
class BootApplicationTests {

    @Autowired
    TestController testController;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testSpringController(){
        Assertions.assertNotEquals(testController,null,"testController不是null");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName=="+beanDefinitionName);
        }
        TestController testController1 = applicationContext.getBean("testController", TestController.class);
        Assertions.assertEquals(testController1,testController);
    }

    @BeforeAll
    public static void testBeforAll(){
        System.out.println("@BeforeAll");
    }
    @AfterAll
    public static void testAfterAll(){
        System.out.println("AfterAll");
    }
    @BeforeEach
    public void testBeforeEach(){
        System.out.println("BeforeEach");
    }
    @AfterEach
    public void testAfterEach(){
        System.out.println("AfterEach");
    }
    @Test
    public void test001(){
        System.out.println(111);
    }
    @Test
    public void test002(){
        System.out.println(222);
    }
    @DisplayName("出异常了")
    @Test
    public void test003(){
        throw new RuntimeException("异常");
    }

}
*/
