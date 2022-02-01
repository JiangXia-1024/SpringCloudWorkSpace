package com.jiang.springcloud.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangxia
 * @date 2022年01月22日 16:51
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Autowired
    public Environment environment;

    /**
     *
     * @author jiangxia
     * @date 2022/1/22 16:53
     * @param: key 单个配置的路径
     * @return: No such property: code for class: Script1
     * @description: 测试获取配置
     */
    @RequestMapping("/get")
    public String getconfig(String key) {
        Object obj = environment.getProperty(key, "not found");
        return obj.toString();
    }
}
