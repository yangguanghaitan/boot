package com.bootlearn.boot.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther d
 * @Date 2022/3/10 11:52
 * @Describe
 **/
@Controller
public class TestThymeleafController {

    @GetMapping("/thyme")
    public String getThymeleaf(Long id,Map map) {
        map.put("aa","123");
        return "thyme";
    }
}
