package com.bootlearn.boot.vue.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Auther d
 * @Date 2022/3/3 21:10
 * @Describe 常见食品
 **/
@Data
@AllArgsConstructor
public class OftenGoods {
   private int goodsId;
   private String goodsName;
   private int price;
}
