package com.jiang.spingcloud.nacosservice2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangxia
 * @date 2022年01月22日 20:48
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {
    @Autowired
    private Environment environment;

    /**
     * 测试获取配置
     * @param key 单个配置的路径
     * @return
     */
    @RequestMapping("/getconfig")
    public String getconfig(String key) {
        Object obj = environment.getProperty(key, "not found");
        return obj.toString();
    }
}
