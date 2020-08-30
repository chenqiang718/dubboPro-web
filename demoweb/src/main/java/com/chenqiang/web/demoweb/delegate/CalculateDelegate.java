package com.chenqiang.web.demoweb.delegate;

import com.chenqiang.price.common.Result;
import com.chenqiang.price.entity.Price;
import com.chenqiang.price.enums.ResultCodeType;
import com.chenqiang.price.exception.BusinessException;
import com.chenqiang.price.service.CalculateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 陈强
 * @Date: 2020/8/30 21:37
 * @Description 委托层，处理rpc调用
 */
@Service
public class CalculateDelegate {
    @Resource
    private CalculateService calculateService;

    public Long handle(Price a, Price b, String handle){
        try {
            Result<Long> result = calculateService.handle(a, b,handle);
            if(result == null){
                throw new BusinessException("dubbo error");
            }
            if (ResultCodeType.ERROR.getCode() == result.getCode() || result.getData() == null){
                throw new BusinessException(result.getDesc());
            }
            return result.getData();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
