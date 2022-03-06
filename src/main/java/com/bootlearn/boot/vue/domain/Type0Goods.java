package com.bootlearn.boot.vue.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther d
 * @Date 2022/3/4 19:49
 * @Describe  分类小商品
 **/
@Data
@AllArgsConstructor
public class Type0Goods {
    private String goodsImg;
    private String goodsName;
    private String price;
    private String goodsId;
}
