package com.bootlearn.boot.retry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.remoting.RemoteAccessException;

import java.util.Random;

/**
 * @Auther d
 * @Date 2023/12/9 21:11
 * @Describe
 **/
@Slf4j
public class RetryDemo {

    public static boolean retryMethod(Integer param) {
        int i = new Random().nextInt(param);
        log.info("随机生成的数:{}", i);

        if (1 == i) {
            log.info("为1,返回true.");
            return true;
        } else if (i < 1) {
            log.info("小于1,抛出参数异常.");
            throw new IllegalArgumentException("参数异常");
        } else if (i > 1 && i < 10) {
            log.info("大于1,小于10,抛出参数异常.");
            return false;
        } else {
            //为其他
            log.info("大于10,抛出自定义异常.");
            throw new RemoteAccessException("大于10,抛出自定义异常");
        }
    }

}

