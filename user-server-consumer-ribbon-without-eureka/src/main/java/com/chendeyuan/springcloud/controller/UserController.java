package com.chendeyuan.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chendeyuan on 2017/7/26.
 */
@RestController
@RequestMapping(value = "/user/wituoht-eureka")
public class UserController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * 使用负载均衡的方式显示消费的那一他主机的服务
     */
    @GetMapping(value = "/loadBalancerClient")
    public void loadBalancerClient() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("user-server-provider");
        System.out.println(serviceInstance.getHost() + ":" + serviceInstance.getPort());
    }

}
