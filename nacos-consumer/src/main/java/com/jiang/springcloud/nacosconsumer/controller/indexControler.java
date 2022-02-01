package com.jiang.springcloud.nacosconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangxia
 * @date 2022年01月22日 20:21
 */
@RestController
public class indexControler {
    @GetMapping("/")
    public String index(){
        return "/config/get?key=[key]:获取单个配置";
    }
}
