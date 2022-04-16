package com.bootlearn.boot.demo;


import com.ddcb.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {

    @Value("${person.name:Hello World}")
    private String message = "Hello World";

    @GetMapping("/article/{id}")
    public @ResponseBody
    String getArticle(@PathVariable Long id) {
        return "你好"+id+message;
    }

    //     测试手写starter
    @Autowired
    HelloService helloService;

    @GetMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
        return helloService.sayHello("tom");
    }

    //测试表单提交
    @RequestMapping(value = "/user/saveUser", method = RequestMethod.POST)
    public String saveUser(String name, String age, HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            System.out.println(name + "===" + age);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/sayHello";
    }
}
