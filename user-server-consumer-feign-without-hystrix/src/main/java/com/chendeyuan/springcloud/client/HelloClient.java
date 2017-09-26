package com.chendeyuan.springcloud.client;

import com.chendeyuan.springcloud.bean.User;
import config.WithoutHyxstricConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by chendeyuan on 2017/8/29.
 */
@FeignClient(name = "user-server-provider", configuration = WithoutHyxstricConfiguration.class, fallbackFactory = HelloClientFallbackFactory.class)
public interface HelloClient {

    @RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
    User getById(@PathVariable("id") String id);
}
