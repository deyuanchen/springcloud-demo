package com.chendeyuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 默认的Zuul已经添加了EnableDiscoveryClient注解
 */
@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayZuulApplication.class, args);
    }
}
