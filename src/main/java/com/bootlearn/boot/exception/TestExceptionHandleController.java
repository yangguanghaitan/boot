package com.bootlearn.boot.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.RequestMapping;

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

    /*@RequestMapping("testException")
    public String testException() throws Exception{
        throw new MissingServletRequestParameterException("name","String");
    }

    @RequestMapping("testMyException")
    public String testMyException() throws MyException {
        throw new MyException("i am a myException");
    }*/


}
