package com.jiang.springcloud.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jiangxia
 * @date 2022年01月22日 20:12
 */
@RestController
@RequestMapping("/ribbon")
@RefreshScope //实现对象属性的的动态更新
public class ConsumerRibbonController {
    @Autowired
    //RestTemplate 是从 Spring3.0 开始支持的一个 HTTP 请求工具，
    // 它提供了常见的REST请求方案的模版，例如 GET 请求、POST 请求、
    // PUT 请求、DELETE 请求以及一些通用的请求执行方法 exchange
    // 以及 execute。RestTemplate 继承自 InterceptingHttpAccessor
    // 并且实现了 RestOperations 接口，其中 RestOperations 接口定义
    // 了基本的 RESTful 操作，这些操作在 RestTemplate 中都得到了实现。
    // 接下来我们就来看看这些操作方法的使用。
    public RestTemplate restTemplate;
    /**
     *
     * @author jiangxia
     * @date： 2022/1/22 20:13
     * @param： No such property: code for class: Script1
     * @return： No such property: code for class: Script1
     * @description:调用service1的/service/test接口
     */
    @RequestMapping("/service1")
    public String callservice1(String orderid){
        return restTemplate.getForObject("http://nacos-service1/service/test?orderid=" + orderid, String.class);
    }

    /**
     *
     * @author jiangxia
     * @date 2022/1/22 20:20
     * @param: No such property: code for class: Script1
     * @return: No such property: code for class: Script1
     * @description:调用service2的/service/test接口
     */
    @RequestMapping("/service2")
    public String callservice2(String orderid){
        return restTemplate.getForObject("http://nacos-service2/service/test?orderid=" + orderid, String.class);
    }

    /**
     *
     * @author jiangxia
     * @date 2022/1/22 20:20
     * @param: No such property: code for class: Script1
     * @return: No such property: code for class: Script1
     * @description:同时调service1和service2的/service/test接口
     */
    @RequestMapping("/both")
    public String callboth(String orderid) {
        String res = restTemplate.getForObject("http://nacos-service1/service/test?orderid=" + orderid, String.class);
        res += "<br/>" + restTemplate.getForObject("http://nacos-service2/service/test?orderid=" + orderid, String.class);
        return res;
    }


}
