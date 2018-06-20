package com.supplier.api.commodity.itf;

/**
 * Created by Hai on 2018/6/19.
 */

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@FeignClient(value = "supplier-commodity")//serviceId,及在eureka上注册得应用名称
public interface CommodityServiceApi {
    //要注册得controller方法得url,必须完全相同
    @RequestMapping(value = "/commodity/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}