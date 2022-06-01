package com.bootlearn.boot.domain;

import lombok.Data;

/**
 * @Auther d
 * @Date 2022/6/1 9:16
 * @Describe 测试前端发送json，后端接受json
 **/
@Data
public class DataVo {
    private String configName;
    private int configGroupId;
    private String configCode;

}
