package com.bootlearn.boot.demo;


import com.ddcb.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Enumeration;

@Controller
public class TestController {


    @GetMapping("/article/{id}")
    public @ResponseBody
    String getArticle(@PathVariable Long id) {
        return "你好"+id;
    }

    //     测试手写starter
    @Autowired
    HelloService helloService;

    @GetMapping("/sayHello")
    @ResponseBody
    public void sayHello() {
        System.out.println(helloService.sayHello("tom"));
    }

}
