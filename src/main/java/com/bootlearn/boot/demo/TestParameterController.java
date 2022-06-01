package com.bootlearn.boot.demo;

import com.bootlearn.boot.domain.DataVo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther d
 * @Date 2022/5/31 10:35
 * @Describe 请求参数类型与后台接受对应的测试
 **/
@Controller
@RequestMapping("/parameter")
public class TestParameterController {

    @RequestMapping(value = "/array01", method = RequestMethod.POST)
    @ResponseBody
    public Integer[] testArray(@RequestBody String iddds) throws JsonProcessingException {
        //Integer umaiId = Integer.parseInt(JSON.parseObject(str).get("umaiId").toString());
        //List<UserApplyDetailInfo> userApplyDetailInfos = JSON.parseArray(JSON.parseObject(str).getString("userApplyDetailInfos"), UserApplyDetailInfo.class);
        System.out.println(iddds + "aaaa");
        ObjectMapper mapper = new ObjectMapper();
        Integer[] integers = mapper.readValue(iddds, Integer[].class);
        return integers;
    }

    /**
     * @param dataVo
     * @return java.lang.String
     * @author d
     * @date 2022/6/1 9:31
     * @Description 用实体类接受json类型的参数
     **/
    @RequestMapping(value = "/jsonStr", method = RequestMethod.POST)
    @ResponseBody
    public String testJSonStr(DataVo dataVo) {

        return dataVo.getConfigCode() + "=" + dataVo.getConfigGroupId() + "=" + dataVo.getConfigName();
    }

    /**
     * @param configName
     * @param configGroupId
     * @param configCode
     * @return java.lang.String
     * @author d
     * @date 2022/6/1 9:32
     * @Description 用单个字段接受json参数
     **/
    @RequestMapping(value = "/jsonStr2", method = RequestMethod.POST)
    @ResponseBody
    public String testJSonStr(@RequestBody String configName,  int configGroupId, String configCode) {

        return configName + "=" + configGroupId + "=" + configCode;
    }
}
