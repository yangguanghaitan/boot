package com.bootlearn.boot.vue.busness;

import com.bootlearn.boot.vue.domain.OftenGoods;
import com.bootlearn.boot.vue.domain.Type0Goods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther d
 * @Date 2022/3/3 20:58
 * @Describe vue接口对应后端
 **/
@Controller()
@RequestMapping("/vue")
public class GoodsTest {

    @RequestMapping("/oftenGoods")
    @ResponseBody
    public Map getOftenGoods(){
        List oftenGoodsList = getOftenGoodsList();
        Map map=new HashMap();
        map.put("oftenGoods",oftenGoodsList);
        return map;
    }

    @RequestMapping("/type0Goods")
    @ResponseBody
    public Map getType0Goods(){
        List Type0GoodsList = getType0GoodsList();
        Map map=new HashMap();
        map.put("type0Goods",Type0GoodsList);
        return map;
    }












    private List getType0GoodsList() {
        List<Type0Goods> type0GoodsList=new ArrayList<>();
        type0GoodsList.add(new Type0Goods("http://g.hiphotos.baidu.com/image/pic/item/6d81800a19d8bc3e770bd00d868ba61ea9d345f2.jpg","香辣鸡腿堡","22","1"));
        type0GoodsList.add(new Type0Goods("http://b.hiphotos.baidu.com/image/pic/item/e824b899a9014c08878b2c4c0e7b02087af4f4a3.jpg","田园鸡腿堡","33","22"));
        type0GoodsList.add(new Type0Goods("http://c.hiphotos.baidu.com/image/pic/item/30adcbef76094b36de8a2fe5a1cc7cd98d109d99.jpg","和风汉堡","44","21"));
        type0GoodsList.add(new Type0Goods("http://e.hiphotos.baidu.com/image/pic/item/4bed2e738bd4b31c1badd5a685d6277f9e2ff81e.jpg","快乐全家桶","55","11"));
        type0GoodsList.add(new Type0Goods("http://g.hiphotos.baidu.com/image/pic/item/0d338744ebf81a4c87a3add4d52a6059252da61e.jpg","脆皮炸鸡腿","111","14"));
        type0GoodsList.add(new Type0Goods("http://a.hiphotos.baidu.com/image/pic/item/f2deb48f8c5494ee5080c8142ff5e0fe99257e19.jpg","魔法鸡块","222","15"));
        type0GoodsList.add(new Type0Goods("http://f.hiphotos.baidu.com/image/pic/item/4034970a304e251f503521f5a586c9177e3e53f9.jpg","可乐大杯","333","32"));
        type0GoodsList.add(new Type0Goods("http://a.hiphotos.baidu.com/image/pic/item/e824b899a9014c087eb617650e7b02087af4f464.jpg","雪顶咖啡","444","44"));
        type0GoodsList.add(new Type0Goods("http://d.hiphotos.baidu.com/image/pic/item/b58f8c5494eef01f119945cbe2fe9925bc317d2a.jpg","大块鸡米花","555","43"));
        type0GoodsList.add(new Type0Goods("http://a.hiphotos.baidu.com/image/pic/item/8d5494eef01f3a292d2472199d25bc315d607c7c.jpg","香脆鸡柳","666","54"));
        return  type0GoodsList;
    }
    public List getOftenGoodsList(){
        List<OftenGoods> oftenGoodsList=new ArrayList<>();
        OftenGoods oftenGoods1=new OftenGoods(1,"香辣鸡腿堡",180);
        OftenGoods oftenGoods2=new OftenGoods(2,"田园鸡腿堡",28);
        OftenGoods oftenGoods3=new OftenGoods(3,"和风汉堡",34);
        OftenGoods oftenGoods4=new OftenGoods(4,"快乐全家桶",44);
        OftenGoods oftenGoods5=new OftenGoods(5,"脆皮炸鸡腿",23);
        OftenGoods oftenGoods6=new OftenGoods(6,"魔法鸡块",22);
        OftenGoods oftenGoods7=new OftenGoods(17,"可乐大杯",13);
        OftenGoods oftenGoods8=new OftenGoods(14,"雪顶咖啡",56);
        OftenGoods oftenGoods9=new OftenGoods(18,"大块鸡米花",23);
        OftenGoods oftenGoods10=new OftenGoods(19,"香脆鸡柳",118);
        oftenGoodsList.add(oftenGoods1);
        oftenGoodsList.add(oftenGoods2);
        oftenGoodsList.add(oftenGoods3);
        oftenGoodsList.add(oftenGoods4);
        oftenGoodsList.add(oftenGoods5);
        oftenGoodsList.add(oftenGoods6);
        oftenGoodsList.add(oftenGoods7);
        oftenGoodsList.add(oftenGoods8);
        oftenGoodsList.add(oftenGoods9);
        oftenGoodsList.add(oftenGoods10);
        return oftenGoodsList;
    }
}
