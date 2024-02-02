//package com.bootlearn.boot;
//
//import com.bootlearn.boot.demo.TestController;
//import com.ddcb.HelloService;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
//import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
//import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
//import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
//import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
///**
// * @Auther d
// * @Date 2022/4/16 7:58
// * @Describe
// **/
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class RestTemplateTest {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    @DisplayName("测试发送请求")
//    void testHome() {
//        ResponseEntity<String> entity = this.restTemplate.getForEntity("/sayHello", String.class);
//        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
//        assertThat(entity.getBody()).isEqualTo("good-tomyyy");
//    }
//
//
//    @Configuration(proxyBeanMethods = false)
//    @Import({ ServletWebServerFactoryAutoConfiguration.class, DispatcherServletAutoConfiguration.class,
//            WebMvcAutoConfiguration.class, HttpMessageConvertersAutoConfiguration.class,
//            PropertyPlaceholderAutoConfiguration.class })
//    @ComponentScan(basePackageClasses = { TestController.class, HelloService.class })
//    public static class NonAutoConfigurationSampleTomcatApplication {
//
//        public static void main(String[] args) {
//            SpringApplication.run(BootApplication.class, args);
//			System.out.println(1111);
//        }
//
//    }
//}
