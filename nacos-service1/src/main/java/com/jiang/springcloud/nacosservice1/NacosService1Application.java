package com.jiang.springcloud.nacosservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient和@EnableEurekaClient共同点就是：都是能够让注册中心能够发现，扫描到改服务。
@EnableDiscoveryClient
public class NacosService1Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosService1Application.class, args);
    }

}
