package com.jiang.springcloud.nacosconsumer.controller;

import com.jiang.springcloud.nacosconsumer.client.Service1FeignClient;
import com.jiang.springcloud.nacosconsumer.client.Service2FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangxia
 * @date 2022年01月22日 16:54
 */
@RestController
@RequestMapping("/feign")
public class ConsumerFeignController {

    @Autowired
    Service1FeignClient service1FeignClient;
    @Autowired
    Service2FeignClient service2FeignClient;

    /**
     * @author jiangxia
     * @date 2022/1/22 20:02
     * @param: No such property: code for class: Script1
     * @return: No such property: code for class: Script1
     * @description:调用service1的/service/test接口
     */
    @RequestMapping("/service1")
    public String callservice1(String orderid){
        return service1FeignClient.test(orderid);
    }

    /**
     * @author jiangxia
     * @date 2022/1/22 20:02
     * @param: No such property: code for class: Script1
     * @return: No such property: code for class: Script1
     * @description:调用service2的/service/test接口
     */
    @RequestMapping("/service2")
    public String callservice2(String orderid){
        return service2FeignClient.test(orderid);
    }

    /**
     * @author jiangxia
     * @date 2022/1/22 20:05
     * @param： No such property: code for class: Script1
     * @return： No such property: code for class: Script1
     * @description:同时调service1和service2的/service/test接口
     */
    public String callboth(String orderid){
        String res = service1FeignClient.test(orderid);
        res+="<br/>"+service2FeignClient.test(orderid);
        return res;
    }
}
