package com.chendeyuan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 简单的服务消费方式，如果不配置服务消费的规则的话;
 * Eureka负责服务的注册与发现，Ribbon负责服务的消费，默认情况下Eureka已经集成了Ribbon的功能，因此只需要引用Eureka之后即可以进行消费
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringcloudApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudApplication.class, args);
    }
}
