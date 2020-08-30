package com.chenqiang.web.demoweb.controller;

import com.chenqiang.price.entity.Price;
import com.chenqiang.price.exception.BusinessException;
import com.chenqiang.web.demoweb.manager.PriceManager;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 21:19
 * @Description
 */
@RestController
@RequestMapping("price")
public class PriceController {
    @Resource
    PriceManager priceManager;

    public Long addPrice(@RequestParam Long priceA, @RequestParam Long priceB){
        if(priceA == null){
            throw new BusinessException("priceA参数不正确");
        }

        if (priceB == null){
            throw new BusinessException("priceB参数不正确");
        }

        return priceManager.addPrice(priceA,priceB);
    }
}
