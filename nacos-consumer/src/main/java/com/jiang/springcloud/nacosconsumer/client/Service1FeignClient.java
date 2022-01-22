package com.jiang.springcloud.nacosconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jiangxia
 * @date 2022年01月22日 16:41
 */
@FeignClient("nacos-service1")
public interface Service1FeignClient {
    @GetMapping("service/test")
    String test(@RequestParam(value = "orderid")String orderid);
}
