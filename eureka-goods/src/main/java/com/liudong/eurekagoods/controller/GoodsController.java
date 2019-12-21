package com.liudong.eurekagoods.controller;

import com.liudong.eurekagoods.service.GoodsService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/getOrderNumber")
    public String getOrderNumber(String goodsName,Integer id){
        Integer orderId = goodsService.getOrderNumber(id);
        return "订单ID=" + orderId+",商品="+goodsName;
    }
}
