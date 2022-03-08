package com.bootlearn.boot.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther d
 * @Date 2022/3/7 12:52
 * @Describe 测试RestControllerAdvice全局异常处理器
 **/
@Controller
public class TestExceptionHandleController {

    @RequestMapping("/notSupported")
    public String testException1() throws HttpRequestMethodNotSupportedException {
        throw new HttpRequestMethodNotSupportedException("testException1()");
    }

    /**
     * @author d
     * @date 2022/3/8 22:49
     * @param model
     * @return java.lang.String
     * @Describe 全局数据
     **/
    @GetMapping("/hello")
    public String hello(Model model) {
        Map<String, Object> map = model.asMap();
        HashMap md = (HashMap) map.get("md");
        System.out.println(md);
        int i = 1 / 0;
        return "hello controller advice";
    }
    /*@RequestMapping("testException")
    public String testException() throws Exception{
        throw new MissingServletRequestParameterException("name","String");
    }

    @RequestMapping("testMyException")
    public String testMyException() throws MyException {
        throw new MyException("i am a myException");
    }*/


}
