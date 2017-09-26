package com.chendeyuan.springcloud.client;

import com.chendeyuan.springcloud.bean.User;
import org.springframework.stereotype.Component;

/**
 * Created by chendeyuan on 2017/8/29.
 */
@Component
public class UserHystrixClientFallback implements UserFeignHystrixClient {

    @Override
    public User getById(String id) {
        User user = new User();
        user.setId("1234567890");
        return user;
    }

}
