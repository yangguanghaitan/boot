package com.bootlearn.boot.exception;


import com.bootlearn.boot.exception.common.BusinessException;
import com.bootlearn.boot.exception.common.DemoModeException;
import com.bootlearn.boot.exception.common.domain.AjaxResult;
import com.bootlearn.boot.exception.utils.ServletUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author d
 * @date 2022/3/7 11:33
 * @describe 全局异常处理器
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 权限校验失败 如果请求为ajax返回json，普通请求跳转页面
     */
   /* @ExceptionHandler(AuthorizationException.class)
    public Object handleAuthorizationException(HttpServletRequest request, AuthorizationException e) {
        log.error(e.getMessage(), e);
        if (ServletUtils.isAjaxRequest(request)) {
            return AjaxResult.error(PermissionUtils.getMsg(e.getMessage()));
        } else {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("error/unauth");
            return modelAndView;
        }
    }*/

    /**
     * 请求方式不支持
     */
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public Object handleException(HttpRequestMethodNotSupportedException e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errorMessage", e.getMessage());
        modelAndView.setViewName("error/exce");
        return  modelAndView;
//        return modelAndView;
//        log.error(e.getMessage(), e);
//        return AjaxResult.error("不支持' " + e.getMethod() + "'请求");
    }

    /**
     * 拦截未知的运行时异常
     */
    @ExceptionHandler(RuntimeException.class)
    public AjaxResult notFount(RuntimeException e) {
        log.error("运行时异常:", e);
        return AjaxResult.error("运行时异常:" + e.getMessage());
    }

    /**
     * 系统异常
     */
    @ExceptionHandler(Exception.class)
    public AjaxResult handleException(Exception e) {
        log.error(e.getMessage(), e);
        return AjaxResult.error("服务器错误，请联系管理员");
    }

    /**
     * 业务异常
     */
    @ExceptionHandler(BusinessException.class)
    public Object businessException(HttpServletRequest request, BusinessException e) {
        log.error(e.getMessage(), e);
        //todo 判断是否为Ajax请求
        if (ServletUtils.isAjaxRequest(request)) {
            return AjaxResult.error(e.getMessage());
        } else {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("errorMessage", e.getMessage());
            //todo 通过modelAndView绕过@ResponseBody，进如视图解析器到达页面
            modelAndView.setViewName("error/business");
            return modelAndView;
        }
    }

    /**
     * 自定义验证异常
     */
    @ExceptionHandler(BindException.class)
    public AjaxResult validatedBindException(BindException e) {
        log.error(e.getMessage(), e);
        String message = e.getAllErrors().get(0).getDefaultMessage();
        return AjaxResult.error(message);
    }

    /**
     * 演示模式异常
     */
    @ExceptionHandler(DemoModeException.class)
    public AjaxResult demoModeException(DemoModeException e) {
        return AjaxResult.error("演示模式，不允许操作");
    }

    /**
     * @author d
     * @date 2022/3/8 22:47
     * @Describe 全局数据
     * @return java.util.Map<java.lang.String,java.lang.Object>
     **/
    @ModelAttribute(name = "md")
    public Map<String,Object> getGlobalData(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("age", 99);
        map.put("gender", "男");
        return map;
    }

}
