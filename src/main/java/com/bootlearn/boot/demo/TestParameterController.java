package com.bootlearn.boot.demo;

import com.bootlearn.boot.domain.DataVo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

/**
 * @Auther d
 * @Date 2022/5/31 10:35
 * @Describe 请求参数类型与后台接受对应的测试
 **/
@Controller
@RequestMapping("/parameter")
public class TestParameterController {

    @RequestMapping(value = "/array01",method = RequestMethod.POST)
    @ResponseBody
    public Integer[] testArray(@RequestBody String iddds) throws JsonProcessingException {
    //Integer umaiId = Integer.parseInt(JSON.parseObject(str).get("umaiId").toString());
    //List<UserApplyDetailInfo> userApplyDetailInfos = JSON.parseArray(JSON.parseObject(str).getString("userApplyDetailInfos"), UserApplyDetailInfo.class);
        System.out.println(iddds+"aaaa");
        ObjectMapper mapper=new ObjectMapper();
        Integer[] integers = mapper.readValue(iddds, Integer[].class);
        return integers;
    }

    @RequestMapping(value = "/jsonStr",method = RequestMethod.POST)
    @ResponseBody
    public String testJSonStr(@RequestBody DataVo dataVo) {

        return dataVo.getConfigCode()+"="+dataVo.getConfigGroupId()+"="+dataVo.getConfigName();
    }
}
