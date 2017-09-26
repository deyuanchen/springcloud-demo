package com.chendeyuan.springcloud.client;

import com.chendeyuan.springcloud.bean.User;
import com.chendeyuan.springcloud.feignclientconfig.ExcludeFromComponent;
import com.chendeyuan.springcloud.feignclientconfig.FooConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by chendeyuan on 2017/8/26.
 */
@FeignClient(name = "user-server-provider", configuration = FooConfiguration.class)
@ExcludeFromComponent
public interface UserFeignClient {

    @RequestLine("GET /user/{id}")
    User getById(@Param("id") String id);

}
