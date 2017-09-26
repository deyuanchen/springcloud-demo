package com.chendeyuan.springcloud.controller;

import com.chendeyuan.springcloud.bean.User;
import com.chendeyuan.springcloud.client.UserFeignHyxstrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chendeyuan on 2017/7/26.
 */
@RestController
@RequestMapping(value = "/user/feign-with-hystrix")
public class UserController {

    @Autowired
    private UserFeignHyxstrixClient userFeignHyxstrixClient;

    @GetMapping(value = "/{id}")
    public User getById(@PathVariable("id") String id) {
        return userFeignHyxstrixClient.getById(id);
    }

}
