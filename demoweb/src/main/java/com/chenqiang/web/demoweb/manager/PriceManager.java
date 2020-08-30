package com.chenqiang.web.demoweb.manager;

import com.chenqiang.price.entity.Price;
import com.chenqiang.price.enums.CalculateType;
import com.chenqiang.price.service.CalculateService;
import com.chenqiang.web.demoweb.delegate.CalculateDelegate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 21:33
 * @Description
 */
@Component
public class PriceManager {
    @Resource
    private CalculateDelegate calculateDelegate;

    public Long addPrice(Long priceA, Long priceB){
        Price a = new Price();
        a.setSellPrice(priceA);

        Price b= new Price();
        b.setSellPrice(priceB);
        return calculateDelegate.handle(a,b, CalculateType.ADD.getName());
    }
}
