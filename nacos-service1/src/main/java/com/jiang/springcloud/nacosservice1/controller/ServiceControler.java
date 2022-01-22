package com.jiang.springcloud.nacosservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangxia
 * @date 2022年01月22日 20:45
 */
@RestController
@RequestMapping("/service")
public class ServiceControler {
    @GetMapping("/test")
    public String test(String orderid) {
        System.out.println("service1_test" + orderid);
        return "service1_" + orderid;
    }
}
