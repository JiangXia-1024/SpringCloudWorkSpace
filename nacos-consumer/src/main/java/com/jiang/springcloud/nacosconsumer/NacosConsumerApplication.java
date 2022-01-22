package com.jiang.springcloud.nacosconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients //使用注解@EnableFeignClients启用feign客户端
public class NacosConsumerApplication {

    /**
     *
     * @author jiangxia
     * @date 2022/1/22 16:49
     * @param: No such property: code for class: Script1
     * @return: No such property: code for class: Script1
     * @description: 使用RestTemplate+ribbon方式调用微服务
     */
    @LoadBalanced //开启负载均衡的功能
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {

        SpringApplication.run(NacosConsumerApplication.class, args);
    }

}
