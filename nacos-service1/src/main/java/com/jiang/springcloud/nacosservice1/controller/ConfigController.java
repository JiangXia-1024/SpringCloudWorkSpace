package com.jiang.springcloud.nacosservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangxia
 * @date 2022年01月22日 20:37
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {
    @Autowired
    private Environment environment;

    /**
     *
     * @author jiangxia
     * @date 2022/1/22 20:40
     * @param： 获取单个配置的路径
     * @return No such property: code for class: Script1
     * @description：测试获取配置
     */
    @RequestMapping("/getconfig")
    public String getconfig(String key){
        Object object = environment.getProperty(key,"not found");
        return object.toString();
    }
}
